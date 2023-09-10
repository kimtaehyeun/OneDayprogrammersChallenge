package chellenge.programmers.week4.sunday;

import java.util.Iterator;

/*
 *  문자열이 몇 번 등장하는지 세기
문제 설명
문자열 myString과 pat이 주어집니다. myString에서 pat이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.

제한사항
1 ≤ myString ≤ 1000
1 ≤ pat ≤ 10
 *
 */
public class challenge2 {

	public static void main(String[] args) {
//		입출력 예
//		myString	pat		result
//		"banana"	"ana"	2
//		"aaaa"		"aa"	3

		
		String myString = "banana";
		String pat = "ana";
		System.out.println(solution(myString, pat));

	}

	public static int solution(String myString, String pat) {
		int answer = 0;
		boolean check= true;
		int i= 0;
		int idx = myString.indexOf(pat);
		while(check) {
            if(idx>=0){
                idx=myString.indexOf(pat,idx+1);
            }
            else {
            	break;
            }
            answer++;
            
            
        }
		
		if(answer==0){
            return -1;
        }
        return answer;
       
    }
	
}
