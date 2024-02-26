package com.feb23;

import java.util.Scanner;

public class ReverseRightTrainglePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter rows:");
		int row=sc.nextInt();
		for(int i=row;i>=1;i--) {
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
