package chellenge.programmers.week1.tuesday;

public class chellenge4 {
	/*
	 * 수열과 구간 쿼리 3
	 * 
	 * 문제 설명
	정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다.
	
	각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.
	
	위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
	
	제한사항
	1 ≤ arr의 길이 ≤ 1,000
	0 ≤ arr의 원소 ≤ 1,000,000
	1 ≤ queries의 길이 ≤ 1,000
	0 ≤ i < j < arr의 길이
	 *
	 */
	public static void main(String[] args) {
//		입출력 예
//		arr				queries					result
//		[0, 1, 2, 3, 4]	[[0, 3],[1, 2],[1, 4]]	[3, 4, 1, 0, 2]		
		int [] arr = {0,1,2,3,4};
		int [][]queries ={{0,3},{1,2},{1,4}};
		
		System.out.println(Solution(arr,queries));

	}

	public static int[]   Solution(int[] arr, int[][] queries) {
		 int[] answer = {};
		 for(int i=0; i<queries.length; i++) {
			 int temp = arr[queries[i][0]];
			 arr[queries[i][0]]=arr[queries[i][1]];
			 arr[queries[i][1]]= temp;
				 
		 }
	       return answer=arr;

	}
	//다른사람 풀이
	
//	List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
//
//    for (int[] query : queries) {
//        Collections.swap(list, query[0], query[1]);
//	컬렉션 swap을 이용하여 자리바꿈
//    }
//    return list;
}

