package chellenge.programmers.week4.saturday;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/*
 *  주식가격
문제 설명
초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.

제한사항
prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
prices의 길이는 2 이상 100,000 이하입니다.

 *
 */
public class challenge1 {
	static class Stock{
        int price;
        int time;
        public Stock(int price, int time){
            this.price = price;
            this.time = time;
            
        }
    }
	public static void main(String[] args) {
		//		입출력 예
		//		prices	return
		//		[1, 2, 3, 2, 3]	[4, 3, 1, 1, 0]

		Queue<Integer> q = new LinkedList<>();


		int [] prices = {4,3,2,1};
		System.out.println(solution(prices));

	}

	public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
		Stack<Stock> stack =new Stack<>();
        
		for(int i=0; i<prices.length; i++){
            if(!stack.isEmpty()&&stack.peek().price>prices[i]){
                while(!stack.isEmpty()&&stack.peek().price>prices[i]){
                	  Stock temp = stack.pop();
                      answer[temp.time]=i-temp.time;
                }
            }
            stack.push(new Stock(prices[i],i));
        }
		for(Stock item :stack){
            answer[item.time] = answer.length-1-item.time;
        }
		return answer;
    }

}
