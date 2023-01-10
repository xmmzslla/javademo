package java003_statements;

/*
 * 1 ~ 10까지의 짝수, 홀수 누적을 계산하는 프로그램
 * 
 * [출력결과]
 * 홀수 누적 : 25
 * 짝수 누적 : 30
*/
public class Java029_for {
	public static void main(String[] args) {
		
		int odd = 0;//홀수
		int even = 0;//짝수
		
		//i변수의 값이 2의 배수이면 짝수
		
		for(int i = 1 ; i <= 10 ; i++) {
			if(i % 2 == 0) {
				even = even + i;
		}else {
			odd = odd + i;
		}
		}
		System.out.printf("홀수 누적 : %d\n", odd);
		System.out.printf("짝수 누적 : %d\n", even);
		
		/*
		 * for(int i = 1 ; i <= 10 ; i++) {
		 *  if(i % 2 == 1) {
		 *   odd = odd + i;
		 *   }else {
		 *  even = even + i; 
		 * } 
		 * } 
		 * System.out.printf("홀수 누적 : %d\n", odd);
		 * System.out.printf("짝수 누적 : %d\n", even);
		 */


}//m
}//c	

