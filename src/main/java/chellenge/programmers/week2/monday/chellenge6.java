package chellenge.programmers.week2.monday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * qr code
문제 설명
두 정수 q, r과 문자열 code가 주어질 때, code의 
각 인덱스를 q로 나누었을 때 나머지가 r인 위치의 문자를 앞에서부터 순서대로
 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.

제한사항
0 ≤ r < q ≤ 20
r < code의 길이 ≤ 1,000
code는 영소문자로만 이루어져 있습니다.


 *
 */
public class chellenge6 {

	public static void main(String[] args) {
//		입출력 예
//		q	r	code				result
//		3	1	"qjnwezgrpirldywt"	"jerry"
//		1	0	"programmers"		"programmers"	
		
		int q=3;
		int r=1;
		String code="qjnwezgrpirldywt";
		System.out.println(Solution(q,r,code));
		
	}
	
	public static String Solution(int q, int r, String code) {
		
		 String answer = "";
		 for(int i=r; i<code.length();i+=q) {
			 answer+=code.charAt(i)+"";
		 }
		 
	        return answer;
		
	}
		
	
}
