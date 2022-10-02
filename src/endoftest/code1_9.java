package endoftest;

import java.util.Arrays;
import java.util.Collections;


/*
 * 
정수 내림차순으로 배치하기
문제 설명
함수 solution은 정수 n을 매개변수로 입력받습니다. 
n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
예를들어 n이 118372면 873211을 리턴하면 됩니다.

제한 조건
n은 1이상 8000000000 이하인 자연수입니다.
입출력 예
n	return
118372	873211
 */


class code1_9 {
	public static void main(String[] args) {
		long n = 118372;
		Solution sol  = new Solution();
		sol.solution(n);
	}
}


class Solution {
    public long solution(long n) {
        long answer = 0;
        String temp = "";
        temp = Long.toString(n);
        Integer[] arr = new Integer[temp.length()];
        
        for (int i=0 ; i< arr.length; i++) {
        	arr[i] = Integer.parseInt(temp.substring(i, i+1));
        }
        
        Arrays.sort(arr,Collections.reverseOrder());
        
        temp = "";
        for (int i=0 ; i< arr.length; i++) {
        	temp += arr[i];
        }        
        System.out.println(temp);
       
        answer = Long.valueOf(temp);
        return answer;
    }
}