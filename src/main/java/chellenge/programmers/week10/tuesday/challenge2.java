package chellenge.programmers.week10.tuesday;

import java.util.Arrays;

/*
 *  조이스틱
문제 설명
조이스틱으로 알파벳 이름을 완성하세요. 맨 처음엔 A로만 이루어져 있습니다.
ex) 완성해야 하는 이름이 세 글자면 AAA, 네 글자면 AAAA

조이스틱을 각 방향으로 움직이면 아래와 같습니다.

▲ - 다음 알파벳
▼ - 이전 알파벳 (A에서 아래쪽으로 이동하면 Z로)
◀ - 커서를 왼쪽으로 이동 (첫 번째 위치에서 왼쪽으로 이동하면 마지막 문자에 커서)
▶ - 커서를 오른쪽으로 이동 (마지막 위치에서 오른쪽으로 이동하면 첫 번째 문자에 커서)
예를 들어 아래의 방법으로 "JAZ"를 만들 수 있습니다.

- 첫 번째 위치에서 조이스틱을 위로 9번 조작하여 J를 완성합니다.
- 조이스틱을 왼쪽으로 1번 조작하여 커서를 마지막 문자 위치로 이동시킵니다.
- 마지막 위치에서 조이스틱을 아래로 1번 조작하여 Z를 완성합니다.
따라서 11번 이동시켜 "JAZ"를 만들 수 있고, 이때가 최소 이동입니다.
만들고자 하는 이름 name이 매개변수로 주어질 때, 이름에 대해 조이스틱 조작 횟수의 최솟값을 return 하도록 solution 함수를 만드세요.

제한 사항
name은 알파벳 대문자로만 이루어져 있습니다.
name의 길이는 1 이상 20 이하입니다.

 *
 */
public class challenge2 {

	public static void main(String[] args) {
// 
//		입출력 예
//		name	return
//		"JEROEN"	56
//		"JAN"	23
		
		
		String name="JEROEN";
		
		System.out.println(solution(name));
		
	}
	
	public static int solution(String name) {
        int answer = 0;
        //1. 첫글자와 마지막글자 사이에 A가 있으면서 맨끝에 A가 아닌수일때는 조이스틱을 왼쪽으로 이동시키기
        //2. 아니면 오른쪽방향
        //3. 마지막에 A가 나오는지 체크
        answer= (int)name.charAt(answer);
        name.indexOf("A");
        //4. 모든수는 65부터 시작하기때문에 +13 = 78보다 크면 아래로 내리는게 더 최소
        
        return answer;
    }

}
