package chellenge.programmers.week9.thursday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;



/*
 *여행경로
문제 설명
주어진 항공권을 모두 이용하여 여행경로를 짜려고 합니다. 항상 "ICN" 공항에서 출발합니다.

항공권 정보가 담긴 2차원 배열 tickets가 매개변수로 주어질 때, 방문하는 공항 경로를 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한사항
모든 공항은 알파벳 대문자 3글자로 이루어집니다.
주어진 공항 수는 3개 이상 10,000개 이하입니다.
tickets의 각 행 [a, b]는 a 공항에서 b 공항으로 가는 항공권이 있다는 의미입니다.
주어진 항공권은 모두 사용해야 합니다.
만일 가능한 경로가 2개 이상일 경우 알파벳 순서가 앞서는 경로를 return 합니다.
모든 도시를 방문할 수 없는 경우는 주어지지 않습니다.

* 
* 
 */

public class challenge1 {
	public static String [][] ticketList;
    public static boolean[] check;
    public static ArrayList<String> ar;
	public static void main(String[] args) {
//		입출력 예
//		tickets	return
//		[["ICN", "JFK"], ["HND", "IAD"], ["JFK", "HND"]]	["ICN", "JFK", "HND", "IAD"]
//		[["ICN", "SFO"], ["ICN", "ATL"], ["SFO", "ATL"], ["ATL", "ICN"], ["ATL","SFO"]]	["ICN", "ATL", "ICN", "SFO", "ATL", "SFO"]
		String [][] tickets = {{"ICN","JFK"},{"HND", "IAD"},{"JFK", "HND"}};

		System.out.println(solution(tickets));

	}



	public static String[] solution(String[][] tickets) {
		//항공권을 모두 사용하여야 하기 때문에 한 티켓당 경로를 모두 구해야 한다.
        // dfs사용해서 티켓 모두 소모하면 순서대로 저장된거 return 하면 될듯
        // check = 사용여부
        ticketList = tickets;
        String[] answer = {};
        check  = new boolean[tickets.length];
        ar = new ArrayList<>();
        for(int i=0 ; i<ticketList.length; i++){
            if(ticketList[i][0].equals("ICN")){
            check[i]=true;
            dfs(1,ticketList[i][0],ticketList[i]);
            check[i]=false;
            }
            
        }
        Collections.sort(ar);
        answer=ar.get((0)).split(",");
        return answer;
    }
	public static void dfs(int count,String str, String[] ticket){
        if(count==ticketList.length){
            ar.add(str+","+ticket[1]);
        }
        
        for(int i=0; i<ticketList.length;i++){
            if(check[i])
                continue;
            
            if(!check[i]&&ticket[1].equals(ticketList[i][0])){
                check[i] = true;
                dfs(count+1, str+","+ticketList[i][0],ticketList[i]);
                check[i] = false;
            }            
        }
        
    }


}