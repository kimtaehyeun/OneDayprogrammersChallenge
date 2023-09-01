package chellenge.programmers.week2.friday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 5명씩
문제 설명
최대 5명씩 탑승가능한 놀이기구를 타기 위해 줄을 서있는 사람들의 이름이 담긴 문자열 리스트 
names가 주어질 때, 앞에서 부터 5명씩 묶은 그룹의 가장 앞에 서있는 사람들의 이름을 담은 
리스트를 return하도록 solution 함수를 완성해주세요. 마지막 그룹이 5명이 되지 않더라도 
가장 앞에 있는 사람의 이름을 포함합니다.

제한사항
5 ≤ names의 길이 ≤ 30
1 ≤ names의 원소의 길이 ≤ 10
names의 원소는 영어 알파벳 소문자로만 이루어져 있습니다.


 *
 */
public class chellenge2 {

	public static void main(String[] args) {
//		입출력 예
//		names														result
//		["nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"]	["nami", "vex"]
		
		
		String [] names= {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
		System.out.println(solution(names));
		
	}
	
	public static String[] solution(String[] names) {
		  String[] answer = {};
	        List<String> ar = new ArrayList<>();
	        for(int i=0; i<names.length; i+=5){
	            ar.add(names[i]);
	        }

	        return answer = ar.toArray(new String[ar.size()]);
		
	}
	
	//다른사람 풀이;
//	String[] answer = new String[(names.length-1)/5+1];
//    for(int i=0; i<answer.length; i++) {
//        answer[i] = names[5*i];
//    }
//    return answer;
}
