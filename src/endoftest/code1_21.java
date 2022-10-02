package endoftest;

import java.util.Arrays;
import java.util.Collections;

import com.sun.source.doctree.SinceTree;

/*
 * 
가운데 글자 가져오기
문제 설명
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

재한사항
s는 길이가 1 이상, 100이하인 스트링입니다.
입출력 예
s	return
"abcde"	"c"
"qwer"	"we"
 */


class code1_21 {
	public static void main(String[] args) {
		String s = "qwer";
		
		Solution sol = new Solution();
		sol.solution(s);
	}
}

class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = -1;
        
        //짝수일때
        if (s.length()%2==0) {
        	idx = (s.length()/2)-1;
        	answer = s.substring(idx, idx+2);
        //홀수일때
        } else {
        	idx = (s.length()/2);
        	answer = s.substring(idx, idx+1);
        }
//        System.out.println(answer);
        return answer;
    }
}