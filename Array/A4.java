package Array;
import java.util.Scanner;
public class A4 {

	public static void main(String[] args) {
     Scanner ob=new Scanner(System.in);
     int arr[]=new int[5];
     System.out.println("Enter array");
     for(int i=0;i<5;i++) {
    	 arr[i]=ob.nextInt();
    	 
     }
     int sum=0;
     for(int i=0;i<5;i++)
     {
    	 sum=sum+arr[i];
     }
     System.out.println(sum);
	}

}
