package chellenge.programmers.week2.monday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 세로 읽기
문제 설명
문자열 my_string과 두 정수 m, c가 주어집니다.
 my_string을 한 줄에 m 글자씩 가로로 적었을 때 왼쪽부터 
 세로로 c번째 열에 적힌 글자들을 문자열로 return 하는 solution 함수를 작성해 주세요.

제한사항
my_string은 영소문자로 이루어져 있습니다.
1 ≤ m ≤ my_string의 길이 ≤ 1,000
m은 my_string 길이의 약수로만 주어집니다.
1 ≤ c ≤ m


 *
 */
public class chellenge5 {

	public static void main(String[] args) {
//		입출력 예
//		my_string				m	c	result
//		"ihrhbakrfpndopljhygc"	4	2	"happy"
//		"programmers"			1	1	"programmers"		
		
		String my_string="ihrhbakrfpndopljhygc";
		int m=4;
		int c=2;
		System.out.println(Solution(my_string, m, c));
		
	}
	
	public static String Solution(String my_string, int m, int c) {
		
		 String answer = "";
		 int count = 0;
		 for(int i=0;i<my_string.length()/m; i++) {
			 for(int j= 0; j<m;j++) {
				 if(j==c-1) {
					answer+=""+my_string.charAt(count); 
				 }
				 count++;
			 }
		 }
		 
	        return answer;
		
	}
		//다른사람 풀이
//	for(;c <= my_string.length();c += m) {
//        answer += my_string.charAt(c-1);
//    }
	
}
