package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Array3 {
//ī���� ������ �϶���ص�
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		// �ð� ���� 3���� ����
		/* 
		 * �ð� ������ ���ؼ� BufferedReader �� ����Ѵ�.
		 * ����� BufferedWriter �Ǵ� StringBuiler ���
		 * 
		 * 1) Arrays.sort() ���� ����� O(nlogn) �־ǿ��� O(n^2) �� ���´�. 
		 * 
		 * 2) ������ ���õ� ī���� ���� ��� �ð����⵵O(N+K) 
		 * 
		 * 
		 * */

        int[] check = new int[10001];
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int N = Integer.parseInt(br.readLine());
 
        for (int i = 0; i < N; i++) {
            // �ش� �ε����� ���� 1 ����
        	check[Integer.parseInt(br.readLine())] ++;
        }//�ߺ��Ǹ� 2 3 4 �̷��� �ö�
 
        
        br.close();
 
        StringBuilder sb = new StringBuilder();
 
        for(int i = 1; i < 10001; i++){
        	
            while(check[i] > 0){ // 3�̸� 0�ɶ����� ���鼭 ���
                sb.append(i).append('\n');
                check[i]--;
            }
        }
        System.out.println(sb);
		
		
		
		
		
		
		
	}
}
