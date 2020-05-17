package Array;
import java.util.Scanner;
public class A2 {

	public static void main(String[] args) {
		Scanner arr=new Scanner(System.in);
		int ar[][]=new int[3][3];
		System.out.println("Enter array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				ar[i][j]=arr.nextInt();
			}
		}
		System.out.println("Your array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(ar[i][j]);
			}
			System.out.println(" ");
		}
	}

}
