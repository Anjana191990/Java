package com.feb22;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number to print table:");
		
		int number=sc.nextInt();
		
		int i=1;
		
		while(i<=10) {
			System.out.println(number+"x"+i+"="+number*i);
			i++;
		}
		
	}

}
