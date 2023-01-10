package java003_statements;

/*
 * do{
 * 반복 수행 문장; //무조건적으로 한번은 실행 후 빠져나감 *쓸일 별로 없음
 * }while(조건식);
*/
public class Java036_do_while {
	public static void main(String[] args) {
		char chk = 'n';
		do {
			System.out.println("주문하시겠습니다까?(y/n)");
		}while(chk == 'y');
		
	}//m

}//c
