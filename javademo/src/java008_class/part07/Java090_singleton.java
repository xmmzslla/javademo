package java008_class.part07;

public class Java090_singleton {
	public static void main(String[] args) {
		//MemberDAO mm = new MemberDAO();
		
		MemberDAO mb = MemberDAO.getInstance();
		mb.display();
		
		MemberDAO mc = MemberDAO.getInstance();
		mc.display();
		
		System.out.println(mb == mc);
	}//m()

}//c
