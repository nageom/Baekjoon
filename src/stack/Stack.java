package stack;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class Stack {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����");
		int num = scan.nextInt();
		
		String command = "";
		
		for(int i=0; i< num; i++) {
			
			System.out.println("����� �Է��ϼ���.");
			
			command = scan.nextLine();
			
			switch (command) {
			
			case "pop" :
				
				break;
				
			case "size" :
				
				break;
				
			case "empty" :
				
				break;
				
			case "top" :
				
				break;
				
			default :
				if (command.contains("push")) {
						
						
						
				}
			

			}
			
			
			
			
			
		}
		// push X : ���� X�� ���ÿ� ����. 
		
		
		// pop : ���� ���� �� ���� ����, ��� // ���� ���� ��� -1 ���
		
		// size : ���� �� ������ ���� ���
		
		// empty : ������ ��������� 1, �ƴϸ� 0 ���
		
		// top : ������ ���� ���� ������ ��¸�. ������ ���� ��� -1 ��� 
		
		
		
	}
	
	public void push(int n) {
		
		
		
	}
	
}
