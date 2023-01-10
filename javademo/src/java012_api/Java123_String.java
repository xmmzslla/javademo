package java012_api;

public class Java123_String {

	public static void main(String[] args) {
		String p1 = "박상원,561203-1597650";
		String p2 = "김연아,030628-4056892";
		String p3 = "정혜원,900824-8052582";
		display(p1);
		display(p2);
		display(p3);

	}// m()

	public static void display(String str) {
		//성별구분: 1, 3이면 남성이고, 2, 4이면 여성이다.
		String[]data = str.split(",");
		//System.out.printf("data[0] = %s, data[1] = %s\n", data[0], data[1]);
		char gen = data[1].charAt(7); //561203-1597650.charAt(7) => '1'
		if(gen == '1' || gen == '3')
			System.out.printf("%s님은 %c성입니다\n", data[0], '남');
		else if(gen == '2' || gen == '4')
			System.out.printf("%s님은 %c성입니다\n", data[0], '여');
		else
			System.out.println("잘못입력하셨습니다.");

	}//dis()

}// c
