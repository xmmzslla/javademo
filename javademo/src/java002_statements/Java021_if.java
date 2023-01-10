package java002_statements;

/*
 * swich(식){
 * case 값1 : 수행할 문장; break;
 * case 값2 : 수행할 문장; break;
 * case 값3 : 수행할 문장; break;
 * default : 수행할 문장;
 * }
 * 
 * 식의 결과 타입 : byet, short, char, int, emum(jdk7), String(jdk7)
 * switch ~ case 에서 break을 만나면 현재 수행중인 제어문을 완전히 빠져나옴
*/
public class Java021_if {
	public static void main(String[] args) {
		
		int jumsu = 85;
		switch(jumsu/10) {
		case 10:
		case 9:
			System.out.println('A');break;
		case 8:
			System.out.println('B');break;
		case 7:
			System.out.println('C');break;
		case 6:
			System.out.println('D');break;
		default :
			System.out.println('F');
		}
		//''는 문자고 ""는 문자열님 배열 형태로 받아들임
		
	}//m

}//c
