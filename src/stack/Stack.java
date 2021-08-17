package stack;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;
// 10828�� 
// �ϴ��� //test
public class Stack {


	public static int[] stack ;
	public static int position = -1; 
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����");
		int size = scan.nextInt();
		
		String command = "";
		stack = new int[size];
		
		
		for(int i=0; i< size; i++) {
			
			System.out.println("����� �Է��ϼ���.");
			
			command = scan.next();
			
			switch (command) {
			
			case "pop" :
				System.out.println(pop());
				break;
				
			case "size" :
				System.out.println(size());
				break;
				
			case "empty" :
				System.out.println(empty());
				break;
				
			case "top" :
				System.out.println(top());
				break;
				
			case "push":
				push(scan.nextInt());
				break;
				

			}
			
			
			
			
			
		}
		
		
		
		
		
	}
	
	// push X : ���� X�� ���ÿ� ����. 
	public static void push(int n) {
		position++;
		stack[position] = n;
				
	}
	// pop : ���� ���� �� ���� ����, ��� // ���� ���� ��� -1 ���
	
	public static int pop() {
		if(position ==0) {
			return -1;
		}else {
			int value = stack[position];
			stack[position] = 0;
			position--;
			return value;
			
		}
		
		
	}
	
			// size : ���� �� ������ ���� ���
	public static int size() {			
		return position;
	}
			// empty : ������ ��������� 1, �ƴϸ� 0 ���
	public static int empty() {
		if(position == 0) {
			return 1;	
		}
		return 0;
	}
	
			
			// top : ������ ���� ���� ������ ��¸�. ������ ���� ��� -1 ��� 
			
	public static int top() {
		if(position == 0) {
			return -1;
			
		}
		return stack[position];
		
	}
			

	
	
	
	
}
