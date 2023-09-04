package chellenge.programmers.week3.monday;

/*
 *  원하는 문자열 찾기
문제 설명
알파벳으로 이루어진 문자열 myString과 pat이 주어집니다. myString의 연속된 부분 문자열 중 
pat이 존재하면 1을 그렇지 않으면 0을 return 하는 solution 함수를 완성해 주세요.

단, 알파벳 대문자와 소문자는 구분하지 않습니다.

제한사항
1 ≤ myString의 길이 ≤ 100,000
1 ≤ pat의 길이 ≤ 300
myString과 pat은 모두 알파벳으로 이루어진 문자열입니다.

 *
 */
public class chellenge4 {

	public static void main(String[] args) {
//		입출력 예
//		myString	pat			return
//		"AbCdEfG"	"aBc"		1
//		"aaAA"		"aaaaa"		0
		
		
		String myString = "AbCdEfG";
		String pat = "aBc";
		
		System.out.println(solution(myString, pat));

	}

	public static int solution(String myString, String pat) {
		 int answer = 0;
	        myString =myString.toUpperCase();
	        pat =pat.toUpperCase();
	        if(myString.length()<pat.length())
	            return 0;
	        for(int i=0; i<myString.length()-pat.length()+1; i++){
	            if(pat.equals(myString.substring(i,i+pat.length()))){
	                return 1;
	            }
	        }
	        return answer;
    }
//다른사람 풀이 = indexOf();
//	int answer = 0;
//    String str = myString.toLowerCase();
//    String str2 = pat.toLowerCase();
//
//    if (str.indexOf(str2) != -1) {
//        return 1;
//    }
//    return 0;
}
