package math1;

import java.util.Scanner;

public class Bee {

	public static void main(String[] args) {
		
		//Ŀ���� ������
		// 6�� ����� ������ Ŀ���� 
	
		Scanner scan = new Scanner(System.in);
		System.out.println("�Է�");
		int input = scan.nextInt();
		
		int count =1; 
		int range = 2;
		// 6�� ����� �Ǿ��� range 
		
		if (input ==1) {
			System.out.println("1");
		}else {

			while(range<=input) {
				range += count * 6;
				count ++;
				
			}
			
			System.out.println(count);
		}
		
		
		
	}
}
