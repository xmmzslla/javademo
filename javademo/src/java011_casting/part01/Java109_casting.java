package java011_casting.part01;

/*
 * 
 * class 관계
 * 1. is a : 상속관계
 * 2. has a : 포함관계
*/

public class Java109_casting {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.process();
		
		Child c = new Child();
		c.process();
		
		//업캐스팅 - 부모가 자식의 개체를 참조할 수 있다
		//상속관계에서는 형변환이 가능
		Parent pn = c;
		//Child c = new Child(); c.process(); + Parent pn = c;임
		
		//다운캐스팅(down - casting)
		Child cd = (Child)pn;
		cd.call();
		
		//객체 생성 및 업캐스팅
		Parent pt = new Child();
		pt.process();
		
		Child ct = (Child)pt;
		ct.call();
		

	}// m()

}// c
