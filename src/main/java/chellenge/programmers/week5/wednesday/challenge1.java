package chellenge.programmers.week5.wednesday;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
 * 이중우선순위큐
문제 설명
이중 우선순위 큐는 다음 연산을 할 수 있는 자료구조를 말합니다.

명령어	수신 탑(높이)
I 숫자	큐에 주어진 숫자를 삽입합니다.
D 1	큐에서 최댓값을 삭제합니다.
D -1	큐에서 최솟값을 삭제합니다.
이중 우선순위 큐가 할 연산 operations가 매개변수로 주어질 때, 모든 연산을 처리한 후 큐가 비어있으면 [0,0] 비어있지 않으면 [최댓값, 최솟값]을 return 하도록 solution 함수를 구현해주세요.

제한사항
operations는 길이가 1 이상 1,000,000 이하인 문자열 배열입니다.
operations의 원소는 큐가 수행할 연산을 나타냅니다.
원소는 “명령어 데이터” 형식으로 주어집니다.- 최댓값/최솟값을 삭제하는 연산에서 최댓값/최솟값이 둘 이상인 경우, 하나만 삭제합니다.
빈 큐에 데이터를 삭제하라는 연산이 주어질 경우, 해당 연산은 무시합니다.
 *
 */
public class challenge1 {
	public static void main(String[] args) {
		//		입출력 예
		//		operations	return
		//		["I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"]	[0,0]
		//		["I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"]	[333, -45]
		String [] jobs= {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
		System.out.println(solution(jobs));

	}
	
	public static PriorityQueue<Integer> getMaxPq(PriorityQueue<Integer> pq) {
		PriorityQueue<Integer> tempPq = new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer o1,Integer o2) {
				return Integer.compare(o2, o1);
			};
		});
		tempPq.addAll(pq);
		return tempPq;
	}
	public static int[] solution(String[] operations) {
		
		int[] answer = new int[2];

		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer o1,Integer o2) {
				return Integer.compare(o1, o2);
			};
		});

		for(String items : operations){
			String [] item = items.split(" ");
			if(item[0].equals("D")){
				if(pq.size()==0)
					continue;
				if(Integer.parseInt(item[1])>0) {
					PriorityQueue<Integer> temp=getMaxPq(pq);
					temp.poll();
					pq.removeAll(pq);
					pq.addAll(temp);
					
				}
				else {
					pq.poll();
				}
			}
			else
				pq.offer(Integer.parseInt(item[1]));
		}

		if(pq.size()>=2) {
			answer[0]=getMaxPq(pq).poll();
			answer[1]=pq.poll();
		}
		

		return answer;
	}

}