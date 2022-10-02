package endoftest;

import java.util.Arrays;


/*
 * 
자연수 뒤집어 배열로 만들기
문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.
입출력 예
n	return
12345	[5,4,3,2,1]
 */


class code1_6 {
	public static void main(String[] args) {
		int n = 12345;
		Solution sol  = new Solution();
		sol.solution(n);
	}
}


class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        
        String temp = Long.toString(n);
//        System.out.println(temp);
        
        int idx = 0;
        
        answer = new int[temp.length()];
        for (int i=temp.length() ; i>0; i--) {
//        	System.out.println(temp.substring(i-1, i));
        	
        	answer[idx] = Integer.parseInt(temp.substring(i-1, i));
        	idx++;
        }
        
//        System.out.println(Arrays.toString(answer));
        
        
        return answer;
    }
}