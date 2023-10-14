package chellenge.programmers.week8.saturday;

/*
 *타겟 넘버
문제 설명
n개의 음이 아닌 정수들이 있습니다. 이 정수들을 순서를 바꾸지 않고 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다. 예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.

-1+1+1+1+1 = 3
+1-1+1+1+1 = 3
+1+1-1+1+1 = 3
+1+1+1-1+1 = 3
+1+1+1+1-1 = 3
사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.

제한사항
주어지는 숫자의 개수는 2개 이상 20개 이하입니다.
각 숫자는 1 이상 50 이하인 자연수입니다.
타겟 넘버는 1 이상 1000 이하인 자연수입니다.
 * 
 */
public class challenge1 {

	public static int answer =0;
	public static void main(String[] args) {
//		입출력 예
//		numbers	target	return
//		[1, 1, 1, 1, 1]	3	5
//		[4, 1, 2, 1]	4	2

		int [] triangle = {1, 1, 1, 1, 1};
		int target = 3;
		System.out.println(solution(triangle, target));

	}

	
	
	public static int solution(int[] numbers, int target) {
        //주어지는 수 : numbers- int배열, target -목표 수
        //dfs사용해서 깊이탐색
        //answer은 ++;
        //다른 메서드에서도 쓰기위해 answer은 전역변수로 올림
        dfs(0,0,numbers,target);
        
        
        return answer;
    }
	public static void dfs(int sum, int idx, int [] numbers, int target){
        //idx가 모든 수를 거쳤을때 조건
        if(idx==numbers.length&&target==sum){
            answer++;
            return;
        }
        //최대 numbers.length번 까지 가능
        if(idx>=numbers.length)
            return;
        
        //경우의 수는 - 아니면 +    
        dfs(sum+numbers[idx],idx+1,numbers,target);
        dfs(sum-numbers[idx],idx+1,numbers,target);
        
        
    }



}