package ncs.test01;

public class ArrayTest {

	public static void main(String[] args) {

		int[][] array = { { 12, 41, 36, 56, 21 }, { 82, 10, 12, 61, 45 }, { 14, 16, 18, 78, 65 },
				{ 45, 26, 72, 23, 34 } };

		int sum = 0;
		double average = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];

			}
			average = (double)sum / (array[i].length * array.length);

		}
		System.out.printf("합계 : %.2f\n",(double) sum);
		System.out.printf("평균 : %.2f", average);

	}// m()

}// c
