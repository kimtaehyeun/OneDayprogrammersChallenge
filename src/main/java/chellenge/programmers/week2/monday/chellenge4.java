package chellenge.programmers.week2.monday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 *  문자열 뒤집기
문제 설명
문자열 my_string과 정수 s, e가 매개변수로 주어질 때, 
my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을
 return 하는 solution 함수를 작성해 주세요.

제한사항
my_string은 숫자와 알파벳으로만 이루어져 있습니다.
1 ≤ my_string의 길이 ≤ 1,000
0 ≤ s ≤ e < my_string의 길이


 *
 */
public class chellenge4 {

	public static void main(String[] args) {
//		입출력 예
//		my_string			s	e	result
//		"Progra21Sremm3"	6	12	"ProgrammerS123"
//		"Stanley1yelnatS"	4	10	"Stanley1yelnatS"
		
		
		String my_string="Progra21Sremm3";
		int n=6;
		int e=12;
		System.out.println(Solution(my_string,n,e));
		
	}
	
	public static String Solution(String my_string, int s, int e) {
		
		String answer = "";
		char []  array = my_string.toCharArray();
		String replace = my_string.substring(s,e+1);
		for(int i =0; i<replace.length(); i++) {
			array[s+i] = replace.charAt(replace.length()-1-i);
		}
        return String.valueOf(array);
		
	}
	//다른사람 풀이 - revers()메소드
//	StringBuilder answer = new StringBuilder(my_string.substring(s, e + 1));
//    answer.reverse();
//    return my_string.substring(0, s) + answer + my_string.substring(e + 1);
	
}
