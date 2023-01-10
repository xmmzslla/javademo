package java006_class.prob;

/*피자의 반지름을 10, 도넛의 반지름은 2로 한다.
 * 
 * [실행결과]
 * 자바피자의 면적은 314.0
 * 자바도넛의 면적은 12.56
 */
class Calculation {

	int radius;
	String name;

	public double Calculation() {
		return 3.14 * radius * radius;
	}
	
}//Calcu..

public class Prob01_class {

	public static void main(String[] args) {
		// 여기를 구현하세요.////////////////////

		Calculation ca = new Calculation();
		ca.name = "자바피자";
		ca.radius = 10;
		
		Calculation cl = new Calculation();
		cl.name = "자바도넛";
		cl.radius = 2;
		
		System.out.println(ca.name + "의 면적은 " + ca.Calculation());
		System.out.println(cl.name + "의 면적은 " + cl.Calculation());

	}// end main()

}
// end class
