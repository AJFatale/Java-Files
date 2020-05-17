package Networking;







import java.io.*;
import java.util.*;
import java.net.*;
class Test11 implements Runnable{

	InputStream in;
	Thread t;
	Test11(InputStream in){
		t=new Thread(this);
		this.in=in;
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			int x ;
			String str="";
			//BufferedReader br=new BufferedReader(new InputStreamReader(in));
			 
			do{
				x=in.read();
				if(x!=-1) {
					System.out.println((char)x);
				}
			}while(x!=-1) ;
		}catch(Exception e)
		{
			
			System.out.println(e);
		}
//		
	}
	
	
	
}
class Test12 implements Runnable{
	OutputStream out;
	Thread t;
	Test12(OutputStream out){
		t=new Thread(this);
		this.out=out;
		t.start();
	}
	@Override
	public void run() {
		while(true) {
			String msg="hi";
			byte[] arr=msg.getBytes();
			
			try {
				out.write(arr);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("Data send");
			Scanner ob=new Scanner(System.in);
			System.out.println("Enter quit to stop...");
			
			String s="";
			do {
				s=ob.nextLine();
				arr=s.getBytes();
				try {
					out.write(arr);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}while(!s.equals("quit"));
			
		}}}

public class Client {

	public static void main(String[] args) throws Exception{
		Socket sc=new Socket("127.0.0.1",116);
		
		InputStream in=sc.getInputStream();
		Test11 t1=new Test11(sc.getInputStream());
		Test12 t2=new Test12(sc.getOutputStream());
		
		
		
//		InputStream in=sc.getInputStream();
//		int x ;
//		do{
//			x=in.read();
//			if(x!=-1) {
//				System.out.println((char)x);
//			}
//		}while(x!=-1) ;
		t1.t.join();
		t2.t.join();
//		
		sc.close();}
	}

