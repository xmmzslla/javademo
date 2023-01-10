package java003_statements;

/*
 * 반복문에서 특정 위치로 이동(continue)을 하거나 빠져나올 때 (break)
 * 반복문에서 lable을 선언히고 호출하면 된다.
*/

public class Java033_for {
	public static void main(String[] args) {
		
		move : //lable선언
		for(int k = 1 ; k < 5 ; k++) {
			go : //lable선언
			for(int i = 1 ; i <=3 ; i++) {
				for(int j = 1 ; j <= 2 ; j++) {
					System.out.printf("j = %d\n", j);
					//break; j for문이 한번만 돌아가고 윗 for문으로 넘어감
					//break go; go반복문을 빠려 나감 -> System.out.println("kkk");
					//break move;
					continue move;
				}
				System.out.printf("i = %d\n", i);
			}
			System.out.println("kkk");
		}
		System.out.println("program end");
	}//m

}//c

//for문이 중첩되면 가장 안에있는 것부터 동작되기 시작함