package java006_class.part06;

/*
 * 생성자(constructor)
 * 1. 객체의 초기값 할당
 * 2. 생성자명은 클래스명하고 같다.
 * 3. 생성자는 클래스에서 1개이상 존재한다.
 * 4. 클래스에 정의된 생성자가 없으면 JVM에서 기본 생성자를 제공한다.
 * 
 * [기본 생성자]
 * - 클래스의 접근제어자하고 같고 파라미티가 없는 구조다.
 * - 클래스에서 정의된 생성자가 존재하면 JVM에서 제공하지 않는다.
 *   
*/

public class HandPhone {
	
	//멤버변수
	String name;
	String number;
	
	//기본 생성자 - 하나도 정의되지 않았을 때만
	//생성자 이름은 클래스와 같아야한다.
	public HandPhone() {}
	
	public HandPhone(String name) { //생성자에는 void 못씀 쓰면 메소드로 인식함
		this.name = name;
	} //멤버변수에만 this붙임

	public HandPhone(String name, String number) {
		this.name = name;
		this.number = number;
	}

	//메소드
	void display() {
		System.out.printf("%s %s\n", name, number);
		

	}
}
