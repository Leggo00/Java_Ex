package level2;

import java.util.Arrays;
import java.util.Collections;

import com.sun.source.doctree.SinceTree;

/*
최솟값 만들기
문제 설명
길이가 같은 배열 A, B 두개가 있습니다. 각 배열은 자연수로 이루어져 있습니다.

배열 A, B에서 각각 한 개의 숫자를 뽑아 두 수를 곱합니다. 
이러한 과정을 배열의 길이만큼 반복하며, 
두 수를 곱한 값을 누적하여 더합니다.
 이때 최종적으로 누적된 값이 최소가 되도록 만드는 것이 목표입니다. 
 (단, 각 배열에서 k번째 숫자를 뽑았다면 다음에 k번째 숫자는 다시 뽑을 수 없습니다.)

예를 들어 A = [1, 4, 2] , B = [5, 4, 4] 라면

A에서 첫번째 숫자인 1, B에서 첫번째 숫자인 5를 뽑아 곱하여 더합니다. (누적된 값 : 0 + 5(1x5) = 5)
A에서 두번째 숫자인 4, B에서 세번째 숫자인 4를 뽑아 곱하여 더합니다. (누적된 값 : 5 + 16(4x4) = 21)
A에서 세번째 숫자인 2, B에서 두번째 숫자인 4를 뽑아 곱하여 더합니다. (누적된 값 : 21 + 8(2x4) = 29)
즉, 이 경우가 최소가 되므로 29를 return 합니다.

배열 A, B가 주어질 때 최종적으로 누적된 최솟값을 return 하는 solution 함수를 완성해 주세요.

제한사항
배열 A, B의 크기 : 1,000 이하의 자연수
배열 A, B의 원소의 크기 : 1,000 이하의 자연수
입출력 예
A	B	answer
[1, 4, 2]	[5, 4, 4]	29
[1,2]	[3,4]	10
입출력 예 설명
입출력 예 #1
문제의 예시와 같습니다.

입출력 예 #2
A에서 첫번째 숫자인 1, B에서 두번째 숫자인 4를 뽑아 곱하여 더합니다.
 (누적된 값 : 4) 다음,
  A에서 두번째 숫자인 2, B에서 첫번째 숫자인 3을 뽑아 곱하여 더합니다. (누적된 값 : 4 + 6 = 10)
이 경우가 최소이므로 10을 return 합니다.
 */


class code1_30 {
	public static void main(String[] args) {
		int []A = {1,2};
		int []B = {3,4};
		
		Solution sol = new Solution();
		sol.solution(A,B);
	}
}


class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for (int i = 0; i < A.length; i++) {
	    	int min = A[i];
	    	int max = B[B.length-i-1];
	    	answer += min*max;
        }
        
        System.out.println(answer);
        return answer;
    }
}


//class Solution
//{
//    public int solution(int []A, int []B)
//    {
//        int answer = 0;
//        
//        for (int roop = 0; roop < A.length; roop++) {
//	    	//search min / index
//	    	int min = -1;
//	    	int minidx = -1;
//	    	for (int i = 0; i<A.length;i++) {
//	    		if (A[i]==-9999) {
//	    			continue;
//	    		}
//
//	    		if ((minidx==-1)&& (A[i]!=-9999)) {
//	    			min = A[i];
//	    			minidx = i;
//	    			continue;
//	    		}
//	    		
//	    		if (min >= A[i]) {
//	    			min = A[i];
//	    			minidx = i;
//	    		}
//	    	}
//	    	
//	    	A[minidx] = -9999;
//	    	
////	    	//search max / index
//	    	int max = -1;
//	    	int maxidx = -1;
//	    	for (int i = 0; i<B.length;i++) {
//	    		if (B[i]==-9999) {
//	    			continue;
//	    		}
//	    		
//	    		if ((maxidx==-1)&& (B[i]!=-9999)) {
//	    			max = B[i];
//	    			maxidx = i;
//	    			continue;
//	    		}
//	    		
//	    		if (max <= B[i]) {
//	    			max = B[i];
//	    			maxidx = i;
//	    		}
//	    	}
//	    	
//	    	B[maxidx] = -9999;
//
//	    	answer += min*max;
//        }
//        
////        System.out.println(answer);
//        return answer;
//    }
//}