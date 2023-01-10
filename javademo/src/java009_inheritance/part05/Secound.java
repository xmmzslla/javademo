package java009_inheritance.part05;

//import java009_inheritance.part05.First;
//import java.lang.System; - 같은 패키지 안에있는건 알아서 처리해줌
////import java.lang.Override;

public class Secound extends First {
	int b = 20;
	
	@Override
	void display() {//상속받아서 같거나 더 구체적인 걸로 해야함, 없어도 됨 근데 상속자에는 없는데 있는건 안됨
		System.out.println("b = " + b); //재정의는 자식에서만 가능
	}
	
	void superThisMethod() {
		super.display();
		this.display(); //this생략가능
	}
}
