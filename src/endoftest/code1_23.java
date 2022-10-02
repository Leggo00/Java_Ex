package endoftest;

import java.util.Arrays;
import java.util.Collections;

import com.sun.source.doctree.SinceTree;

/*
 * 
내적
문제 설명
길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.

이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a, b의 길이)

제한사항
a, b의 길이는 1 이상 1,000 이하입니다.
a, b의 모든 수는 -1,000 이상 1,000 이하입니다.
입출력 예
a	b	result
[1,2,3,4]	[-3,-1,0,2]	3
[-1,0,1]	[1,0,-1]	-2
입출력 예 설명
입출력 예 #1

a와 b의 내적은 1*(-3) + 2*(-1) + 3*0 + 4*2 = 3 입니다.
입출력 예 #2

a와 b의 내적은 (-1)*1 + 0*0 + 1*(-1) = -2 입니다.
 */


class code1_23 {
	public static void main(String[] args) {
		String s= "-1 -1";
		
		Solution sol = new Solution();
		sol.solution(s);
	}
}

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] tmp = {};
        int val = 0;
        int min = 0;
        int max = 0;
        
        tmp = s.split(" ");
        
        for (int i=0;i<tmp.length;i++) {
        	val = Integer.parseInt(tmp[i]);
        	
        	if(i==0) {
        		min = val;
        		max = val;
        		continue;
        	}
        	
        	if (min > val) {
        		min = val;
        	}
        	if (max < val) {
        		max = val;
        	}
        }

        answer = String.format("%d %d", min, max);
        System.out.println(answer);
        return answer;
    }
}