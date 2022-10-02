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

import coding.Solution;

class code1_C {
	public static void main(String[] args) {
		int[] A = {1,2};
		int[] B = {1,2};
		
		Solution sol  = new Solution();
		sol.solution(A,B);
	}
}


class Solution {
    public int solution(int[] A, int[] B) {
    	int answer = -1;
    	int[] temp = new int[A.length];
    	int[] temp2 = new int[B.length];
    	
        for (int i=0;i< A.length; i++){
            temp[i] = A[i];
            temp2[i] = B[i];
        }
        Arrays.sort(temp);
        Arrays.sort(temp2);
        boolean bsame = true;
        int sum = 0;
        for (int i=0;i< A.length; i++){
        	sum += A[i];
        	if (temp[i]!=temp2[i]) {
        		bsame = false;
        		break;
        	}
        }
        
        if (bsame) {
        	answer = sum;
//        	System.out.println(answer);
        	return answer;
        }
        
        int max = temp[temp.length-1];
        
        System.out.println(max);
        int idx = -1;
        for (int i=0;i< A.length; i++){
        	if (A[i]==max) {
        		idx = i;
        		break;
        	}
        }
        
        answer = B[idx];

//        System.out.println(answer);
        
        return answer;
        
    }
}


