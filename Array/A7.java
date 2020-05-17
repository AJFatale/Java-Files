package Array;
import java.util.Scanner;
public class A7 {

	public static void main(String[] args)
	{
	     Scanner ob=new Scanner(System.in);
	     int n=ob.nextInt();
	     int i=2;
	     while(i<n)
	     {
	    	 if(n%i==0) {
	    	 System.out.println("not prime");
	    	 break;}
	     
	     i++;}
		// TODO Auto-generated constructor stub
	}

}
