package com.abc;

import java.util.Scanner;

public class Swapnumbers 
{
	public static void main(String[] args)
	{
	 	int a,b;
	 	Scanner sc=new Scanner(System.in);
	 	System.out.println("enter the values of a and b");
	 	a=sc.nextInt();
	 	b=sc.nextInt();
	 	a=a+b;
	 	b=a-b;
	 	a=a-b;
	 	System.out.println(a);
        System.out.println(b);	 	
		
	}
   
   
}
