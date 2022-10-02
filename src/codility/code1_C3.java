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

class code1_C3 {
	public static void main(String[] args) {
		int A = 1;
		int B = 8;
		
		Solution sol  = new Solution();
		sol.solution(A,B);
	}
}



class Solution {
    public int solution(int A, int B) {
    	int result = 0;
    	int div = (A+B)/4;
    	int ncnt = 0;
    	
    	if (div == 0) {
    		result = 0;
//    		System.out.println(result);
			return result;
    	}
    	
    	while (true) {
    		ncnt += A/div;
    		ncnt += B/div;
    		
    		if (ncnt == 4) {
    			result = div;
    			break;
    		} else {
    			div = div-1;
    			ncnt = 0;
    		} 
    		if (div==0) {
//    			System.out.println(result);
    			return 0;
    		}
    	}
    	
    	//막대기 혼자 만들수있음.
    	// 최소값으로 안나눠 질경우. -1
    	
//    	System.out.println(result);
    	return result;
    }
}


