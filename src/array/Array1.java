package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

//삽입정렬 
public class Array1 {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		//ArrayList arr = new ArrayList();
		
		int[] arr = new int[num];
		for (int i=0; i < num; i++) {
			arr[i] = scan.nextInt();
		}


		//10 2 6 4 9
		// 2 10 
		int tmp, j=0;
		for (int i=1; i<num; i++) {
			j = i; 
			while (arr[j]<arr[j-1]) {// 앞의 값이 나보다 클때에만 while문 
				tmp = arr[j];
				arr[j]= arr[j-1];
				arr[j-1]= tmp;
				j--;		
				if(j==0) {break;}
			}

		}
		
		for (int a : arr) {
			System.out.println(a);
		}
		
		
	}
	

}
