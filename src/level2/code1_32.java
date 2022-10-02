package level2;

import java.util.Arrays;
import java.util.Collections;

import com.sun.source.doctree.SinceTree;
/*
//  자연수의 합으로 표현하는 방법의 수는 주어진 수의 홀수 약수의 개수와 같다라는 정수론 정리가 있습니다.
숫자의 표현
문제 설명
Finn은 요즘 수학공부에 빠져 있습니다. 수
학 공부를 하던 Finn은 자연수 n을 연속한 자연수들로 표현 하는 방법이 
여러개라는 사실을 알게 되었습니다. 예
를들어 15는 다음과 같이 4가지로 표현 할 수 있습니다.

1 + 2 + 3 + 4 + 5 = 15
4 + 5 + 6 = 15
7 + 8 = 15
15 = 15
자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 n을 표현하는 방법의 수를 return하는 solution를 완성해주세요.

제한사항
n은 10,000 이하의 자연수 입니다.
입출력 예
n	result
15	4
입출력 예 설명
입출력 예#1
문제의 예시와 같습니다.
 */


class code1_32 {
	public static void main(String[] args) {
		int n= 15;
		
		Solution sol = new Solution();
		sol.solution(n);
	}
}

class Solution {
    public int solution(int n) {
    	int val = 0;
        int answer = 0;
        
        
        for (int i=1;i<=n;i++) {
        	val = 0;
        	for(int j=i;j<=n;j++) {
        		if (n <= val) {
        			break;
        		}
        		val += j;
        		
        		if(n==val) {
        			answer++;
        			break;
        		}
        	}
//        	System.out.println("[i] + " + val[i]);
        }
//        System.out.println(answer);
        return answer;
    }
}
/*
 * class Solution {
    public int solution(int n) {
    	int[] val = new int[n+1];
        int answer = 0;
        
        
        for (int i=1;i<=n;i++) {
        	for(int j=i;j<=n;j++) {
        		if (val[i] == -9999) {
        			break;
        		}
        		val[i] += j;
        		
        		if (val[i] == n) {
        			val[i] = -9999;
        			answer++;
        		}
        	}
//        	System.out.println("[i] + " + val[i]);
        }
//        System.out.println(nCnt);
        return answer;
    }
}
 */
/*
class Solution {
    public int solution(int n) {
    	int[] val = new int[n+1];
        int answer = 0;
        int nCnt = 0;
        
        // 배열초기화
        for (int j=0;j<=n;j++) {
        	val[j] = 0;
        }
        
        
        for (int i=1;i<=n;i++) {
        	for(int j=i;j<=n;j++) {
        		if (val[i] == -9999) {
        			break;
        		}
        		val[i] += j;
        		
        		if (val[i] == n) {
        			val[i] = -9999;
        			nCnt++;
        		}
        	}
//        	System.out.println("[i] + " + val[i]);
        }
//        System.out.println(nCnt);
        answer =nCnt;
        return answer;
    }
}
*/