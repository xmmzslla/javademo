package java013_api;

import java.util.Scanner;

public class Java142_Scanner {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 기획부   3000  4.5 - 공백이 꼭 있어야함
		
		System.out.print("부서 연봉 평가 : ");
    	String line = sc.nextLine();
//		System.out.println(line);
		
		String[] arr = line.split("\\s{1,}"); //.split("\\s{1,}") 공백이 1개 이상일 때 나누어라
		System.out.println(arr.length);
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.printf("arr[%d]=%s\n", i, arr[i]);
		}
		
	}//m()

}//c
