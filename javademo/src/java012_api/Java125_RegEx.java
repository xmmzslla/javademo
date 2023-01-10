package java012_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java125_RegEx {

	public static void main(String[] args) {
		String sn = "12345";
		String sb = "2bba5";
		String st = "aetwef";

		// a-zA-Z_*$가 sn변수에 포함이 되어 있으면 true 아니면 false를 리턴한다.
		System.out.println(sn.matches(".*[a-zA-Z_*$].*"));

		// sn변수에 숫자 0-9가 포함되어 있으면 true 아니면 false를 리턴한다.
		System.out.println(sn.matches(".*[0-9].*"));
		System.out.println(sn.matches(".*[\\d].*"));
		System.out.println(sn.matches(".*\\d.*"));

		// sn변수에 숫자 0-9가 포함되어 있지 않으면 true 아니면 false를 리턴한다.
		System.out.println(sn.matches(".*[^0-9].*"));
		System.out.println(sn.matches(".*[\\D].*"));

		// sb변수에 저장딘 값이 2로 시작되면 true 아니면 false를 리턴한다.
		System.out.println(sb.matches("2.*"));

		// sb변수에 저장딘 값이 2로 시작되고 5로 끝나면 true 아니면 false를 리턴한다.
		System.out.println(sb.matches("2.*5"));

		// st변수에 저장딘 값이 a나 b로 시작하고 임의문자가 5개이면 true 아니면 false를 리턴한다.
		System.out.println(sb.matches("[ab].{5}"));

		// st변수에 저장딘 값이 a나 b로 시작하고 임의문자가 1~5개이면서 cc로 끝나면
		// true 아니면 false를 리턴한다.
		System.out.println(sb.matches("[ab].{1,5}cc")); // 여기는 matches는 메소드

		///////////////////////////////////////////////////

		/*
		 * Pattern.matcher() : 빠르게 어떠한 text(String)이 주어진 Pattern에 있는지를 확인한다.
		 * Pattern.compile(): 여러개의 텍스트를 재사용 가능한 Pattern 인스턴스로 컴파일 한다. 
		 * find() : 최초의 패턴 위치로 이동한 뒤 True 반환, 없으면 false 
		 * find(int start) : start 위치 부터 
		 * find start() : 매칭되는 패턴의 시작 인덱스 반환 
		 * start(int group) : group이 매칭되는 시작 인덱스 반환 
		 * end() : 매칭된 패턴 한칸 뒤인덱스 반환 
		 * end(int group) : 지정되 그룹이 매칭되는 한칸 뒤 인덱스 반환 
		 * group() : 최초로 그룹 매칭된 패턴을 반환
		 * group(int group) : 그룹 매칭된 부분중 group번째 패턴을 반환 
		 * groupCount() : 패턴내 그룹핑(괄호로 묶은 패턴들)의 갯수 반환 
		 * matches() : 패턴이 전체 문자열과 일치하면 True
		 */

		String input1 = "3absfa";
		System.out.println(input1.matches("\\d"));
		Pattern pn = Pattern.compile("\\d");
		Matcher mc = pn.matcher(input1); // 여기는 matches는 클래스
		System.out.println(mc);
		System.out.println(mc.find());
		System.out.println(mc.find(0)); // 0은 검색위치 인덱스
		System.out.println(mc.find(6));
		System.out.println(mc.find(3));
		// System.out.println(mc.start());

		System.out.println(Pattern.compile("\\d").matcher(input1).find(0));
		System.out.println(Pattern.compile("\\d").matcher(input1).find());

		// \w : [a-zA-Z_0-9] 언더바 포함임
		// 조건 : 데이터 길이 : 5 ~ 10, 숫자와 영문 포함
		input1 = "abced3gs";
		System.out.println(input1.matches("[a-zA-Z0-9]{5,10}") && Pattern.compile("[0-9]").matcher(input1).find()
				&& Pattern.compile("[a-zA-Z]").matcher(input1).find());

		String str = "The BEst things in best life are best free";
		boolean res = Pattern.compile("best").matcher(str).find();
		System.out.println(res);

		Pattern pt = Pattern.compile("best", Pattern.CASE_INSENSITIVE); // CASE_INSENSITIVE 대소문자 구분없이
		Matcher mh = pt.matcher(str);
		System.out.println(mh);

		int i = 1;
		while (mh.find()) {
			System.out.printf("%d번째 %d ~ %d %s\n", i++, mh.start(), mh.end(), mh.group());
		}

		str = "The BEst10 things in best20 life are best30 free";
		pt = Pattern.compile("(best)(10|20|30)", Pattern.CASE_INSENSITIVE);
		mh = pt.matcher(str);
		i = 1;
		while (mh.find()) {
			System.out.printf("%d번째 %d ~ %d %s\n", i++, mh.start(), mh.end(), mh.group());
		}
	}// m()

}// c
