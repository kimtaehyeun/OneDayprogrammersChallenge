package chellenge.programmers.week7.thursday;

import java.util.ArrayList;

/*
 *
 모음 사전
문제 설명
사전에 알파벳 모음 'A', 'E', 'I', 'O', 'U'만을 사용하여 만들 수 있는, 길이 5 이하의 모든 단어가 수록되어 있습니다. 사전에서 첫 번째 단어는 "A"이고, 그다음은 "AA"이며, 마지막 단어는 "UUUUU"입니다.

단어 하나 word가 매개변수로 주어질 때, 이 단어가 사전에서 몇 번째 단어인지 return 하도록 solution 함수를 완성해주세요.

제한사항
word의 길이는 1 이상 5 이하입니다.
word는 알파벳 대문자 'A', 'E', 'I', 'O', 'U'로만 이루어져 있습니다.

 *
 */
public class challenge1 {
	static char[] code = {'A', 'E', 'I', 'O', 'U'};
	
	
	public static void main(String[] args) {
		//		입출력 예
		//		word	result
		//		"AAAAE"	6
		//		"AAAE"	10
		//		"I"	1563
		//		"EIO"	1189

		String word ="AAAAE";
		System.out.println(solution(word));

	}

	
	
	public static int solution(String word) {
        int answer = 0;
        ArrayList<String> ar =new ArrayList<>();
        for(int i=0; i<code.length; i++){
            makeArray(ar,String.valueOf(code[i]));
            if(code[i]==word.charAt(0)){
                break;
            }
        }
        for(int i=0; i<ar.size(); i++){
            if(ar.get(i).equals(word)){
                return i+1;
            }
        }
        return answer;
    }
    public static void makeArray(ArrayList<String> ar,String str){
        if(str.length()>code.length){
            return;
        }
        ar.add(str);
        for(int i=0; i<code.length; i++){
            makeArray(ar,str+code[i]);
        }
    }



}