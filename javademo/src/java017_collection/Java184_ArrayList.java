package java017_collection;

import java.util.ArrayList;

/*
 * Vector 와 ArrayList
 * 1. Vector은 동기화 처리가 되여 있고 ArrayList는 비동기화 처리한다.
 * 2. Vector와 ArrayList은 메모리에 요소를 처리할 때 배열의 구조를 따른다.
 * 3. Vector와 ArrayList의 클래스는 처리방법이 비슷하다.
 * 4. Vector와 ArrayList은 수시로 요소의 삽입, 삭제를 처리하는 것은 좋은 방법이 아니다. 
 */

//Ctrl + Shift + O
public class Java184_ArrayList {

	public static void main(String[] args) {	
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(10); //auto boxing -> up-casting
		aList.add(20);
		aList.add(30);		
		System.out.println(aList.size());
		
		System.out.println("===============================");
        for(int i=0;i<aList.size(); i++)
        	System.out.println(aList.get(i));
        
		System.out.println("===============================");
		for(int it : aList)
			System.out.println(it);
		
		System.out.println("===============================");
		System.out.println(aList.remove(0));
		
		System.out.println("===============================");
		for(int it : aList)
			System.out.println(it);
		
	}//end main()

}//end class











