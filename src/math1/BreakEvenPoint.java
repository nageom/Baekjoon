package math1;

import java.util.Scanner;

/*
 * 
 * A: �������
 * B : �Ѵ� ��� �������
 * C : ��Ʈ�ϰ��� 
 * 
 * ���ͺб��� : ���ʷ� ������ �߻��ϴ� ���� 
 * // ������ C*N =  A + B*N
 * 
 * ������ ��Ʈ�ϰ��� C - ������� B 
 * 
 * 
 * */
public class BreakEvenPoint {

	public static void main(String[] args) {
		
		//�� ����� A + B*C
		Scanner scan = new Scanner(System.in);
		System.out.println("���Ͷ� A B C ");
		 
		int A = scan.nextInt();	// �Һ� ���
		int B = scan.nextInt();	// ���� ���
		int C = scan.nextInt(); 	// ��ǰ ����
        
		if (C <= B) {
			System.out.println("-1");
		} 
		else {
			System.out.println((A/(C-B))+1);
		}
		
		
	}
}
