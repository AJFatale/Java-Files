package Java;

import java.util.Scanner;

public class Fibonacci {
static int n1=0,n2=1,n3=0;
static void fibonacci(int c)
{
	if(c>0) {
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(" "+n3);
		fibonacci(c-1);
		
		
		
	}
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the count for fibonacci series:");
		int c=s.nextInt();
		System.out.print(n1+" "+n2);
		fibonacci(c-2);
	}
}
