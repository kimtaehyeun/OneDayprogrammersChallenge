package chellenge.programmers.week3.tuesday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 *  햄버거 만들기
문제 설명
햄버거 가게에서 일을 하는 상수는 햄버거를 포장하는 일을 합니다.
 함께 일을 하는 다른 직원들이 햄버거에 들어갈 재료를 조리해 주면
  조리된 순서대로 상수의 앞에 아래서부터 위로 쌓이게 되고, 상수
  는 순서에 맞게 쌓여서 완성된 햄버거를 따로 옮겨 포장을 하게 됩
  니다. 상수가 일하는 가게는 정해진 순서(아래서부터, 빵 – 야채 – 
  고기 - 빵)로 쌓인 햄버거만 포장을 합니다. 상수는 손이 굉장히 빠르
  기 때문에 상수가 포장하는 동안 속 재료가 추가적으로 들어오는 일은 없
  으며, 재료의 높이는 무시하여 재료가 높이 쌓여서 일이 힘들어지는 경우는 없습니다.


예를 들어, 상수의 앞에 쌓이는 재료의 순서가 [야채, 빵, 빵, 야채, 
고기, 빵, 야채, 고기, 빵]일 때, 상수는 여섯 번째 재료가 쌓였을 때, 
세 번째 재료부터 여섯 번째 재료를 이용하여 햄버거를 포장하고, 
아홉 번째 재료가 쌓였을 때, 두 번째 재료와 일곱 번째 재료부터 아홉 번째 
재료를 이용하여 햄버거를 포장합니다. 즉, 2개의 햄버거를 포장하게 됩니다.

상수에게 전해지는 재료의 정보를 나타내는 정수 배열 ingredient가 
주어졌을 때, 상수가 포장하는 햄버거의 개수를 return 하도록 solution 함수를 완성하시오.

제한사항
1 ≤ ingredient의 길이 ≤ 1,000,000
ingredient의 원소는 1, 2, 3 중 하나의 값이며, 순서대로 빵, 야채, 고기를 의미합니다.
 *
 */
public class chellenge6 {

	public static void main(String[] args) {
//		입출력 예
//		ingredient	result
//		[2, 1, 1, 2, 3, 1, 2, 3, 1]	2
//		[1, 3, 2, 1, 2, 1, 3, 1, 2]	0
		int [] ingredient= {2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 3, 1, 3, 1};
		System.out.println(solution(ingredient));

	}

	public static int solution(int[] ingredient) {
		int answer = 0;
        String ingredient_string = "";
        for(int i:ingredient) {
        	ingredient_string+=i+"";
        }
        
        boolean check = true;
        int count = 0;
        while(check){
        	int idx = ingredient_string.indexOf("1231", count);
        	if(idx!=-1) {
        		ingredient_string = ingredient_string.substring(0, idx)+ingredient_string.substring(idx+1);
        		count = idx-4;
        		answer ++;
        		continue;
        	}
        	check=false;
        }
        return answer;
    }
	//실패코드 - 런타임 에러
//	boolean check = true;
//    ArrayList<Integer> ar = new ArrayList<>();
//    for(int i:ingredient){
//        ar.add(i);
//    }
//    while(check){
//        int result =0;
//        
//        for(int i=0; i<ar.size()-3; i++){
//            if(ar.get(i)==1){
//                if(ar.get(i+1)==2&&ar.get(i+2)==3&&ar.get(i+3)==1){//햄버거가 완성되면
//                	for(int j=i;j<i+4; j++){
//                        ar.remove(i);
//                    }
//                    answer++;
//                    result++;
//                    break;
//                }
//            } 
//            
//        }
//        if(ar.size()<4&&result<1){
//            check = false;
//        }
//    }	
}


