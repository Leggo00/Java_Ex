package endoftest;
/*
 * 
자릿수 더하기
문제 설명
자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

제한사항
N의 범위 : 100,000,000 이하의 자연수
입출력 예
N	answer
123	6
987	24
입출력 예 설명
입출력 예 #1
문제의 예시와 같습니다.

입출력 예 #2
9 + 8 + 7 = 24이므로 24를 return 하면 됩니다.
 */


class code1_5 {
	public static void main(String[] args) {
		int n = 987;
		Solution sol  = new Solution();
		sol.solution(n);
	}
}


class Solution {
    public int solution(int n) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        String value = Integer.toString(n);
        String temp = "";
        for(int i=0; i < value.length() ; i++) {
        	temp = value.substring(i,i+1);
//        	System.out.println(temp);
        	answer += Integer.parseInt(temp);
        }
//        System.out.println("?" + answer);
        return answer;
    }
}