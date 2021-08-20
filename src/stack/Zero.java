package stack;

import java.util.Scanner;

public class Zero {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int[] arr = new int[count];
		int n , pos=0;
		
		for(int i=0; i<count; i++) {
			n=scan.nextInt();
			
			if(n!=0) {
				arr[pos] = n; 
				pos++;
			}else {
				pos--;
				arr[pos]=0;
				
			}
			
			
		}
		int result = 0;
		for(int a : arr) {
			result += a;
			
		}
		
		System.out.println(result);
		
	}
	
}
