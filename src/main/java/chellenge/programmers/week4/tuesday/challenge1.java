package chellenge.programmers.week4.tuesday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
 * 베스트앨범
문제 설명
스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩
 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 
 노래를 수록하는 기준은 다음과 같습니다.

속한 노래가 많이 재생된 장르를 먼저 수록합니다.
장르 내에서 많이 재생된 노래를 먼저 수록합니다.
장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.

제한사항
genres[i]는 고유번호가 i인 노래의 장르입니다.
plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.
genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.
장르 종류는 100개 미만입니다.
장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.
모든 장르는 재생된 횟수가 다릅니다.

 *
 */
public class challenge1 {
	//play횟수와 그 요소를 담는 클래스
    static class MusicData{
		int num[] = new int[2];
		int play[] = new int[2];
        public MusicData(int num, int play){
        	this.num[0]=num;
        	this.play[0]=play;		
        }
        public void setMusicData(int num, int play) {
        	int tempPlay=0;
        	int tempNum=0;
        	
        	if(this.play[0]<play) {
        		tempPlay=this.play[0];
        		tempNum=this.num[0];
        		this.play[0]=play;
        		this.num[0]=num;
        		this.play[1]=tempPlay;
        		this.num[1]=tempNum;
        		
        	}
        	else if(this.play[1]<play&&play<=this.play[0]) {
        		this.play[1]=play;
        		this.num[1]=num;
        	}
        }
	}
	public static void main(String[] args) {
//		입출력 예
//		genres	plays	return
//		["classic", "pop", "classic", "classic", "pop"]	[500, 600, 150, 800, 2500]	[4, 1, 3, 0]
		
		String [] genres = {"classic", "pop", "classic", "classic", "pop"};
		int [] plays= {500, 600, 150, 800, 2500};
		
		System.out.println(solution(genres, plays));

	}

	public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        List<Integer> ar =new ArrayList<>();
        
        HashMap<String,Integer> map = new HashMap<>();
        HashMap<String,MusicData> musicNumData = new HashMap<>();
        //데이터 정리
        for(int i=0; i<genres.length; i++){
            if(!map.containsKey(genres[i])){
                map.put(genres[i],plays[i]);//맵 안에 장르 없으면 장르 추가
                musicNumData.put(genres[i], new MusicData(i, plays[i]));
                continue;
            }
            map.put(genres[i],map.get(genres[i])+plays[i]);//장르 있으면 value+
            musicNumData.get(genres[i]).setMusicData(i, plays[i]);//class에서 비교해서 2개만 출력.
            
        }
        //출력하기
        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue());
        for(int i=entryList.size()-1;i>=0; i--) {
        	for(int j=0; j<2; j++) {
        		if(musicNumData.get(entryList.get(i).getKey()).play[j]>0) {
        			ar.add(musicNumData.get(entryList.get(i).getKey()).num[j]);
        		}
        	}
        }
        
        return answer=ar.stream().mapToInt(Integer::intValue).toArray();
    }
	
}
