package java018_collection;

import java.util.LinkedList;

/*
 *  1 배열 구조로 데이터 관리 : Vector, ArrayList
 *                         => 추가 - 순차적으로 처리할 때 사용
 *  2 연결리스트로 데이터 관리 : LinkedList
 *                         => 삽입, 삭제 -비순차적으로 처리할 때 사용
 *  3. List을 구현해놓은 컬렉션
 *     Vector, ArrayList, LinkedList은 add() 해준 순서대로 데이터 관리를 해준다.                         
 */
public class Java188_LinkedList {

	public static void main(String[] args) {
      LinkedList<String> aList = new LinkedList<String>();
      
      //append
      aList.add(new String("java"));
      aList.add(new String("jsp"));
      aList.add(new String("spring"));
      
      //insert
      aList.add(1, new String("mysql"));
      
      for(int i =0; i<aList.size(); i++)
    	  System.out.printf("aList[%d]=%s\n", i, aList.get(i));
	}// end main()

}// end class
