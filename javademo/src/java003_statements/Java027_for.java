package java003_statements;

public class Java027_for {

	public static void main(String[] args) {
		//누적된 값이 최초로 15이상일 때까지만 반복문을 수행
		
		/*
		 * i =1 
		 * i =2 
		 * i =3 
		 * i =4 
		 * i =5 
		 * sum = 15
		 */
		
		int i;
		int sum = 0;
		
		for(i = 1 ; ; i++) {
			sum = sum + i;
			System.out.printf("i =%d\n", i);
			if(sum >= 15) {
				break;
			}
		}
		System.out.printf("sum = %d\n", sum);

	}//m

}//c
