package java008_class.part07;

/*
 * 싱글 패턴(Singleton pattern)
 * 1. 같은 형태의 객체를 생성할 때 사용한다.
 * 2. 하나의 객체만을 생성해서 참조하는 방법이다.
 * 3. 방법
 *  - 정의된 클래스에서 자신의 객체를 생성한다.
 *    private static MemberDAO dao = new MemberDAO();
 *  - static선언된 메소드에서 생성된 객체를 리턴한다.
 *    public static MemberDAO getInstance(){
 *     return dao;
 *    }
 *  - 생성자의 접근제어자는 private로 선언한다.
 *    private MemberDAO(){}
 * 4. 장점 : 객체의 단일 생성을 통한 자원의 절약
 *    단점 : 해제되는 시점을 알기 어려움
*/

public class MemberDAO {
	
	private static MemberDAO dao = new MemberDAO();
	
	private MemberDAO() {}
	
	public static MemberDAO getInstance() {
		return dao;
		//return new MemberDAO();
	}
	
	public void display() {
		System.out.println("display");
	}

}
