package chellenge.programmers.week2.friday;
/*
 *  홀수 vs 짝수
문제 설명
정수 리스트 num_list가 주어집니다. 가장 첫 번째 원소를 1번 원소라고 할 때, 

홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return 하도록 solution 함수를 완성해주세요. 
두 값이 같을 경우 그 값을 return합니다.

제한사항
5 ≤ num_list의 길이 ≤ 50
-9 ≤ num_list의 원소 ≤ 9


 *
 */
public class chellenge1 {

	public static void main(String[] args) {
//		입출력 예
//		num_list			result
//		[4, 2, 6, 1, 7, 6]		17
//		[-1, 2, 5, 6, 3]		8
		
		
		int [] num_list = {4, 2, 6, 1, 7, 6};
		System.out.println(Solution(num_list));
		
	}
	
	public static int Solution(int[] num_list) {
		
		int answer = 0;
        int a =0; //홀수
        int b = 0; //짝수
        for(int i=0; i<num_list.length; i++){
            if(i%2!=0){
                a+=num_list[i];
            }
            else{
                b+=num_list[i];
            }

        }
        answer = a>b ? a:b;
        return answer;
		
	}
}
