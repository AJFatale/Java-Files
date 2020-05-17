package Networking;



import java.io.*;
import java.net.*;
import java.util.Scanner;


class Test1 implements Runnable{

	InputStream in;
	Thread t;
	Test1(InputStream in){
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
class Test2 implements Runnable{
	OutputStream out;
	Thread t;
	Test2(OutputStream out){
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
			
			
			
		}
//		
//		byte[] arr=msg.getBytes();
//		OutputStream o=sc.getOutputStream();
//		o.write(arr);
//		System.out.println("Data send");
//		System.out.println("Get request");
		
	}
	
	
	
}

public class Server {

	public static void main(String[] args)throws Exception{
		ServerSocket ss=new ServerSocket(116);
		System.out.println("Server Created");
		Socket sc=ss.accept();
	 
		InputStream in=sc.getInputStream();
		OutputStream o=sc.getOutputStream();
		Test1 t1=new Test1(sc.getInputStream());
		Test2 t2=new Test2(sc.getOutputStream());
//		System.out.println("Got Requests...");
//		int x ;
//		String str="";
//		BufferedReader br=new BufferedReader(new InputStreamReader(in));
//		 
//		do{
//			x=in.read();
//			if(x!=-1) {
//				System.out.println((char)x);
//			}
//		}while(x!=-1) ;
//		
		
//		String msg="hi";
//		byte[] arr=msg.getBytes();
//		OutputStream o=sc.getOutputStream();
//		o.write(arr);
//		System.out.println("Data send");
//		System.out.println("Get request");
		t1.t.join();
		t2.t.join();
		
		ss.close();
		}
		
	}


