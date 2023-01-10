package java013_api;

import java.util.StringTokenizer;

public class Java133_StringBuffer {

	public static void main(String[] args) {
		//구분자가 연속으로 입력되어 있으면 두번째 구분자 부터는 무시한다.
		StringTokenizer st = new StringTokenizer("java,/jsp/spring", ",/");
		System.out.println(st.countTokens()); // 3
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		System.out.println("=============================");
		String[] data = new String("java,/jsp/spring").split("[,/]");
		System.out.println(data.length);
		for (int i = 0; i < data.length; i++) {
			System.out.printf("data[%d] = %s\n", i, data[i]);
		}

		System.out.println("=============================");
		data = new String("java,/jsp/spring").split("[,/]{1,}");
		System.out.println(data.length);
		for (int i = 0; i < data.length; i++) {
			System.out.printf("data[%d] = %s\n", i, data[i]);
		}

	}// m()

}// c
