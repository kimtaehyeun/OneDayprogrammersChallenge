package chellenge.programmers.week8.thursday;

/*
 *정수 삼각형
문제 설명
스크린샷 2018-09-14 오후 5.44.19.png

위와 같은 삼각형의 꼭대기에서 바닥까지 이어지는 경로 중, 거쳐간 숫자의 합이 가장 큰 경우를 찾아보려고 합니다. 아래 칸으로 이동할 때는 대각선 방향으로 한 칸 오른쪽 또는 왼쪽으로만 이동 가능합니다. 예를 들어 3에서는 그 아래칸의 8 또는 1로만 이동이 가능합니다.

삼각형의 정보가 담긴 배열 triangle이 매개변수로 주어질 때, 거쳐간 숫자의 최댓값을 return 하도록 solution 함수를 완성하세요.

제한사항
삼각형의 높이는 1 이상 500 이하입니다.
삼각형을 이루고 있는 숫자는 0 이상 9,999 이하의 정수입니다.

 * 
 */

public class challenge1 {
    static boolean[] check;
    public static void main(String[] args) {
//		입출력 예
//		triangle	result
//		[[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]]	30

		int [][] computers = {{1, 1, 0},{1, 1, 0},{0, 0, 1}};
		int n = 3;
		System.out.println(solution(n, computers));

	}
    public static int solution(int n, int[][] computers) {
        //네트워크 개수 구하기 - 모두 연결되어있으면 1
        //주어진것 : n - 컴퓨터 수, computers - 인덱스별 컴퓨터의 연결자(본인 컴퓨터 인덱스는 항상 1)
        //n 이 늘어날수록 [+1][+1]이 된다.
        //중요한 제한사항은 [i][i] = 1이다.
        
        check = new boolean[n];
        int answer = 0;
        for(int i=0; i<n; i++){
            if(!check[i]){
                check[i]=true;
                answer++;
                search(i,computers);
            }
        }
        return answer;
    }
    static void search(int i, int[][] computers){
        for(int j=0; j<computers.length; j++){
            if(check[j]||i==j)continue;
            
            if(computers[i][j]==1){
                check[j]=true;
                search(j,computers);
            }
            
        }
    }
    
}
