package chellenge.programmers.week1.friday;

import java.util.ArrayList;
import java.util.List;

/*
 *  배열 만들기 5
문제 설명
문자열 배열 intStrs와 정수 k, s, l가 주어집니다. 
intStrs의 원소는 숫자로 이루어져 있습니다.

배열 intStrs의 각 원소마다 s번 인덱스에서 시작하는 길이 
l짜리 부분 문자열을 잘라내 정수로 변환합니다. 이때 변환한 
정수값이 k보다 큰 값들을 담은 배열을 return 하는 solution
 함수를 완성해 주세요.
 
 
 제한사항 
0 ≤ s < 100
1 ≤ l ≤ 8
10l - 1 ≤ k < 10l
1 ≤ intStrs의 길이 ≤ 10,000
s + l ≤ intStrs의 원소의 길이 ≤ 120

 */
public class chellenge1 {

	public static void main(String[] args) {
//		intStrs										k		s	l	result
//		["0123456789","9876543210","9999999999999"]	50000	5	5	[56789, 99999]
		
		
		String[] intStrs= {"0123456789","9876543210","9999999999999"};
		int k=50000;
		int s=5; 
		int l=5;
		System.out.println(Solution(intStrs, k, s, l));
		
	}
	
	public static int[] Solution(String[] intStrs, int k, int s, int l) {
		 int[] answer = {};
		 List<Integer> result = new ArrayList<>();
		 
		 for(String intStr : intStrs) {
			 
			 if(Integer.valueOf(intStr.substring(s, s+l))>k) {
				 result.add(Integer.valueOf(intStr.substring(s, s+l)));
			 }
		 }
		 answer= result.stream().mapToInt(Integer::intValue).toArray();
		 
		 return answer;
		
		
		
	}
}