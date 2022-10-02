package level2;

import java.util.Arrays;
import java.util.Collections;

import com.sun.source.doctree.SinceTree;

/*
피보나치 수
문제 설명
피보나치 수는 F(0) = 0, F(1) = 1일 때, 
1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 
가 적용되는 수 입니다.

예를들어

F(2) = F(0) + F(1) = 0 + 1 = 1
F(3) = F(1) + F(2) = 1 + 1 = 2
F(4) = F(2) + F(3) = 1 + 2 = 3
F(5) = F(3) + F(4) = 2 + 3 = 5
와 같이 이어집니다.

2 이상의 n이 입력되었을 때, 
n번째 피보나치 수를 1234567으로 
나눈 나머지를 리턴하는 함수, solution을 완성해 주세요.

제한 사항
n은 2 이상 100,000 이하인 자연수입니다.
입출력 예
n	return
3	2
5	5
입출력 예 설명
피보나치수는 0번째부터 0, 1, 1, 2, 3, 5, ... 와 같이 이어집니다.

  1  2  3  4  5      
  1  1  2  3  5  8  13  21

문제가 잘 안풀린다면😢
 */


class code1_33 {
	public static void main(String[] args) {
		int n= 5;
		
		Solution sol = new Solution();
		sol.solution(n);
	}
}
//오버플로우
//(a + b) % m = ((a % m) + (b % m)) % m
class Solution {
    public int solution(int n) {
        int answer = 0;
        int idx = 1;
        int nStart = 0;
        int nbefore = 1;
        int val = 0;
        
        while (true) {
        	//ex 2 부터시작
        	idx++;
        	
        	val = ((nStart%1234567) + (nbefore%1234567))%1234567;
//        	System.out.printf("f(%d) = %f + %f = %f%n", idx, nStart, nbefore, val);
        	answer = val;
        	nStart = nbefore;
        	nbefore = val;
        	if (idx==n) break;
        }
        
        System.out.println(answer);
        
        
        return answer;
    }
} 