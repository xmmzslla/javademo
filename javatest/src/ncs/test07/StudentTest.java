package ncs.test07;

public class StudentTest {
	
	public static void main(String[] args) {
		Student ss[] = new Student[3];
		ss[0] = new Student("홍길순", 25, 171, 81, "201401", "영어영문학");
		ss[1] = new Student("한사랑", 23, 183, 72, "201402", "건축학");
		ss[2] = new Student("임꺽정", 26, 175, 65, "201403", "체육학");
		
//		for(Student nt : ss)
//			System.out.println(nt.toString());
		
		for(int i = 0 ; i < ss.length ; i++) {
			System.out.println(ss[i]);
		}
		
	}//m()

}//c
