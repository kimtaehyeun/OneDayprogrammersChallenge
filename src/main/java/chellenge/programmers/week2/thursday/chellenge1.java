package chellenge.programmers.week2.thursday;

/*
 *  n 번째 원소부터
문제 설명
정수 리스트 num_list와 정수 n이 주어질 때, 
n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.

제한사항
2 ≤ num_list의 길이 ≤ 30
1 ≤ num_list의 원소 ≤ 9
1 ≤ n ≤ num_list의 길이
 *
 */
public class chellenge1 {

	public static void main(String[] args) {
//		num_list			n	result
//		[2, 1, 6]			3	[6]
//		[5, 2, 1, 7, 5]		2	[2, 1, 7, 5]	
		
		int [] num_list = {2,1,6};
		int n = 3;
		System.out.println(solution(num_list, n));
		
	}
	
	public static int[] solution(int[] num_list, int n) {
		int [] answer = new int[num_list.length+1-n];
		int j = 0;
		for(int i=n-1; i<num_list.length; i++) {
			answer[j]=num_list[i];
			j++;
		}
        return answer;
		
//다른사람 풀이				copyOfRanage(리스트, 시작인덱스, 끝인덱스)
//        int[] a= Arrays.copyOfRange(num_list, n-1, num_list.length);
//        return a;
	}
}