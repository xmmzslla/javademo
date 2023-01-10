package ncs.test05;

public class BookArrayTest {

	public static void main(String[] args) {

		Book bArray[] = new Book[3];
		bArray[0] = new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.1);
		bArray[1] = new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.1);
		bArray[2] = new Book("객체지향 JAVA8", "금영옥", 30000, "북스홈", 0.1);

		for (Book bk : bArray) {
			System.out.println(bk.toString());
			System.out.println("할인된 가격 : " + bk.price * 0.9 + "원");
		
		}
			
		

		// 배열에 있는 객체 정보를 모두 getter 로 출력 한다. – for 문을 이용 할 것
		// 실행 결과와 같이 계산 출력

	}// m()

}// c