package chellenge.programmers.week4.tuesday;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 *  간단한 식 계산하기
문제 설명
문자열 binomial이 매개변수로 주어집니다. binomial은 "a op b" 
형태의 이항식이고 a와 b는 음이 아닌 정수, op는 '+', '-', '*' 중 하나입니다. 
주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해 주세요.

제한사항
0 ≤ a, b ≤ 40,000
0을 제외하고 a, b는 0으로 시작하지 않습니다.
 *
 */
public class challenge4 {

	public static void main(String[] args) {
//		입출력 예
//		binomial	result
//		"43 + 12"	55
//		"0 - 7777"	-7777
//		"40000 * 40000"	1600000000

		
		String binomial = "43 + 12";
		
		System.out.println(solution(binomial));

	}

	public static int solution(String binomial) {
        String [] ar=  binomial.split(" ");
        String sign = ar[1];
        if(sign.equals("+")){
            return Integer.parseInt(ar[0])+Integer.parseInt(ar[2]);
        }
        else if(sign.equals("*")){
            return Integer.parseInt(ar[0])*Integer.parseInt(ar[2]);
        }
        else if(sign.equals("-")){
            return Integer.parseInt(ar[0])-Integer.parseInt(ar[2]);
        }
        
        return 0;
    }
	
}
