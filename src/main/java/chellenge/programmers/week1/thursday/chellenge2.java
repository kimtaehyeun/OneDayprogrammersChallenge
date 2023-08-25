package chellenge.programmers.week1.thursday;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class chellenge2 {
	/*
	 * 주사위 게임 3
	 * 
	문제 설명
	1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 
	네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.

	네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
	세 주사위에서 나온 숫자가 p로 같고 나머지 
	다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.

	주사위가 두 개씩 같은 값이 나오고, 
	나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.

	어느 두 주사위에서 나온 숫자가 p로 같고 
	나머지 두 주사위에서 나온 숫자가 각각 p와 
	다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.

	네 주사위에 적힌 숫자가 모두 다르다면 나온 
	숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.

	네 주사위를 굴렸을 때 나온 숫자가 정수 
	매개변수 a, b, c, d로 주어질 때, 얻는 점수를 
	return 하는 solution 함수를 작성해 주세요.

	제한사항
	a, b, c, d는 1 이상 6 이하의 정수입니다.

	 */
	public static void main(String[] args) {
		//		입출력 예
		//		a	b	c	d	result
		//		2	2	2	2	2222
		//		4	1	4	4	1681
		//		6	3	3	6	27
		//		2	5	2	6	30
		//		6	4	2	5	2

		int a =1;
		int b=1;
		int c=1;
		int d=4;
		System.out.println(Solution(a,b,c,d));

	}

	public static int  Solution(int a, int b, int c, int d) {
		int answer = 0;

		String number = ""+a+b+c+d;
		
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i=1; i<=6; i++) {
			int count = 0;
			char ch = Character.forDigit(i, 10);
			for(int j=0; j<number.length(); j++) {
				if(number.charAt(j)==ch) {
					count++;	
				}
			}
			if(count>0) {
				map.put(i,count);
			}
		}
		Iterator iterator = map.entrySet().iterator();
		//모두동일 2222
		if(map.size()==1) {
			answer=a*1111;
		}
		//2 2 or 3 1 map은 두개가 들어있음
		else if(map.size()==2) {
			Entry<Integer, Integer> map1 = (Entry)iterator.next();
			Entry<Integer, Integer> map2 = (Entry)iterator.next();
			
			if(map1.getValue()==2) {//2개 2개
				answer= (map1.getKey()+map2.getKey())*Math.abs(map1.getKey()-map2.getKey());
			}
			else {//3 1개 or 1 3개
				if(map1.getValue()==1) {
					answer = (int)Math.pow(10*map2.getKey()+map1.getKey(), 2);
				}
				else {
					answer = (int)Math.pow(10*map1.getKey()+map2.getKey(), 2);
				}
			}
			
		}
		else if(map.size()==3){
			int num=1;
			while(iterator.hasNext()) {
				Entry<Integer, Integer> entry = (Entry)iterator.next();
				if(entry.getValue()<2) {
					num*=entry.getKey();
				}
			}
			answer = num;
		}
		else {
			answer = Math.min(Math.min(a, b),Math.min(c, d));
		}

		return answer;

	}

}