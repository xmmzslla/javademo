package java003_statements;
/*
 * 1 2 3 4
 * 5 6 7 8
 * 9 10 11 12
*/
public class Java031_for {
	public static void main(String[] args) {
		
		int data = 1;
		
		for(int row =  1; row <= 3 ; row++) {//행(가로)
			for(int col = 1 ; col <= 4 ; col++) {//열(세로)
				/*
				 * System.out.printf("%4d", data); 
				 * data++;
				 */
				System.out.printf("%4d", data++);//연산자가 뒤에있기 때문에 값을 출력한 뒤 1씩 늘어남
				//data값이 0이라면 ++data로 설정해야함
			}
			System.out.println();
		}
		
	}//m

}//c