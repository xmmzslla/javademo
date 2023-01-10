package java013_api;

import java.util.Scanner;

public class Java141_Scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 기획부 3000 4.5 - 공백이 꼭 있어야함
		System.out.print("부서 연봉 평가 : ");
//		String line = sc.nextLine();
//		System.out.println(line);
		
		
		String dept = sc.next();
		int salary = sc.nextInt();
		double avg = sc.nextDouble();

		System.out.printf("%s %d %.1f\n", dept, salary, avg);

	}// m()

}// c
