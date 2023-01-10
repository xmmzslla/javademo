package java015_exception;

public class Java155_exception {

	public static void main(String[] args) {

		StringBuffer sb = null;
		// java.lang.NullPointerException - 힙 영역에 개체가 생성되지않은 상태에서 불러올 때

		try {
			sb.reverse();
		} catch (NullPointerException ex) {
			sb = new StringBuffer("java");
			System.out.println(sb);
		} finally {
			System.out.println("program end");
		}

//		catch, finally 생략 가능

	}// m()

}// c
