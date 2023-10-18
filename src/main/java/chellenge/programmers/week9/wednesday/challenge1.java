package chellenge.programmers.week9.wednesday;

import java.util.LinkedList;
import java.util.Queue;



/*
 *단어 변환
문제 설명
두 개의 단어 begin, target과 단어의 집합 words가 있습니다. 아래와 같은 규칙을 이용하여 begin에서 target으로 변환하는 가장 짧은 변환 과정을 찾으려고 합니다.

1. 한 번에 한 개의 알파벳만 바꿀 수 있습니다.
2. words에 있는 단어로만 변환할 수 있습니다.
예를 들어 begin이 "hit", target가 "cog", words가 ["hot","dot","dog","lot","log","cog"]라면 "hit" -> "hot" -> "dot" -> "dog" -> "cog"와 같이 4단계를 거쳐 변환할 수 있습니다.

두 개의 단어 begin, target과 단어의 집합 words가 매개변수로 주어질 때, 최소 몇 단계의 과정을 거쳐 begin을 target으로 변환할 수 있는지 return 하도록 solution 함수를 작성해주세요.

제한사항
각 단어는 알파벳 소문자로만 이루어져 있습니다.
각 단어의 길이는 3 이상 10 이하이며 모든 단어의 길이는 같습니다.
words에는 3개 이상 50개 이하의 단어가 있으며 중복되는 단어는 없습니다.
begin과 target은 같지 않습니다.
변환할 수 없는 경우에는 0를 return 합니다.
입출력 예
 * 
 */
class Word{
    String word;
    int step;
    public Word(String word, int step){
        this.word= word;
        this.step = step;
    }
}
public class challenge1 {
	public static boolean [] check ;
	public static String startStr ;
	public static String finishStr ;
	
	public static void main(String[] args) {
//		입출력 예
//		begin	target	words	return
//		"hit"	"cog"	["hot", "dot", "dog", "lot", "log", "cog"]	4
//		"hit"	"cog"	["hot", "dot", "dog", "lot", "log"]	0
		String begin = "hit";
		String target = "cog";
		String [] words = {"hot", "dot", "dog", "lot", "log", "cog"};

		System.out.println(solution(begin, target, words));

	}



	public static  int solution(String begin, String target, String[] words) {
        // 변수 설정
        startStr = begin;
        finishStr = target;
        check = new boolean[words.length];
        
        // begin-> target으로 만들어야함
        // begin에서 한글자만 다른 것들을 계속 찾아 각 dfs가 맞을듯
        // 이전 했던 방식 그대로 charAt을 사용해서 글자 한개만 틀린것들을 나열하고 반복하면 될듯
        // begin = startStr | target = finishStr
        // 
        Queue<Word> queue = new LinkedList<>();
        queue.add(new Word(begin,0));
        
            
        int answer = dfs(queue,words);
        
        return answer;
    }

	public static int dfs(Queue<Word> queue,String[] words){
        while(!queue.isEmpty()){
            Word str= queue.poll();
            if(str.word.equals(finishStr)){
                //종료 if문
                return str.step;
            }
            //words 전체 스캔하기
            for(int i=0; i<words.length; i++){
            	//글자의 길이
                int count = str.word.length();
                //만약 방문하지 않았다면 실행
                //한 단어의 글자 전체 스캔하기-> 한개만 틀린 글자를 찾기위해 실행
                if(!check[i]){
                    for(int j=0; j<str.word.length(); j++){
                        if(str.word.charAt(j)==words[i].charAt(j))
                            count--;
                    }
                    if(count==1){
                        check[i]=true;
                        queue.add(new Word(words[i],str.step+1));
                    }
                }
            }
        }
        return 0;
    }

}