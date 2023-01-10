package java001_basic.prob;
/*
* 동전교환프로그램
* 1 가장 적은 동전으로 교환할 수 있는 프로그램을 작성하시오
* 2 [출력결과]
*   500원: 15개 
    100원: 2개
    50원: 1개
    10원: 2개
    1원: 7개
    */

public class Prob07 {

	public static void main(String[] args) {
		int money = 7777;
		int mok=money/500;		
		
		//여기에 작성하시오.
		int mo = (money - mok * 500)/100;
		int so = (money - mok * 500 - mo * 100)/50 ;
		int to = (money - mok * 500 - mo * 100 - so * 50)/10;
		int go = (money - mok * 500 - mo * 100 - so * 50 - to * 10)/1;
		
		System.out.printf("500원: %d개\n", mok);
		System.out.printf("100원: %d개\n", mo);
		System.out.printf("50원: %d개\n", so);
		System.out.printf("10원: %d개\n", to);
		System.out.printf("1원: %d개\n", go);
		
		
				
	}//end main()

}//end class


