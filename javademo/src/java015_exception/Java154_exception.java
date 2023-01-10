package java015_exception;

public class Java154_exception {

	public static void main(String[] args) {
		int[]num = new int[3];
		num[0] = 10;
		System.out.println(num[0]);
		
		// java.lang.ArrayIndexOutOfBoundsException - 범위를 벗어남
		try {
		num[4] = 20;
		}catch(ArrayIndexOutOfBoundsException ex) {
//			System.out.println(ex.getMessage());
			System.out.println(ex.toString());
//			ex.printStackTrace(); //어느 위치에서 발생됐는지 알려줌
		}
		
		
	}// m()

}// c
