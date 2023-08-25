package chellenge.programmers.week1.thursday;

public class chellenge5 {
	/*
	 * 문자열 여러 번 뒤집기
	문제 설명
	
	문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다.
	 queries의 원소는 [s, e] 형태로, my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 
	 의미입니다. my_string에 queries의 명령을 순서대로 처리한 후의 
	 문자열을 return 하는 solution 함수를 작성해 주세요.
	
	제한사항
	
	my_string은 영소문자로만 이루어져 있습니다.
	1 ≤ my_string의 길이 ≤ 1,000
	queries의 원소는 [s, e]의 형태로 0 ≤ s ≤ e < my_string의 길이를 만족합니다.
	1 ≤ queries의 길이 ≤ 1,000
	 */
	public static void main(String[] args) {
//		입출력 예
//		my_string			queries							result
//		"rermgorpsam"	[[2, 3], [0, 7], [5, 9], [6, 10]]	"programmers	
		
		String my_string="rermgorpsam";
		int[][] queries= {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
		
		System.out.println(Solution(my_string,queries));
		
	}
	
	public static String  Solution(String my_string, int[][] queries) {
		String answer= "";
		char [] ar= my_string.toCharArray();
		for(int[] idx:queries) {
			String sub = my_string.substring(idx[0], idx[1]+1);
			String rep= "";
			for(int i=sub.length()-1; i>=0; i--) {
				rep+=sub.charAt(i)+"";
			}
			int length =0;
			for(int i=idx[0];i<idx[1]+1;i++) {
				ar[i]=rep.charAt(length);
				length++;
			}
			
			String after ="";
			for(int i =0; i<ar.length; i++) {
				after +=ar[i]+"";
			}
			my_string=after;
		}
		return my_string;
		

	}
}
