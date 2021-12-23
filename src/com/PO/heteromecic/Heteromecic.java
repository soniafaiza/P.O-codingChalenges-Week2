package com.PO.heteromecic;

import java.util.Scanner;

public class Heteromecic {
	
	public static void main (String[]args) {
		System.out.println("Please enter a number that you would like to test!");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int input = 0 ;
		for(int i=0; i<=num;i++) {
			if(num == i*(i+1)) { 
			input = 1;
			break;
		} 
		}
	if(input ==1)  {
			System.out.println(num +" is a Heteromecic number!");
		} else {System.out.println(num +" is not a Heteromecic number!");
		
		}
	}
}
	

	
		
	



			
		