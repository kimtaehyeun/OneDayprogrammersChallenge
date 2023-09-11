package chellenge.programmers.week4.monday;

import java.util.ArrayList;
import java.util.List;

/*
 *  공백으로 구분하기 2
문제 설명
단어가 공백 한 개 이상으로 구분되어 있는 문자열
 my_string이 매개변수로 주어질 때, my_string에 나온 
 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하
 는 solution 함수를 작성해 주세요.

제한사항
my_string은 영소문자와 공백으로만 이루어져 있습니다.
1 ≤ my_string의 길이 ≤ 1,000
my_string의 맨 앞과 맨 뒤에도 공백이 있을 수 있습니다.
my_string에는 단어가 하나 이상 존재합니다.



 *
 */
public class challenge3 {

	public static void main(String[] args) {
		//		입출력 예
		//		my_string	result
		//		" i    love  you"	["i", "love", "you"]
		//		"    programmers  "	["programmers"]
		String my_string = " i    love  you";

		System.out.println(solution(my_string));

	}

	public static String[] solution(String my_string) {
		String[] answer = {};
		List<String> ar = new ArrayList<>();
		while(true){
			my_string = my_string.trim();
			int idx = my_string.indexOf(" ");
			if(idx>0){
				ar.add(my_string.substring(0,idx));
				my_string = my_string.substring(idx);
			}
			else{
				ar.add(my_string);
				return answer=ar.toArray(new String[ar.size()]);
			}

		}
	}

}