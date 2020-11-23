package com.threads;
//thread class
class MultithreadingDemo extends Thread { 
	public void run() { 
		try{ 
			System.out.println ("Thread Id:" + Thread.currentThread().getId() + " is running by "+Thread.currentThread().getName()); 

		} 
		catch (Exception e) {  
		System.out.println ("Exception is caught"); 
		} 
	} 
} 

//thread synchronization
public class ThreadSync{

	public static void main(String args[]){  
		Table obj = new Table();//only one object  
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj); 
		MyThread2 t22=new MyThread2(obj);  
		t1.start();  
		t2.start();  
		t22.start();
	}  
   
}


class Table{  
//Thread synchronization
	synchronized void printTable(int n){  //synchronized method  
		for(int i=1;i<=5;i++){  
			System.out.println(n*i);  
			try{  
				//Thread.sleep(1000);  
			}catch(Exception e){System.out.println(e);}  
		}  

	}  
}  

//ThreadCommunication 
public class ThreadCommunication {

	public static void main(String[] args) 
			throws InterruptedException 
	{ 
		final PC pc = new PC(); 

		// Create a thread object that calls pc.produce() 
		Thread t1 = new Thread(new Runnable() 
		{ 
			public void run() 
			{ 
				try
				{ 
					pc.produce(); 
				} 
				catch(InterruptedException e) 
				{ 
					e.printStackTrace(); 
				} 
			} 
		}; 

//runnable interface
class Multithreading implements Runnable
{
public void run()
{
try
{
System.out.println ("Thread Id:" + Thread.currentThread().getId() + " is running by "+Thread.currentThread().getName());
}
catch (Exception e) {
System.out.println ("Exception is caught");
}
}
}





























