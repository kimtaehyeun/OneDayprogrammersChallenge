package chellenge.programmers.week3.friday;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class challenge1 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String [] inputData = input.split(" ");
		//input Data 변수정리
		int N = Integer.parseInt(inputData[0]);//첫째 줄에 배열의 크기
		int K = Integer.parseInt(inputData[1]);//연결 요소를 지울 기준크기 --처음에는 K이상인 요소가 존재하지 않는다.
		int Q = Integer.parseInt(inputData[2]); //문자를 적을 횟수

		//초기배열
		char [][] ar = new char[N][N];

		String insertData = "";
		for(int i=0; i<N; i++){
			insertData=br.readLine();
			for(int j=0; j<N; j++){
				ar[i][j]=insertData.charAt(j);
			}
		}
		//새로운 요소 추가
		int [] dy={0,-1,0,1};
		int [] dx={1,0,-1,0};
		int yIdx = 0;
		int xIdx = 0;

		for(int i=0; i<Q; i++){
			ArrayList<Integer> yIndexList = new ArrayList<>();
			ArrayList<Integer> xIndexList = new ArrayList<>();
			int count = 0;
			insertData=br.readLine();
			inputData = insertData.split(" ");
			yIndexList.add(Integer.parseInt(inputData[0])-1);
			xIndexList.add(Integer.parseInt(inputData[1])-1);

			ar[yIndexList.get(0)][xIndexList.get(0)]=inputData[2].charAt(0);
			search(ar,yIndexList,xIndexList);
			if(yIndexList.size()>K) {
				for(int j=0; j<yIndexList.size(); j++) {
					ar[yIndexList.get(j)][xIndexList.get(j)]='.';
				}
			}
		}
		for(int i=0; i<N; i++) {
			String result = "";
			for(int j=0; j<N; j++) {
				result+=ar[i][j];
			}
			System.out.println(result);
		}
	}
	public static void search(char[][] ar,ArrayList<Integer>yIndexList, ArrayList<Integer>xIndexList){
		int [] dy={0,-1,0,1};
		int [] dx={1,0,-1,0};
		int yIdx = yIndexList.get(yIndexList.size()-1);
		int xIdx = xIndexList.get(xIndexList.size()-1);

		for(int i=0; i<4; i++) {
			if(yIdx+dy[i]<0||yIdx+dy[i]>ar.length-1||xIdx+dx[i]<0||xIdx+dx[i]>ar.length-1)
				continue;
			else if(ar[yIdx+dy[i]][xIdx+dx[i]]==ar[yIdx][xIdx]) {
				if(yIndexList.size()>1) {
					if(yIndexList.get(yIndexList.size()-2)==yIdx+dy[i]&&xIndexList.get(xIndexList.size()-1)==xIdx+dx[i]) {//이미 왔던곳 인덱스이면
						continue;	
					}
				}
				yIndexList.add(yIdx+dy[i]);
				xIndexList.add(xIdx+dx[i]);
				search(ar, yIndexList, xIndexList);
			}
		}


	}
}
