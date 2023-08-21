package chellenge.programmers.week1.monday;

/*
 * 이어 붙인 수
 * 
문제 설명
정수가 담긴 리스트 num_list가 주어집니다. num_list의 홀수만 순서대로 
이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.

제한사항
2 ≤ num_list의 길이 ≤ 10
1 ≤ num_list의 원소 ≤ 9
num_list에는 적어도 한 개씩의 짝수와 홀수가 있습니다.


 */
public class chellenge5 {

	public static void main(String[] args) {
		/*
		 	입출력 예
			num_list			result
			[3, 4, 5, 2, 1]		393
			[5, 7, 8, 3]		581


		 */
		int[] num_list = {3,4,5,2,1};
		System.out.println(Solution(num_list));

	}

	public static int Solution(int[] num_list) {
		int answer = 0;
		int odd=0;
		int even=0;
		for(int num:num_list) {
			if(num%2>0) {
				odd=odd*10+num;
				
			}
			else {
				even= even*10+num;
			}
			answer = odd+even;
			
		}
		return answer;

	}
}
