package stack;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class Stack {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("개수");
		int num = scan.nextInt();
		
		String command = "";
		
		for(int i=0; i< num; i++) {
			
			System.out.println("명령을 입력하세요.");
			
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
		// push X : 정수 X를 스택에 넣음. 
		
		
		// pop : 스택 가장 위 정수 빼고, 출력 // 값이 없는 경우 -1 출력
		
		// size : 스택 안 정수의 개수 출력
		
		// empty : 스택이 비어있으면 1, 아니면 0 출력
		
		// top : 스택의 가장 위의 정수를 출력만. 정수가 없는 경우 -1 출력 
		
		
		
	}
	
	public void push(int n) {
		
		
		
	}
	
}
