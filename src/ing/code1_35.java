package ing;

import java.util.*;
/*
정수 삼각형
문제 설명
스크린샷 2018-09-14 오후 5.44.19.png

위와 같은 삼각형의 꼭대기에서 바닥까지 이어지는 경로 중, 
거쳐간 숫자의 합이 가장 큰 경우를 찾아보려고 합니다. 
아래 칸으로 이동할 때는 대각선 방향으로 한 칸 오른쪽 또는 왼쪽으로만 이동 가능합니다. 
예를 들어 3에서는 그 아래칸의 8 또는 1로만 이동이 가능합니다.

삼각형의 정보가 담긴 배열 triangle이 매개변수로 주어질 때, 거쳐간 숫자의 최댓값을 return 하도록 solution 함수를 완성하세요.

제한사항
삼각형의 높이는 1 이상 500 이하입니다.
삼각형을 이루고 있는 숫자는 0 이상 9,999 이하의 정수입니다.
입출력 예
triangle	result
[[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]]	30
출처
 */

import endoftest.Solution;

class code1_35 {
	public static void main(String[] args) {
		int[][] triangle= {
				{7}, 
				{3, 8}, 
				{8, 1, 0}, 
				{2, 7, 4, 4}, 
				{4, 5, 2, 6, 5}};
		
		Solution sol = new Solution();
		sol.solution(triangle);
	}
}

class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int val = triangle[0][0];
        int nroop = 0;
        int bidx = 0;
        ArrayList<Integer> before = new ArrayList<Integer>();
        ArrayList<Integer> now = new ArrayList<Integer>();
        
        answer = val;

        before.clear();
        before.add(triangle[0][0]);
        
        for (int i = 1; i<triangle.length;i++) {
//        	System.out.println("roop " + i);
//        	System.out.println( triangle[i].length);
//        	System.out.println(before.toString());
        	
        	
        	
        	
        	for (int j=0; j<triangle[i-1].length; j++) {
        		now.add(before.get(i) + triangle[i][j]);
        	}

        	
        	for (int j = 0; j<nroop;j++) {
//        		System.out.println("before.size() " + before.size());
        		for (int y=j; y<triangle[i].length;y++) {
//        			System.out.println("triangle[i].length" + triangle[i].length);
//        			System.out.println(before.get(j) + " " + triangle[i][y]);
        			now.add(before.get(j) + triangle[i][y]);
        			
        			if (nroop==15) {
        				return 18;
        			}
        		}
        	}
        	
        	System.out.println(now.toString());
        	before.clear();
        	before.addAll(now);
        	now.clear();
        }
        Collections.sort(now);
        answer = now.get(now.size()-1);
        System.out.println(answer);
        
        return answer;
    }
}

/*
int answer = 0;
int[][] temp = new int[triangle.length][triangle[triangle.length-1].length];
temp[0][0] = triangle[0][0];

for (int i = 1; i < triangle.length; i++) {
	temp[i][0] = temp[i - 1][0] + triangle[i][0];
	temp[i][i] = temp[i - 1][i - 1] + triangle[i][i];
	for (int j = 1; j <= i-1; j++) {
		temp[i][j] = Math.max(temp[i - 1][j - 1], temp[i - 1][j]) + triangle[i][j];
		answer = Math.max(answer, temp[i][j]);
	}
}

return answer;
*/