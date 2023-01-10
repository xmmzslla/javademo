package java006_class.part06;

/*
 * 1. HandPhon hp : stack area에 4바이트 메모리 생성
 * 2. new : head area에 객체를 생성
 * 3. HandPhone() : heap area에 생성된 멤버변수에 초기값을 활당
 * 4. = : heap area에 생성된 객체의 메모리 주소를 stack area레 할당
*/

public class Java070_constructor {
	
	public static void main(String[] args) {
	
		HandPhone hp = new HandPhone();
		hp.display();
		//모든 클래스는 한개 이상의 생성자를 갖는다
		
		HandPhone hn = new HandPhone("홍길동");
		hn.display();
		
		HandPhone he = new HandPhone("홍길동", "010-1234-5678");
		he.display();
		
	}//m()

}//c
