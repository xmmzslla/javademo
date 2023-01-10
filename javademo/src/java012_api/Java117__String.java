package java012_api;

/*
 * 배열 크기 : length - 키워드
 * 문자열 길이 : length() - 메소드
*/
public class Java117__String {

	public static void main(String[] args) {
		String str = new String("KoREa,jsp,java");
		System.out.println("문자열 길이 : " + str.length()); //14 콤마 사이 띄어쓰기도 포함임
		System.out.println("대문자 : " + str.toUpperCase()); // KOREA,JSP,JAVA
		System.out.println("소문자 : " + str.toLowerCase()); // korea,jsp,java
		System.out.println("문자 : " + str.charAt(0)); // 0번째 인덱스 - K
		System.out.println("인덱스 : " + str.indexOf('a')); //4
		System.out.println("인덱스 : " + str.indexOf(97)); //4 유니코드
		System.out.println("인덱스 : " + str.indexOf('a', 5)); //11 인덱스 5에서부터 a번째
		System.out.println("인덱스 : " + str.indexOf("jsp")); //6
		System.out.println("인덱스 : " + str.lastIndexOf('a')); //13
		//5인덱스부터 마지막까지 문자열 리턴
		System.out.println("범위 : "+ str.substring(5));
		//2인덱스부터 8미만까지 문자열 리턴
		System.out.println("범위 : " + str.substring(2, 8));
		
		//메모리에 저장된 문자열을 ","로 구분해서 문자열 배열로 리턴
		String[] arr = str.split(",");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.printf("arr[%d] = %s\n", i, arr[i]);
		}
		
		int x = 10;
		int y =20;
		System.out.printf("%d, + %d = %d\n", x, y, x + y);
		
		//String <- int
		String s1 = String.valueOf(x);
		String s2 = String.valueOf(y);
		System.out.printf("%s + %s = %s\n", s1, s2, s1 + s2);
		
		char[] data = {'1', '2', '3', '4', '5', '6'};
		String s3 = String.valueOf(data);
		System.out.println(s3); //123456
		
		String s4 = String.valueOf(data, 1, 3);
		System.out.println(s4); //234
				
	}// m()

}// c
