package chellenge.programmers.week2.thursday;

import java.util.ArrayList;
import java.util.List;

/*
 * 순서 바꾸기
문제 설명
정수 리스트 num_list와 정수 n이 주어질 때, num_list를 
n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠 n 번째 원소 이후의 원소들을 
n 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.

제한사항
2 ≤ num_list의 길이 ≤ 30
1 ≤ num_list의 원소 ≤ 9
1 ≤ n ≤ num_list의 길이
 *
 */
public class chellenge2 {

	public static void main(String[] args) {
//		num_list			n	result
//		[2, 1, 6]			3	[6]
//		[5, 2, 1, 7, 5]		2	[2, 1, 7, 5]	
		
		int [] num_list = {2,1,6};
		int n = 1;
		System.out.println(solution(num_list, n));
		
	}
	
	public static int[] solution(int[] num_list, int n) {
		int [] answer = new int[num_list.length];
		int j= 0; 
		for(int i=0; i<num_list.length; i++) {
			if(n+i<num_list.length) {				
				answer[i]=num_list[n+i];
			}
			else {
				answer[i]=num_list[j];
				j++;
			}
		}
        return answer;
		
	}
	//다른사람 풀이   인덱스를 일부러 초과시키고선 나머지 연산으로 안쪽으로 넣기
//	return IntStream.range(0, num_list.length).map(i -> num_list[(i + n) % num_list.length]).toArray();
}