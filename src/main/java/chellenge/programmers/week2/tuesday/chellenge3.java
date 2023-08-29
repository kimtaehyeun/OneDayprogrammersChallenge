package chellenge.programmers.week2.tuesday;

/*
 *  글자 지우기
문제 설명
문자열 my_string과 정수 배열 indices가 주어질 때,
 my_string에서 indices의 원소에 해당하는 인덱스의 글자를 
 지우고 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.


제한사항
1 ≤ indices의 길이 < my_string의 길이 ≤ 100
my_string은 영소문자로만 이루어져 있습니다
0 ≤ indices의 원소 < my_string의 길이
indices의 원소는 모두 서로 다릅니다.

 *
 */
public class chellenge3 {

	public static void main(String[] args) {
//		입출력 예
//		my_string				indices							result
//		"apporoograpemmemprs"	[1, 16, 6, 15, 0, 10, 11, 3]	"programmers"	
		
		String my_string="apporoograpemmemprs";
		int indices[] = {1,16,6,15,0, 10, 11, 3};
		System.out.println(Solution(my_string, indices));
		
	}
	
	public static String  Solution(String my_string, int[] indices) {
		String answer ="";
		
		for(int i=0; i<my_string.length(); i++) {
			int count=0;
			for(int j=0; j<indices.length; j++) {
				if(indices[j]==i) {
					count++;
				}
			}
			if(count==0) {
				answer+=""+my_string.charAt(i);				
			}
		}
        return answer;
		

	}
}
