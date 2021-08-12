package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Array3 {
//카운팅 정렬을 하라고해따
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		// 시간 제한 3초인 문제
		/* 
		 * 시간 단축을 위해서 BufferedReader 를 써야한다.
		 * 출력은 BufferedWriter 또는 StringBuiler 사용
		 * 
		 * 1) Arrays.sort() 사용시 평균이 O(nlogn) 최악에는 O(n^2) 가 나온다. 
		 * 
		 * 2) 문제에 제시된 카운팅 정렬 사용 시간복잡도O(N+K) 
		 * 
		 * 
		 * */

        int[] check = new int[10001];
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int N = Integer.parseInt(br.readLine());
 
        for (int i = 0; i < N; i++) {
            // 해당 인덱스의 값을 1 증가
        	check[Integer.parseInt(br.readLine())] ++;
        }//중복되면 2 3 4 이렇게 올라감
 
        
        br.close();
 
        StringBuilder sb = new StringBuilder();
 
        for(int i = 1; i < 10001; i++){
        	
            while(check[i] > 0){ // 3이면 0될때까지 빼면서 출력
                sb.append(i).append('\n');
                check[i]--;
            }
        }
        System.out.println(sb);
		
		
		
		
		
		
		
	}
}
