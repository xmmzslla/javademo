package java005_method.prob;

/*
 * num배열에서 최대값을 출력하는 프로그램을 구현하시오.
 * [출력결과]
 * 최대값:95
 */

public class Prob_01 {
	public static void main(String[] args) {

		int[] num = { 94, 85, 95, 88, 90 };
		
		//여기를 구현하세요.
		int max = num[0];
		for(int i = 0 ; i < num.length ; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println("최댓값 : " + max);
		
		

	}// end main()

}// end class
