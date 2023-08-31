package chellenge.programmers.week2.thursday;

import java.util.ArrayList;
import java.util.List;

/*
 * 왼쪽 오른쪽
문제 설명
문자열 리스트 str_list에는 "u", "d", "l", "r" 네 개의 문자열이 여러 개 저장되어 있습니다.
 str_list에서 "l"과 "r" 중 먼저 나오는 문자열이 "l"이라면 해당 문자열을 기준으로 왼쪽에 있는 
 문자열들을 순서대로 담은 리스트를, 먼저 나오는 문자열이 "r"이라면 해당 문자열을 기준으로 
 오른쪽에 있는 문자열들을 순서대로 담은 리스트를 return하도록 solution 함수를 완성해주세요. 
 "l"이나 "r"이 없다면 빈 리스트를 return합니다.

제한사항
1 ≤ str_list의 길이 ≤ 20
str_list는 "u", "d", "l", "r" 네 개의 문자열로 이루어져 있습니다.
 *
 */
public class chellenge3 {

	public static void main(String[] args) {
//		입출력 예
//		str_list				result
//		["u", "u", "l", "r"]	["u", "u"]
//		["l"]					[]
		
		String [] str_list = {"u", "u", "l", "r"};
		System.out.println(solution(str_list));
		
	}
	
	public static String[] solution(String[] str_list) {
		String[] answer = {};
		List<String> ar= new ArrayList<>();
		for(int i=0; i<str_list.length; i++) {
			if(str_list[i].equals("l")) {
				for(int j=0; j<i; j++) {
					ar.add(str_list[j]);
				}
				return answer= ar.toArray(new String[ar.size()]);
			}
			else if(str_list[i].equals("r")){
				for(int j=i+1; j<str_list.length; j++) {
					ar.add(str_list[j]);
				}
				return answer= ar.toArray(new String[ar.size()]);
			}
		}
        return answer;
		
	}
	//다른사람 풀이 
//	return IntStream.range(0, str_list.length)
//    .boxed()
//    .filter(i -> str_list[i].equals("l") || str_list[i].equals("r"))
//    .findFirst()
//    .map(i -> {
//        if (str_list[i].equals("l")) {
//            return Arrays.copyOfRange(str_list, 0, i);
//        }
//        return Arrays.copyOfRange(str_list, i + 1, str_list.length);
//    })
//    .orElseGet(() -> new String[]{});
}