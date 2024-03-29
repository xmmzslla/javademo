package java018_collection.answ;
import java.util.LinkedList;

/*
 * [프로그램 실행결과]
 * 종목코드 :  a001, 종목명: 헬스
 * 종목코드 :  b002, 종목명: 배구
 * 종목코드 :  c003, 종목명: 스케이트
 */
public class Prob003_LinkedList {

	public static void main(String[] args) {
		LinkedList<Sports> list=new LinkedList<Sports>();
		//list.add(new Sports("a001","헬스"));
		list.add(save("a001","헬스"));
		list.add(save("b002","배구"));
		list.add(save("c003","스케이트"));
	  	
		// LinkedList클래스에 저장된 데이터를 출력하는 프로그램을 구현하시오.
	  /*	for(int i=0;i<list.size();i++){
	  		Sports sp=list.get(i);
	  		System.out.printf("종목코드 :  %s, 종목명: %s\n",sp.getCode(),sp.getProgram());	  		
	  	}*/
		
		for(Sports sp : list)
			System.out.printf("종목코드 :  %s, 종목명: %s\n",sp.getCode(),sp.getProgram());
     
	}//end main()
	
	public static Sports save(String code, String program){
		//code, program매개변수에 저장된 값을 Sports클래스에 저장한후 
		//리턴하는 프로그램을 구현하시오.
		
		return new Sports(code, program);
	}//end save()

}//end class








