package java015__exception;

public class Java160_exception {

	public static void main(String[] args) {
		int data =8;

		try {
			if (data < 10) {
				//throw : 강제적으로 예외를 발생시킬 때 사용한다.
				throw new UserException("10이상만 입력하세요");
			}
			
			System.out.println(data);
		} catch (UserException ex) {
			System.out.println(ex.toString());
		}
	}// end main()

}// end class
