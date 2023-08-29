package chellenge.programmers.week2.tuesday;
/*
 *  문자 개수 세기
문제 설명
알파벳 대소문자로만 이루어진 문자열 my_string이 주어질 때, 
my_string에서 'A'의 개수, my_string에서 'B'의 개수,..., 
my_string에서 'Z'의 개수, my_string에서 'a'의 개수, 
my_string에서 'b'의 개수,..., my_string에서 'z'의 개수를
 순서대로 담은 길이 52의 정수 배열을 return 하는 solution 함수를 작성해 주세요.



제한사항
1 ≤ my_string의 길이 ≤ 1,000
 *
 */
public class chellenge1 {

	public static void main(String[] args) {
//		입출력 예
//		my_string		result
//		"Programmers"	[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0]
		
		
		String my_string="Programmers";
		
		System.out.println(Solution(my_string));
		
	}
	
	public static int []  Solution(String my_string) {
		int [] answer = new int[52];
		for(int i=0; i<my_string.length(); i++) {
			if(my_string.charAt(i)>96) {
				answer[my_string.charAt(i)-6-65]+=1;
			}
			else {
				answer[my_string.charAt(i)-65]+=1;
			}
		}
        return answer;
		

	}
}
