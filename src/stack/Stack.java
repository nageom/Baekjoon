package stack;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;
// 10828번 
// 하는중 //test
public class Stack {


	public static int[] stack ;
	public static int position = -1; 
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("개수");
		int size = scan.nextInt();
		
		String command = "";
		stack = new int[size];
		
		
		for(int i=0; i< size; i++) {
			
			System.out.println("명령을 입력하세요.");
			
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
	
	// push X : 정수 X를 스택에 넣음. 
	public static void push(int n) {
		position++;
		stack[position] = n;
				
	}
	// pop : 스택 가장 위 정수 빼고, 출력 // 값이 없는 경우 -1 출력
	
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
	
			// size : 스택 안 정수의 개수 출력
	public static int size() {			
		return position;
	}
			// empty : 스택이 비어있으면 1, 아니면 0 출력
	public static int empty() {
		if(position == 0) {
			return 1;	
		}
		return 0;
	}
	
			
			// top : 스택의 가장 위의 정수를 출력만. 정수가 없는 경우 -1 출력 
			
	public static int top() {
		if(position == 0) {
			return -1;
			
		}
		return stack[position];
		
	}
			

	
	
	
	
}
