package java025_jdbc;

import java.util.List;
import java.util.Scanner;

public class Java224_jdbc {
  public static void main(String[] args) {
	MemController mController = new MemController();
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("====================================");
		System.out.printf("1 리스트, 2 삽입, 3 수정, 4 삭제, 0 종료 : ");
		int input = Integer.parseInt(sc.nextLine());
		
		if(input == 1) {
			//리스트
			listCall(mController);		
		}else if(input == 2) {
			//삽입
			insertCall(mController, sc);
			listCall(mController);	
		}else if(input == 3) {
			//수정
			updateCall(mController, sc);
			listCall(mController);
		}else if(input == 4) {
			//삭제
			deleteCall(mController, sc);
			listCall(mController);
		}else if(input ==0) {
			//종료
			System.out.println("시스템 종료");
			System.exit(0);
		}
	}
	 
  }//end main()
  
  private static void insertCall(MemController mController, Scanner sc) {
	  System.out.printf("이름입력 : ");
	  String name = sc.nextLine();
	  
	  System.out.printf("나이입력 : ");
	  int age = Integer.parseInt(sc.nextLine());
	  
	  System.out.printf("지역입력 : ");
	  String loc = sc.nextLine();
	  
	 int chk = mController.insertProcess(name, age, loc);
	 
	 if (chk>0)
		 System.out.printf("%d개 삽입\n", chk);
	 else
		 System.out.println("삽입 실패");
  }//end insertCall()
  
  private static void listCall(MemController mController) {
	  List<MemDTO> aList = mController.listProcess();
		 if(aList != null) {
			 for(MemDTO dto : aList)
				 System.out.printf("%d %s %d %s\n", dto.getNum(), dto.getName(), 
						           dto.getAge(), dto.getLoc());
		 }else {
			 System.out.println("검색 데이터가 없습니다.");
		 }
  }//end listCall()
  
  private static void updateCall(MemController mController, Scanner sc) {
	   System.out.printf("번호 입력 : ");
	   int num = Integer.parseInt(sc.nextLine());
	   
	   System.out.printf("이름 입력 : ");
	   String name = sc.nextLine();
	   
	   System.out.printf("나이 입력 : ");
	   int age = Integer.parseInt(sc.nextLine());
	   
	   System.out.printf("지역 입력 : ");
	   String loc = sc.nextLine();
	   
	   
	   int chk = mController.updateProcess(num, name, age, loc);
	   if(chk > 0)
		   System.out.printf("%d개 수정\n", chk);
	   else
		   System.out.println("수정 실패");
  }//end updateCall()
  
  
  private static void deleteCall(MemController mController, Scanner sc) {
      System.out.printf("번호 입력 :");
      int num = Integer.parseInt(sc.nextLine());
      int chk = mController.deleteProcess(num);
      System.out.println("chk:" + chk);
      if(chk > 0) {
    	  System.out.printf("%d개 삭제\n", chk);
      }else {
    	  System.out.println("삭제 실패");
      }      
  }
}//end class








