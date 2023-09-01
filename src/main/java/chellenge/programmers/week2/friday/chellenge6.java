package chellenge.programmers.week2.friday;

/*
 * 정수를 나선형으로 배치하기
문제 설명
양의 정수 n이 매개변수로 주어집니다. n × n 배열에 1부터 n2 까지 정수를 인덱스 
[0][0]부터 시계방향 나선형으로 배치한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ n ≤ 30
 *
 */
public class chellenge6 {

	public static void main(String[] args) {
//		입출력 예
//		n	result
//		4	[[1, 2, 3, 4], [12, 13, 14, 5], [11, 16, 15, 6], [10, 9, 8, 7]]
//		5	[[1, 2, 3, 4, 5], [16, 17, 18, 19, 6], [15, 24, 25, 20, 7], [14, 23, 22, 21, 8], [13, 12, 11, 10, 9]]
		
		int n = 5;
		System.out.println(solution(n));
		
	}
	
	public static int[][] solution(int n){
      int[][] answer = new int[n][n];
      int num = 1;
      int x = 0, y = 0;
      int dx[] = {0, 1, 0, -1};
      int dy[] = {1, 0, -1, 0};
      int direction = 0;

      while (num <= n * n) {
          answer[x][y] = num++;

          int nx = x + dx[direction]; 
          int ny = y + dy[direction];

          if (nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0) {
              direction = (direction + 1) % 4; //범위 밖에 나갔을 때 방향전환
              nx = x + dx[direction];
              ny = y + dy[direction];
          }
          x = nx;
          y = ny;
      }

      return answer;
		
	}
//	다른사람 코드
//	public int[][] solution(int n) {
//        int[][] answer = new int[n][n];
//        int num = 1;
//        int x = 0, y = 0;
//        int dx[] = {0, 1, 0, -1};
//        int dy[] = {1, 0, -1, 0};
//        int direction = 0;
//
//        while (num <= n * n) {
//            answer[x][y] = num++;
//
//            int nx = x + dx[direction]; 
//            int ny = y + dy[direction];
//
//            if (nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0) {
//                direction = (direction + 1) % 4; //범위 밖에 나갔을 때 방향전환
//                nx = x + dx[direction];
//                ny = y + dy[direction];
//            }
//            x = nx;
//            y = ny;
//        }
//
//        return answer;

	
}
