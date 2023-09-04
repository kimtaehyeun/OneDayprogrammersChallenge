package chellenge.programmers.week3.monday;

/*
 *  1로 만들기
문제 설명
정수가 있을 때, 짝수라면 반으로 나누고, 홀수라면 1을 뺀 뒤 반으로 나누면, 마지막엔 1이 됩니다. 
예를 들어 10이 있다면 다음과 같은 과정으로 1이 됩니다.

10 / 2 = 5
(5 - 1) / 2 = 4
4 / 2 = 2
2 / 2 = 1
위와 같이 4번의 나누기 연산으로 1이 되었습니다.

정수들이 담긴 리스트 num_list가 주어질 때, num_list의 모든 
원소를 1로 만들기 위해서 필요한 나누기 연산의 횟수를 return하도록 solution 함수를 완성해주세요.

 *
 */
public class chellenge3 {

	public static void main(String[] args) {
//		입출력 예
//		num_list	result
//		[12, 4, 15, 1, 14]	11

		int [] num_list = {12, 4, 15, 1, 14};

		System.out.println(solution(num_list));

	}

	public static int solution(int[] num_list) {
		int answer = 0;
        for(int i=0; i<num_list.length; i++){
            while(num_list[i]>1){
                if(num_list[i]%2==0)
                    num_list[i]=num_list[i]/2;
                else
                    num_list[i]=(num_list[i]-1)/2;
                answer++;
            }
        }
        return answer;
    }

}
