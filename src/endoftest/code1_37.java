package endoftest;

import java.util.Arrays;

/*
//}


	// String[] resultArr = Arrays.stream(arr).distinct().toArray(String[]::new);
	 */

class code1_37 {
	public static void main(String[] args) {
		String s= "(())[]{";
		int[] a = {1,4,3,2,36,5};
		a.length;
		Arrays.sort sort(a);
		Math.max(0, 0)
		System.out.println();
		Solution sol = new Solution();
		sol.solution(s);
	}
}

 class Solution {
    public int solution(String s) {
    	int answer = 0;
        int[] cnt = new int[6];
        int[] idx = new int[6];
        String[] check = {"(",")","[","]","{","}"};
        int nbefore = -1;
        //()[] {}

        
        for (int i=0; i<s.length(); i++) {
        	String str = s.substring(i, i+1);
        	if (str .equals(check[0])) {
        		cnt[0] += 1;
        		idx[0] += 1;
        	} else if (str.equals(check[1])) {
        		cnt[1] += 1;
        		idx[1] += 1;
        	} else if (str.equals(check[2])) {
        		cnt[2] += 1;
        		idx[2] += 1;
        	} else if (str.equals(check[3])) {
        		cnt[3] += 1;
        		idx[3] += 1;
        	} else if (str.equals(check[4])) {
        		cnt[4] += 1;
        		idx[4] += 1;
        	} else if (str.equals(check[5])) {
        		cnt[5] += 1;
        		idx[5] += 1;
        	}
        }
        System.out.println(Arrays.toString(cnt));
        
        int nchar = 0;
        if (cnt[0] != cnt[1]) {
        	if (cnt[0] > cnt[1]) {
        		nchar = 0;
        	} else {
        		nchar = 1;
        	}
        } else if (cnt[2] != cnt[3]) {
        	if (cnt[2] > cnt[3]) {
        		nchar = 1;
        	} else {
        		nchar = 2;
        	}
        } else if (cnt[4] != cnt[5]) {
        	if (cnt[4] > cnt[5]) {
        		nchar = 3;
        	} else {
        		nchar = 4;
        	}       	
        }
        
        System.out.println(nchar);
        
        
        int nval = -1;
        
        if (nchar == 0) {
        	
        } else 

        for (int i=0; i<s.length(); i++) {
        	String str = s.substring(i, i+1);
        	
        }	
        
        
        System.out.println("화이팅!");
        
        return answer;
    }
}