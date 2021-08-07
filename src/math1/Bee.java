package math1;

import java.util.Scanner;

public class Bee {

	public static void main(String[] args) {
		
		//커지는 육각형
		// 6의 배수로 개수가 커진다 
	
		Scanner scan = new Scanner(System.in);
		System.out.println("입력");
		int input = scan.nextInt();
		
		int count =1; 
		int range = 2;
		// 6의 배수가 되어줄 range 
		
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
