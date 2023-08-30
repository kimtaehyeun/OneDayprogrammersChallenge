package chellenge.programmers.week2.wednesday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 *  2의 영역
문제 설명
정수 배열 arr가 주어집니다. 배열 안의 2가 모두 포함된 가장 작은 연속된
 부분 배열을 return 하는 solution 함수를 완성해 주세요.

단, arr에 2가 없는 경우 [-1]을 return 합니다.

제한사항
1 ≤ arr의 길이 ≤ 100,000
1 ≤ arr의 원소 ≤ 10
 *
 */
public class chellenge4 {

	public static void main(String[] args) {
//		입출력 예
//		arr							result
//		[1, 2, 1, 4, 5, 2, 9]		[2, 1, 4, 5, 2]
//		[1, 2, 1]					[2]
//		[1, 1, 1]					[-1]
//		[1, 2, 1, 2, 1, 10, 2, 1]	[2, 1, 2, 1, 10, 2]	
		
		
		int arr[]= {2,10,2};
		
		
		
		System.out.println(Solution(arr));
		
	}
	
	public static int[] Solution(int[] arr) {
		int[] answer = {-1};		
		List<Integer> idxAr =new ArrayList<>();
		List<Integer> ar = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==2) {
				idxAr.add(i);
			}
		}
		if(idxAr.size()==0){
			return answer;
		}
		else {
			for(int i=idxAr.get(0); i<=idxAr.get(idxAr.size()-1); i++) {
				ar.add(arr[i]);
			}
		}
		
        return ar.stream().mapToInt(Integer::intValue).toArray();

	}
	//다른사람풀이- IntStream.의 filter
//	  public int[] solution(int[] arr) {
//	        int[] idxs = IntStream.range(0, arr.length).filter(i -> arr[i] == 2).toArray();
//
//	        if(idxs.length == 0) {
//	            int[] zero = {-1};
//	            return zero;
//	        }
//	        else if(idxs.length == 1) {
//	            int[] one = {2};
//	            return one;
//	        }
//	        else {
//	            return IntStream.rangeClosed(idxs[0],idxs[idxs.length-1]).map(i->arr[i]).toArray();
//	        }
//	    }
	
}
