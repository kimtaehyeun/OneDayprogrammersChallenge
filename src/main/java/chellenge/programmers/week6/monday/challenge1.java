package chellenge.programmers.week6.monday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
 * 가장 큰 수
문제 설명
0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.

예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.

0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.

제한 사항
numbers의 길이는 1 이상 100,000 이하입니다.
numbers의 원소는 0 이상 1,000 이하입니다.
정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
 *
 */
public class challenge1 {
	public static void main(String[] args) {
//		입출력 예
//		numbers	return
//		[6, 10, 2]	"6210"
//		[3, 30, 34, 5, 9]	"9534330"
		int [] numbers= {0,0};
		System.out.println(solution(numbers));

	}
	
	
	public static String solution(int[] numbers) {
        String answer = "";
        //array로 변경
        Integer [] ar =Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        
        Arrays.sort(ar, new Comparator<Integer>() {
        	@Override
        	public int compare(Integer o1, Integer o2) {
        		String s1 = Integer.toString(o1); //6
        		String s2 = Integer.toString(o2);	//10
        		// 610 vs 106        		
        		return Integer.valueOf(s2+s1)-Integer.valueOf(s1+s2);
        	}
		});
        
        int zerocount=0;
        for(Integer i:ar) {
            if(i<1){
                zerocount++;
                continue;
            }
        	answer+=i+"";
        }
        if(answer.length()<1)
        	return "0";
        for(int i=0; i<zerocount; i++){
            answer+="0";
        }
        return answer;
    }

}