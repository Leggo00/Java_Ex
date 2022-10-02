package endoftest;

import java.util.*;
import java.util.Scanner;
/*
직사각형 별찍기
문제 설명
이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.

제한 조건
n과 m은 각각 1000 이하인 자연수입니다.
예시
입력

5 3
출력

*****
*****
*****
출처
 */

//class code1_36 {
//	public static void main(String[] args) {
//		int[][] triangle= {
//				{7}, 
//				{3, 8}, 
//				{8, 1, 0}, 
//				{2, 7, 4, 4}, 
//				{4, 5, 2, 6, 5}};
//		
//		Solution sol = new Solution();
//		sol.solution(triangle);
//	}
//}

class code1_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        
        // 가로가 n , 세로가 m
        for (int y=1 ; y<=b ; y++) {
        	for (int i=1 ; i<=a ; i++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }

//        System.out.println(a + b);
    }	
}


//class Solution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.println(a + b);
//    }
//}