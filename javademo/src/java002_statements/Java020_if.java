package java002_statements;

public class Java020_if {

	public static void main(String[] args) {
		char data = 'D';
				
				if(data == 'D') {
					System.out.println("D는 대문자 입니다.");
				}else if(data == 'd') {
					System.out.println("d는 소문자 입니다.");
				}else {
					System.out.println("기타입니다.");
				}
				
				// data >= 'A' && data <= 'Z'
				
				if(data >= 'A' && data <= 'Z') {
					System.out.printf("%c는 대문자 입니다.\n", data);
				}else if(data >= 'a' && data <= 'z') {
					System.out.printf("%c는 소문자입니다,\n", data);
				}else {
					System.out.printf("%c는 기타입니다,\n", data);
				}
		
		
		
		

	}//m

}//c
