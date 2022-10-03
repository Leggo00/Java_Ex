package six;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

///Solution


class codesix_1 {
	public static void main(String[] args) {
		String[] user_scores= {"alex111 100", "cheries2 200", "coco 150", "luna 100", "alex111 120", "coco 300", "cheries2 110"};
		int k = 3;
		Solution sol  = new Solution();
		sol.solution(k, user_scores);
	}
}

class Solution {
    public int solution(int K, String[] user_scores) {
        int answer = 0;
        Map map = new HashMap();
        Object[] max       = new Object[user_scores.length];
        Object[] beforemax = new Object[user_scores.length];
        
        boolean bChange = false;
        
        for (int i=0;i<user_scores.length;i++) {
        	String[] val = user_scores[i].split(" ");
        	int temp1 = 0;
        	if (map.containsKey(val[0])) {
        		temp1 = Integer.parseInt((String) map.get(val[0]));
        		int temp2 = Integer.parseInt(val[1]);
        		if (temp1<temp2) {
        			map.put(val[0], val[1]);
        		}
        	} else {
        		map.put(val[0], val[1]);
        	}
//        	if (i < K) {
//        		System.out.println("..");
//        		max = map.values().toArray();
//        		
//        		System.out.println(Arrays.toString(max));
//        		System.out.println("..");
//        		
//        		for (int j=(user_scores.length-K-1);j<user_scores.length;j++) {
//        			if(beforemax[j]!=max[j]) {
//        				answer++;
//        				break;
//        			}
//        		}
//        	}
        	beforemax = max;
        }
        
        System.out.println(map);
        System.out.println(answer);
        
        return answer;
    }
}
