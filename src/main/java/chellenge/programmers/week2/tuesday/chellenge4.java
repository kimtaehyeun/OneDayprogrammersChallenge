package chellenge.programmers.week2.tuesday;

import java.util.ArrayList;
import java.util.List;

/*
 *  카운트 다운
문제 설명
정수 start_num와 end_num가 주어질 때, start_num에서 
end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 
solution 함수를 완성해주세요.

제한사항
0 ≤ end_num ≤ start_num ≤ 50

 *
 */
public class chellenge4 {

	public static void main(String[] args) {
//		입출력 예
//		start_num	end_num		result
//		10			3			[10, 9, 8, 7, 6, 5, 4, 3]
		
		int start=10;
		int end_num=3;
		System.out.println(Solution(start, end_num));
		
	}
	
	public static int []  Solution(int start, int end_num) {
		int [] answer = new int[start-end_num+1];
		for(int i=0; i<=start-end_num; i++) {
			answer[i]=start-i;
			
		}
        return answer;
		

	}
	//다른사람 풀이
//	 public int[] solution(int start, int end) {
//	        return IntStream.rangeClosed(-start, -end).map(i -> -i).toArray();
//	    }
}
