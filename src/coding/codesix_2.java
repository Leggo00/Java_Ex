package coding;


import java.util.ArrayList;
import java.util.Arrays;

///Solution


class codesix_2 {
	public static void main(String[] args) {
		int[] estimates= {5,1,9,8,10,5};
		int k = 3;
		Solution sol  = new Solution();
		sol.solution(estimates, k);
	}
}

class Solution {
    public int solution(int[] estimates, int k) {
        int answer = 0;
        int[] temp = new int[estimates.length];
        int cnt = temp.length-k+1;
        int[] max = new int[cnt];
        
        Arrays.fill(max, 0);
        
        temp= estimates.clone();
        System.out.println(cnt);
        for (int i=0; i<estimates.length;i++) {
        	if ((i+k-1) < estimates.length) {
//        		System.out.println("끝수" + (i+k-1));
        		for (int y=1; y<=k; y++) {
        			max[i] += temp[y+i-1];
        		}
        	}
        }
        
        Arrays.sort(max);
        answer = max[max.length-1];
//        System.out.println(max[max.length-1]);
        return answer;
    }
}

