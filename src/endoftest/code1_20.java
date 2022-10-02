package endoftest;

import java.util.Arrays;
import java.util.Collections;

import com.sun.source.doctree.SinceTree;

/*
 * 
수박수박수박수박수박수?
문제 설명
길이가 n이고, 
"수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수,
 solution을 완성하세요. 
 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

제한 조건
n은 길이 10,000이하인 자연수입니다.
입출력 예
n	return
3	"수박수"
4	"수박수박"
 */


class code1_20 {
	public static void main(String[] args) {
		int n = 2;
		
		Solution sol  = new Solution();
		sol.solution(n);
	}
}

class Solution {
    public String solution(int n) {
        String answer = "";
        String str1 ="수";
        String str2 ="박";
        
        for (int i=0; i<n; i++) {
        	if ((i+1)%2==1) {
        		answer += str1;
        	} else {
        		answer += str2;
        	}
        	
        }
//        System.out.println(answer);
        return answer;
    }
}