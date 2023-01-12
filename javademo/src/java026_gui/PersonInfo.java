package java026_gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.StringTokenizer;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PersonInfo extends JFrame 
implements MouseListener, ActionListener {
	PersonMain main;
	PersonMenu menu;
	PersonToolbar tool;
	//현재상태 파악 => crow >-1 : 수정상태, corw<0 : 수정상태 아님
	int crow=-1;

	public PersonInfo() {
		main = new PersonMain();
		menu = new PersonMenu();
		tool = new PersonToolbar();

		setJMenuBar(menu);
		add(BorderLayout.NORTH, tool);
		add(BorderLayout.CENTER, main);

		// 이벤트 리스너 연결
		main.registerB.addMouseListener(this);
		main.modifyB.addMouseListener(this);
		main.deleteB.addMouseListener(this);
		main.clearB.addMouseListener(this);
		main.table.addMouseListener(this);

		main.registerB.addActionListener(this);
		main.modifyB.addActionListener(this);
		main.deleteB.addActionListener(this);
		main.clearB.addActionListener(this);

		this.setSize(520, 550);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// end PersonInfo()//////////////////////////

	public static void main(String[] args) {
		new PersonInfo();
	}// end main()////////////////////////////////

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == main.registerB) {
			setRegister(); // 등록
		}else if(obj==main.modifyB) {
			setModify(); //수정
		}else if(obj==main.deleteB) {
			delete(); //삭제
		}else if(obj==main.clearB) {
			allClear(); //모든 컴포넌트 초기화
		}

	}// end actionPerformed///////////////////////
	
	private void allClear() {
		 setClear();
		 main.tableModel.setRowCount(0); //모든 레코드를 삭제
		 main.tableModel.setRowCount(50);//50개의 레코드를 생성
	}//end allClear()//////////////////////////////
	
	private void delete() {
		//삭제할 행 선택
		int row=main.table.getSelectedRow();
		//System.out.println(row);
		if(row<0) {
			showMessage("삭제할 레코드를 선택하세요");
			return;
		}
		
		int chk=JOptionPane.showConfirmDialog(this, "정말로 삭제하시겠습니까?","삭제",JOptionPane.YES_NO_OPTION);
		if(chk==JOptionPane.CANCEL_OPTION) {
			return;
		}
		//선택한 행 삭제		
		main.tableModel.removeRow(row);
		//행의 갯수 50개 생성
		if(main.table.getRowCount()<50)
		    main.tableModel.setRowCount(50);
		
		createNumber();
	}//end delete()/////////////////////////////////
	
	
	private void createNumber() {
		for(int i=0; i<main.table.getRowCount();i++) {
			if(main.table.getValueAt(i, 0)==null) {
				return;
			}
			main.table.setValueAt(i+1, i, 0);
		}
	}//end createNumber///////////////////////////////
	
	//입력된 데이터 초기화
	private void setClear() {
		main.nameF.setText("");
		main.tel1F.setText("");
		main.tel2F.setText("");
		main.emailF.setText("");
		main.telC.setSelectedIndex(0);
		main.manR.setSelected(true);
		// 커서위치
		main.nameF.requestFocus();
		
	}//end setClear()///////////////////////////////s
	
	private void setModify() {
		if(crow<0) {
			showMessage("수정할 레코드를 먼저 선택해 주세요");
			return;
		}
		
		String name = main.nameF.getText().trim();
		String sex = main.manR.isSelected() ? "남" : "여";
		String tel1 = (String) main.telC.getSelectedItem(); // .toString();
		String tel2 = main.tel1F.getText().trim();
		String tel3 = main.tel2F.getText().trim();
		String email = main.emailF.getText().trim();
		
		main.table.setValueAt(name, crow, 1);
		main.table.setValueAt(sex, crow, 2);
		main.table.setValueAt(tel1 + "-" + tel2 + "-" + tel3, crow, 3);
		main.table.setValueAt(email,crow, 4);
		
		crow=-1;
		setClear();
	}//end setModify()///////////////////////////////////

	private void setRegister() {
		if(crow>-1) {
			showMessage("이미 등록된 레코드입니다.");
			return;
		}
		
		String name = main.nameF.getText().trim();
		String sex = main.manR.isSelected() ? "남" : "여";
		String tel1 = (String) main.telC.getSelectedItem(); // .toString();
		String tel2 = main.tel1F.getText().trim();
		String tel3 = main.tel2F.getText().trim();
		String email = main.emailF.getText().trim();

		for (int i = 0; i < main.table.getRowCount(); i++) {
			if (main.table.getValueAt(i, 0) == null) {
				main.table.setValueAt(Integer.toString(i + 1), i, 0);
				main.table.setValueAt(name, i, 1);
				main.table.setValueAt(sex, i, 2);
				main.table.setValueAt(tel1 + "-" + tel2 + "-" + tel3, i, 3);
				main.table.setValueAt(email, i, 4);
				break;
			}

		}
		
		setClear();
	}// end setRegister()//////////////////////////
	
	private void setInputRecord() {
		//더블클릭한 레코드의 행값을 얻는다.
		int row=main.table.getSelectedRow();
		if(row<0 || main.table.getValueAt(row, 0)==null) {
			showMessage("등록되지 않은 레코드입니다.");
			return;
		}
		
		crow=row;
		main.nameF.setText(main.table.getValueAt(row, 1).toString());
		String sex=main.table.getValueAt(row, 2).toString();
		if(sex.equals("남"))
			main.manR.setSelected(true);
		else
			main.womanR.setSelected(true);
		
		String[] tel=main.table.getValueAt(row, 3).toString().split("-");
		main.telC.setSelectedItem(tel[0]);
		main.tel1F.setText(tel[1]);
		main.tel2F.setText(tel[2]);
		
		main.emailF.setText(main.table.getValueAt(row, 4).toString());
		
		
	}//end setInputRecord()
	
	
	private void showMessage(String message) {
		JOptionPane.showMessageDialog(this, message);
	}//end showMessage()

	@Override
	public void mouseClicked(MouseEvent e) {
		Object obj=e.getSource();
		if (obj == main.table && e.getClickCount() == 2) {
			setInputRecord();
		}			
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		Object obj = e.getSource();
		if (obj == main.registerB)
			main.registerB.setText("Register");
		else if (obj == main.modifyB)
			main.modifyB.setText("Modify");
		else if (obj == main.deleteB)
			main.deleteB.setText("Delete");
		else if (obj == main.clearB)
			main.clearB.setText("Clear");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		Object obj = e.getSource();
		if (obj == main.registerB)
			main.registerB.setText("등록");
		else if (obj == main.modifyB)
			main.modifyB.setText("수정");
		else if (obj == main.deleteB)
			main.deleteB.setText("삭제");
		else if (obj == main.clearB)
			main.clearB.setText("초기화");
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

}// end class
