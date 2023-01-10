package java009_inheritance.part05;

/*
 * 오버라이딩(overriding)
 * 1. 부모클래스에서 메소드를 자식클래스에서 재정의(메소드 구현부)하는 기능이다.
 * 2. 오버라이딩 조건
 *  1) 부모클래스의 메소드와 자식클래스의 메소드 이름이 동일해야 한다.
 *  2) 매개변수 타입, 갯수, 순서가 일치해야한다.
 *  3) 리턴타입이 동일해야한다.
 *  4) 접근제어자(제어자)는 부모클래스의 메소드와 길거나 더 넓은 범위여야 한다.(없는건 됨)
 *     private < default < protected < public
 *  5) 부모클래스에 메소드에서 throws가 선언돼있으면 자식클래스의 메소드에서는 길거나 더 구체적이면 된다.
 *     Exception => RuntimeException => NullPointerException
 *  
 * super
 * 1.자식클래스에서 부모클래스를 호출할 때 사용된다.
 * 2. super.멤버변수
 *    super.메소드()
 *    super() => 생성자
 *    
 * 단일클래스         vs       상속관계의 자식클래스
 * overloading     vs          overriding
 * this            vs            super 
 * 
*/

public class First {
	int a = 10;
	void display() {
		System.out.println("a = " + a);
	}

}
