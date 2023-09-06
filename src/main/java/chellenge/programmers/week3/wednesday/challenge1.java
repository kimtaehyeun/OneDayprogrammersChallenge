package chellenge.programmers.week3.wednesday;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class challenge1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String [] dataSplit =input.split(" ");
		int size = Integer.parseInt(dataSplit[0]);
		int line = Integer.parseInt(dataSplit[1]);
		List<Integer> xLine = new ArrayList<>();
		List<Integer> yLine = new ArrayList<>();
		
		int point = 0;
		for(int i=0; i<line; i++){
			String [] inputData = br.readLine().split(" ");
			if(inputData[2].equals("R")||inputData[2].equals("L")){
				for(int j=Integer.parseInt(inputData[1]);j<=size&&j>=1;){
					xLine.add(Integer.parseInt(inputData[0])*10+j);
					if(inputData[2].equals("R")){
						j++;
					}
					else{
						j--;
					}		
				}
			}
			else if(inputData[2].equals("U")||inputData[2].equals("D")){
				for(int j=Integer.parseInt(inputData[0]);j<=size&&j>=1;){
					yLine.add(j*10+Integer.parseInt(inputData[1]));
					if(inputData[2].equals("D")){
						j++;
					}
					else{
						j--;
					}		
				}
			}
			else{
				System.out.print("다시입력해주세요");
				i--;
			}
		}
		for(int i=0; i<xLine.size(); i++){
			for(int j=0; j<yLine.size(); j++){
				if(xLine.get(i)==yLine.get(j)){
					point++;
				}
			}
		}
		System.out.print("점 : "+point);
		
		
	}
}