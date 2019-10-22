package Swap1;

import java.util.Scanner;

public class Sw {

	public static void main(String[] args) {
		//Write a Java Program to swap two numbers without using the third variable.
	/*	String a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any value");
		a=sc.nextLine();
		b=sc.nextLine();
		
		c=a;
		a=b;
		b=c;
	System.out.println("Enter a value"+a);
	System.out.println("Enter a value"+b);
	*/
		
		//Write a Java Program to swap two numbers with using the third variable.
		
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any value");
		a=sc.nextInt();
		b=sc.nextInt();
		
		a=a+b;
		a=a-b;
		b=a-b;
	System.out.println("Enter a value"+a);
	System.out.println("Enter a value"+b);
	}

}
