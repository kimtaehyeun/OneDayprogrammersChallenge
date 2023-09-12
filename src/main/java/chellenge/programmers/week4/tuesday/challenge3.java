package chellenge.programmers.week4.tuesday;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 *  문자열 잘라서 정렬하기
문제 설명
문자열 myString이 주어집니다. "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.

단, 빈 문자열은 반환할 배열에 넣지 않습니다.

제한사항
1 ≤ myString ≤ 100,000
myString은 알파벳 소문자로 이루어진 문자열입니다.

 *
 */
public class challenge3 {

	public static void main(String[] args) {
//		입출력 예
//		myString	result
//		"axbxcxdx"	["a","b","c","d"]
//		"dxccxbbbxaaaa"	["aaaa","bbb","cc","d"]

		
		String myString = "axbxcxdx";
		
		System.out.println(solution(myString));

	}

	public static String[] solution(String myString) {
        String[] answer = myString.split("x");
        ArrayList<String> ar = new ArrayList<>();
        for(int i=0; i<answer.length; i++){
            if(answer[i].length()==0){
                continue;
            }
            ar.add(answer[i]);
        }
        Collections.sort(ar);
        answer =ar.toArray(new String[ar.size()]);
        return  answer;
    }
	
}
