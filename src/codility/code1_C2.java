package codility;
/*
 * 
정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.

제한 조건
num은 int 범위의 정수입니다.
0은 짝수입니다.
입출력 예
num	return
3	"Odd"
4	"Even"
 */
///Solution

import java.util.Arrays;

class code1_C2 {
	public static void main(String[] args) {
		String S = "aabbcc";
		 int[] C = {1,2,1,2,1,2};
		
		Solution sol  = new Solution();
		sol.solution(S,C);
	}
}



class Solution {
    public int solution(String S, int[] C) {
    	int result = 0;
    	
    	int before = C[0];  
    	int nnow = -1;
    	
    	String sbefore = S.substring(0, 1);  
    	String snow = "";
    	for (int i=1; i<C.length; i++) {
    		snow = S.substring(i, i+1);  
    		if (sbefore.equals(snow)) {
    			if (C[i] < C[i-1]) {
    				result += C[i];
    			} else {
    				result += C[i-1];
    			}
    		}
    		sbefore = snow;  
    	}
    	//System.out.println(result);
    	return result;
    }
}


