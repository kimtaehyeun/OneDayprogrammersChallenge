package chellenge.programmers.week2.thursday;

/*
 * n개 간격의 원소들
문제 설명
정수 리스트 num_list와 정수 n이 주어질 때, 
num_list의 첫 번째 원소부터 마지막 원소까지 
n개 간격으로 저장되어있는 원소들을 차례로 담은 
리스트를 return하도록 solution 함수를 완성해주세요.

제한사항
5 ≤ num_list의 길이 ≤ 20
1 ≤ num_list의 원소 ≤ 9
1 ≤ n ≤ 4


 *
 */
public class chellenge5 {

	public static void main(String[] args) {
//		입출력 예
//		num_list			n	result
//		[4, 2, 6, 1, 7, 6]	2	[4, 6, 7]
//		[4, 2, 6, 1, 7, 6]	4	[4, 7]
		
		int [] num_list = {4, 2, 6, 1, 7, 6};
		int n = 1;
		
		System.out.println(solution(num_list, n));
		
	}
	
	public static int[] solution(int[] num_list, int n) {
		int[] answer = new int[1+((num_list.length-1)/n)];
		int j=0;
		for(int i=0; i<num_list.length; i+=n) {
			answer[j]=num_list[i];
			j++;
		}
        return answer;
		
//
	}
}
