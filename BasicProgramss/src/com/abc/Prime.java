package com.abc;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args)
	{
	   int no,i,fect=1;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the value");
	   no=sc.nextInt();
	   if(no==1)
	   {
		   System.out.println("smallest number is 2");
	   }
	   for(i=2;i<no;i++)
	   {
		   if(no%i==0)
		   {
			   System.out.println("it is not prime number");
			   break;
		   }
	   }
	   if(no==i)
	   {
		   System.out.println("prime number");
	   }
	}

}
