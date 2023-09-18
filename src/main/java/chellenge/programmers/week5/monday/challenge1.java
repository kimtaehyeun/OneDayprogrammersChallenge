package chellenge.programmers.week5.monday;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * 디스크 컨트롤러
 * 
문제 설명
하드디스크는 한 번에 하나의 작업만 수행할 수 있습니다. 디스크 컨트롤러를 구현하는 방법은 여러 가지가 있습니다. 가장 일반적인 방법은 요청이 들어온 순서대로 처리하는 것입니다.

예를들어

- 0ms 시점에 3ms가 소요되는 A작업 요청
- 1ms 시점에 9ms가 소요되는 B작업 요청
- 2ms 시점에 6ms가 소요되는 C작업 요청

- A: 3ms 시점에 작업 완료 (요청에서 종료까지 : 3ms)
- B: 1ms부터 대기하다가, 3ms 시점에 작업을 시작해서 12ms 시점에 작업 완료(요청에서 종료까지 : 11ms)
- C: 2ms부터 대기하다가, 12ms 시점에 작업을 시작해서 18ms 시점에 작업 완료(요청에서 종료까지 : 16ms)


- A: 3ms 시점에 작업 완료(요청에서 종료까지 : 3ms)
- C: 2ms부터 대기하다가, 3ms 시점에 작업을 시작해서 9ms 시점에 작업 완료(요청에서 종료까지 : 7ms)
- B: 1ms부터 대기하다가, 9ms 시점에 작업을 시작해서 18ms 시점에 작업 완료(요청에서 종료까지 : 17ms)

이렇게 A → C → B의 순서로 처리하면 각 작업의 요청부터 종료까지 걸린 시간의 평균은 9ms(= (3 + 7 + 17) / 3)가 됩니다.

각 작업에 대해 [작업이 요청되는 시점, 작업의 소요시간]을 담은 2차원 배열 jobs가 매개변수로 주어질 때, 작업의 요청부터 종료까지 걸린 시간의 평균을 가장 줄이는 방법으로 처리하면 평균이 얼마가 되는지 return 하도록 solution 함수를 작성해주세요. (단, 소수점 이하의 수는 버립니다)

제한 사항
jobs의 길이는 1 이상 500 이하입니다.
jobs의 각 행은 하나의 작업에 대한 [작업이 요청되는 시점, 작업의 소요시간] 입니다.
각 작업에 대해 작업이 요청되는 시간은 0 이상 1,000 이하입니다.
각 작업에 대해 작업의 소요시간은 1 이상 1,000 이하입니다.
하드디스크가 작업을 수행하고 있지 않을 때에는 먼저 요청이 들어온 작업부터 처리합니다.
 *
 */
public class challenge1 {
	public static void main(String[] args) {
//		입출력 예
//		jobs	return
//		[[0, 3], [1, 9], [2, 6]]	9
//		입출력 예 설명
//		문제에 주어진 예와 같습니다.
//[0, 6], [2, 8], [3, 7], [7, 1], [11, 11], [19, 25], [30, 15], [32, 6], [40, 3]
//		0ms 시점에 3ms 걸리는 작업 요청이 들어옵니다.
//		1ms 시점에 9ms 걸리는 작업 요청이 들어옵니다.
//		2ms 시점에 6ms 걸리는 작업 요청이 들어옵니다.
//		int [][] jobs= {{0, 6},{2, 8},{3, 7},{7, 1},{11, 11},{19, 25},{30, 15},{32, 6},{40, 3}};
		int [][] jobs= {{0, 6},{2, 8},{3, 7},{7, 1},{11, 11},{19, 25},{30, 15},{32, 6},{40, 3}};
		System.out.println(solution(jobs));

	}

	public static int solution(int[][] jobs) {
        int answer = 0;
        
        PriorityQueue<int []> pq = new PriorityQueue<>(new Comparator<int[]>() {
			@Override// job의 요청 오름차순으로 정렬
			public int compare(int[] o1, int[] o2) {
				if(o1[0]==o2[0]) {
					return Integer.compare(o1[1], o2[1]);
				}
				return Integer.compare(o1[0], o2[0]);
			}
		});
        for(int [] job:jobs) {
        	pq.offer(job);
        }
        
        
        PriorityQueue<int []> statuspq = new PriorityQueue<>(new Comparator<int[]>() {
			@Override// 대기중인 요청들 길이 짧은순으로 정렬
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[1], o2[1]);//
			}
		});
        //초기값 셋팅
        int time = 0;
        while(!statuspq.isEmpty()||!pq.isEmpty()) {
        	while(!pq.isEmpty()&& time>=pq.peek()[0]) {
        		statuspq.offer(pq.poll());
        	}
        	if(statuspq.isEmpty()&&!pq.isEmpty()) {//작업이 없으면
        		statuspq.offer(pq.poll());
        		time=statuspq.peek()[0];//요청시간
        	}
        	
        	int [] temp = statuspq.poll();
        	answer+= time +temp[1]-temp[0];
        	time+=temp[1];
        	
        	
        }
        return answer/jobs.length;
    }
	
}