package queue;

import java.util.Scanner;

public class Que2 {
	
	
	private static int n;
	private static int tail,head = 0;
	private static int[] arr;
	
	public static void main(String[] args) {
		
		//ť�� ���� �����غ���. 
		// Linked List�� ����ϴ°��� ������
		// ����� �޴� ������ �˷��ֱ� ������ �׳� �迭�� ����� ��
		
		
		
		Scanner scan = new Scanner(System.in);
		
		
		int count = scan.nextInt();
				
		arr = new int[count];
		
		for(int i=0; i<count; i++) {
			String command = scan.next();
			switch (command) {
		
			case "push":
				n = scan.nextInt();
			    push(n);
				break;

			case "pop":
				System.out.println(pop());		
				break;
			case "size":
				System.out.println(tail-head);
				break;
			case "front":
				System.out.println(front());
				break;
			case "back":
				System.out.println(back());
				break;
			
			
			
			}
		}

		
		
	}
	
	public static void push(int n) {
		arr[tail]= n;
		tail++;
		
	}
	public static int pop() {
		if(head > tail) {
			return -1;
		}
		
		int tmp = arr[head]; 
		head++;
		return tmp;
	}
	
	public static int front() {
		
		if(head > tail) {
			return -1;
		}
		return arr[head]; 
	}
	
	public static int back() {
		
		if(head > tail) {
			return -1;
		}
		return arr[tail-1]; 
	}
	
	
	
}
