package chellenge.programmers.week2.tuesday;

import java.util.ArrayList;
import java.util.List;

/*
 *  배열 만들기 1
문제 설명
정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를 
오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

제한사항
1 ≤ n ≤ 1,000,000
1 ≤ k ≤ min(1,000, n)

 *
 */
public class chellenge2 {

	public static void main(String[] args) {
//		입출력 예
//		n	k	result
//		10	3	[3, 6, 9]
//		15	5	[5, 10, 15]	
		
		int n=10;
		int k=3;
		System.out.println(Solution(n,k));
		
	}
	
	public static int []  Solution(int n, int k) {
		int [] answer = {};
		List<Integer> ar = new ArrayList<>();
		for(int i=k; i<=n; i+=k) {
			ar.add(i);
		}
        return answer=ar.stream().mapToInt(Integer::intValue).toArray();
		

	}
}
