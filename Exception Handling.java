class Multithreading extends Thread { 
	public void run() { 
		try{ 
			// Displaying the thread that is running 
			System.out.println ("Thread Id:" + Thread.currentThread().getId() + " is running by "+Thread.currentThread().getName()); 

		} 
		catch (Exception e) { 
			// Throwing an exception 
			System.out.println ("Exception is caught"); 
		} 
	} 
} 
public class ThreadCommunication {

	public static void main(String[] args) 
			throws InterruptedException 
	{ 
		final PC pc = new PC(); 

// Main Class 
public class Multithread { 
	public static void main(String[] args) 	{ 
		System.out.println ("Thread id:" + Thread.currentThread().getId() + " is running by "+Thread.currentThread().getName()); 
		int n = 8; // Number of threads 
		for (int i=0; i<n; i++) { 
			Multithreading object = new Multithreading(); 
			object.start(); 
		} 
	} 
} 
