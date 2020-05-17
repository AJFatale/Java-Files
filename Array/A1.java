package Array;
import java.util.Scanner;

public class A1{
	

	private static Scanner n;

	public static void main(String[] args) {
		n = new Scanner(System.in);
		int[] arr=new int[5];
		int i;
		System.out.println("Enter array");
		for(i=0;i<5;i++)
		{
			arr[i]=n.nextInt();
			
		}System.out.println("Your array");
		for(i=0;i<5;i++)
		{
			System.out.println(arr[i]);
			
		}
		
	}

}
