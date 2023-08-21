package chellenge.programmers.week1.monday;

import java.util.ArrayList;
import java.util.HashSet;

/*
 *  등차수열의 특정한 항만 더하기
 *  
 *  문제 설명
1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다.
 세 주사위를 굴렸을 때 나온 숫자를 각각 a, b, c라고 했을 때 얻는 점수는 다음과 같습니다.

세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.
세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (a + b + c) × (a2 + b2 + c2 )점을 얻습니다.
세 숫자가 모두 같다면 (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 )점을 얻습니다.
세 정수 a, b, c가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.

제한사항
a, b, c는 1이상 6이하의 정수입니다.

 */
public class chellenge3 {

	public static void main(String[] args) {
		//		입출력 예
		//		a	b	c	result
		//		2	6	1	9
		//		5	3	3	473
		//		4	4	4	110592


		int a = 5;
		int b = 3;
		int c = 3;
		System.out.println(Solution(a, b,c));

	}

	public static int Solution(int a, int b, int c) {
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);

		//		set으로 중복 제거
		HashSet<Integer> hs = new  HashSet<>(list);
		//		1 2 3 -> 3 hs.size
		//		1 1 2 -> 2
		//		1 1 1 -> 1
		int idx = 1;
		for(int i = 3; i>=hs.size(); i--) {
			int sum = 0;
			for(Integer num : list) {
				sum+= Math.pow(num, idx);
			}
			System.out.println(sum);
			if(answer>0) {
				answer=answer*sum;
			}
			else {
				answer+=sum;
			}
			idx++;
		}

		return answer;

	}
}
