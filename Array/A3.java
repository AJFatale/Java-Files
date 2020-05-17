package Array;
import java.util.Scanner;
public class A3 {

	public static void main(String[] args){
		Scanner n=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter array");
		for(int i=0;i<5;i++)
		{
			arr[i]=n.nextInt();
			
		}
		for(int i=0;i<5;i++) {
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
