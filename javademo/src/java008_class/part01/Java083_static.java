package java008_class.part01;

/*
 * static
 * 1. class loader일때 method area에 저장이 된다
 * 2.같은 클래스로 생성된 객체끼리 공유해서 사용한다.
 * 3. static키워드가 선언된 메소드에서 this, super키워드를 사용할 수 있다. 
*/

public class Java083_static {
	
	public static void main(String[] args) {
		System.out.printf("StaticEx.y = %d\n", StaticEx.y);
		//System.out.printf("StaticEx.x = %d\n", StaticEx.x);
		//class(이름).변수 =변경한 숫자가 공유됨 클래스를 호출하지 않으면 못부름
		
		StaticEx se = new StaticEx();
		System.out.printf("se.x = %d, se.y = %d\n", se.x, se.y);
		
		StaticEx ss = new StaticEx();
		System.out.printf("ss.x = %d, ss.y = %d\n", ss.x, ss.y);
		
		se.x = 20;
		se.y = 30;
		System.out.printf("se.x = %d, se.y = %d\n", se.x, se.y);
		System.out.printf("ss.x = %d, ss.y = %d\n", ss.x, ss.y);
		
	}//m()

}
