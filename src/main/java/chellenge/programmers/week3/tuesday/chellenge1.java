package chellenge.programmers.week3.tuesday;

/*
 *  대문자로 바꾸기
문제 설명
알파벳으로 이루어진 문자열 myString이 주어집니다. 
모든 알파벳을 대문자로 변환하여 return 하는 solution 함수를 완성해 주세요.

제한사항
1 ≤ myString의 길이 ≤ 100,000
myString은 알파벳으로 이루어진 문자열입니다.


 *
 */
public class chellenge1 {

	public static void main(String[] args) {
//		입출력 예
//		myString	result
//		"aBcDeFg"	"ABCDEFG"
//		"AAA"	"AAA"
		String myString = "aBcDeFg";
		System.out.println(solution(myString));

	}

	public static String solution(String myString) {
		return myString.toUpperCase();
    }
	
}
