package ifQuest;

import java.util.Scanner;

public class AlarmClocks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ð��Է�");
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		// 9�� 00���϶�, 10���϶� 
		if (y-45 <0) {
			y += 60-45;
			x--;
			if(x<0) {
				x=23;
			}
			
		}else {
			y -=45;
		
		}
		System.out.println(x + " "+y);
	
	}
}
