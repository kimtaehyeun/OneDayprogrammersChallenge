package chellenge.programmers.week1.wednesday;

import java.util.ArrayList;
import java.util.List;

public class chellenge3 {
	/*
	 * 카운트 업
	문제 설명
	정수 start_num와 end_num가 주어질 때, 
	start_num부터 end_num까지의 숫자를 차례로 
	담은 리스트를 return하도록 solution 함수를 완성해주세요.
	
	제한사항
	0 ≤ start_num ≤ end_num ≤ 50
	
	 */
	public static void main(String[] args) {
//		입출력 예
//		start_num	end_num		result
//		3			10			[3, 4, 5, 6, 7, 8, 9, 10]
		
		int start_num=3;
		int end_num=10;
		System.out.println(Solution(start_num,end_num));
		
	}
	
	public static int []  Solution(int start_num, int end_num) {
		List<Integer> ar = new ArrayList<>();
		while(start_num <=end_num) {
			ar.add(start_num);
			start_num++;
		}
		int [] answer= ar.stream().mapToInt(Integer::intValue).toArray();
		return answer;
		

	}
//	다른사람 풀이
//	public int[] solution(int start, int end) {
//        return IntStream.rangeClosed(start, end).toArray();
//    }
}