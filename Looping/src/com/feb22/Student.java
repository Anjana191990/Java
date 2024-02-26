package com.feb22;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Id:");
		
		int studentId=sc.nextInt();
		
		System.out.println("Enter Student Name:");
		
		String studentName=sc.next();
		

		System.out.println("Enter Marks for m1:");
		
		int m1=sc.nextInt();
		System.out.println("Enter Marks for m2:");
		
		int m2=sc.nextInt();
System.out.println("Enter Marks for m3:");
		
		int m3=sc.nextInt();
		
		int total=m1+m2+m3;
		
		double avg=total/3;
		
		System.out.println("Student Id:"+studentId+"\nStudent Name:"+studentName+"\nTotal:"+total+"\nAverage:"+avg);
		
		if(avg>=90) {
			System.out.println("A Grade");
		}
		else if(avg>=75 && avg<90) {
			System.out.println("B Grade");
		}
		else if(avg>=55 && avg<75) {
			System.out.println("C Grade");
		}
		else if(avg>=35 && avg<55) {
			System.out.println("D Grade");
		}
		else {
			System.out.println("Fail");
		}

	}

}
