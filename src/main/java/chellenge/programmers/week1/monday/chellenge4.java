package chellenge.programmers.week1.monday;

/*
 * 원소들의 곱과 합

문제 설명
정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
제한사항
a, b, c는 1이상 6이하의 정수입니다.

제한사항
2 ≤ num_list의 길이 ≤ 10
1 ≤ num_list의 원소 ≤ 9


 */
public class chellenge4 {

	public static void main(String[] args) {
		/*
		 	입출력 예
			num_list		result
			[3, 4, 5, 2, 1]		1
			[5, 7, 8, 3]		0


		 */
		int[] num_list = {3,4,5,2,1};
		System.out.println(Solution(num_list));

	}

	public static int Solution(int[] num_list) {
		int answer = 0;
		int svg=1;
		int sum = 0;
		for(int num:num_list) {
			svg = svg*num;
			sum = sum+num;
		}
		answer = svg<Math.pow(sum, 2) ? 1:0;
		
		return answer;

	}
}
