package math1;

import java.util.Scanner;

public class Snail {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * */
		Scanner scan = new Scanner(System.in);
		
		
		int A = scan.nextInt(); //���� ���� �Ÿ�
		int B = scan.nextInt(); //�㿡 �������� �Ÿ�
		int V = scan.nextInt(); //�� �Ÿ� 
		
		// ���� �ö� �� �̲��������ʴ´ٴ� ������ ������ Ǯ�� 
		/*
		int count = 0;
		// sum+= (a - b ) : �Ϸ簡�°Ÿ� ����
		// count++;  : �Ϸ��Ϸ�
		int sum= 0;
		while (sum < V ) {
			sum += A-B;
			count++;
			
		}
		System.out.println(count);
		*/

		int day = (V - B) / (A - B);
        
		// �������� ���� ��� (�ܿ� ���� ���� ���)
		if ((V - B) % (A - B) != 0) {
			day++;
		}
		System.out.println(day);
		
	}
}
