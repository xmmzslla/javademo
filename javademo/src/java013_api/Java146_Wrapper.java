package java013_api;

import java.util.regex.Pattern;

/*
 * sn변수에 저장된 문자열 둥에서 숫자 갯수를 출력하는 프로그램을 구하시오.
 * [출력결과]
 * 숫자갯수: 3
*/
public class Java146_Wrapper {

	public static void main(String[] args) {
		
//		String sn = "korea12 paran3";
//		int cnt = 0;
//		for(int i = 0 ; sn.length() ; i++) {
//			char data = sn.charAt(i);
//			if(data >= '0' && data <= '9') {
//				
//			}
//		}
//		System.out.println("숫자갯수: " + cnt);

		String sn = "korea12 paran3";
		int cnt = 0;

		char[] cn = sn.toCharArray();

		for (int i = 0; i < cn.length; i++) {

			if (Character.isDigit(cn[i])) {
				cnt++;
			}
		}
		System.out.println("숫자갯수: " + cnt);
	

	}// m()

}// c
