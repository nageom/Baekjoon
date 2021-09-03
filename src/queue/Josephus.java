package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Josephus {
	
	//card2 문제와 비슷 
	public static void main(String[] args) {
		
		Queue<Integer> que = new LinkedList<Integer>();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		
		for (int i=1; i<=N; i++) {
			que.add(i);
		}
		
		System.out.println("<");
		while(que.size()!=0) {
			
			for(int i=0; i<K-1; i++) {
				que.add(que.poll());
				
			}
			System.out.print(que.poll()+" ");
			
			
		}
		System.out.println(">");
		
		
		
		
	}

}
