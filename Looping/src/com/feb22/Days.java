package com.feb22;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter choice:");
		
		int choice=sc.nextInt();
		
		switch(choice) {
		//break is used to terminate perticualr switch case
		case 1:
			System.out.println("Monday");
		break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wensday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("wrong choice");
		}

	}

}
