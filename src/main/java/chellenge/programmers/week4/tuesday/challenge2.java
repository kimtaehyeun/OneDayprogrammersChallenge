package chellenge.programmers.week4.tuesday;

import java.util.ArrayList;

/*
 *  x 사이의 개수
문제 설명
문자열 myString이 주어집니다. myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

제한사항
1 ≤ myString의 길이 ≤ 100,000
myString은 알파벳 소문자로 이루어진 문자열입니다.
 *
 */
public class challenge2 {

	public static void main(String[] args) {
//		입출력 예
//		myString	result
//		"oxooxoxxox"	[1, 2, 1, 0, 1, 0]
//		"xabcxdefxghi"	[0, 3, 3, 3]

		
		String myString = "xabcxdefxghix";
		
		System.out.println(solution(myString));

	}

	public static int[] solution(String myString) {
        String [] ar = myString.split("x");
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<ar.length; i++){
            answer.add(ar[i].length());
        }
        if(myString.lastIndexOf("x")==myString.length()-1){
        answer.add(0);
        }
            
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
	
}
