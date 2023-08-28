package chellenge.programmers.week2.monday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 *  문자열의 앞의 n글자
문제 설명
문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 
앞의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.

제한사항
my_string은 숫자와 알파벳으로 이루어져 있습니다.
1 ≤ my_string의 길이 ≤ 1,000
1 ≤ n ≤ my_string의 길이


 *
 */
public class chellenge2 {

	public static void main(String[] args) {
//		입출력 예
//		my_string			n	result
//		"ProgrammerS123"	11	"ProgrammerS"
//		"He110W0r1d"		5	"He110"
		
		
		String my_string="ProgrammerS123";
		int n=11;
		System.out.println(Solution(my_string,n));
		
	}
	
	public static String Solution(String my_string,int n) {
		
		String answer = "";
		answer = my_string.substring(0,n);
        return answer;
		
	}
}
