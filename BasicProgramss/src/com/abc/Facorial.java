package com.abc;

import java.util.Scanner;

public class Facorial
{
   public static void main(String[] args) 
     {
	   int no,fact=1;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the the number");
	   no=sc.nextInt();
	   for(int i=1;i<=no;i++)
	   {
		   fact=fact*i;
	   }
	   System.out.println(fact);
}
}

