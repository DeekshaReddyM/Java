package com.threads;
class MultithreadingDemo implements Runnable 
{ 
	public void run() 
	{ 
		try
		{ 
			// Displaying the thread that is running 
			System.out.println ("Thread Id:" + Thread.currentThread().getId() + " is running by "+Thread.currentThread().getName()); 
		} 
		catch (Exception e) { 
			// Throwing an exception 
			System.out.println ("Exception is caught"); 
		} 
	} 
} 

// Main Class 
class MultithreadR
{ 
	public static void main(String[] args) 
	{ 
		System.out.println ("Thread id:" + Thread.currentThread().getId() + " is running by "+Thread.currentThread().getName());
		int n = 8; // Number of threads 
		for (int i=0; i<n; i++) 
		{ 
			Thread object = new Thread(new MultithreadingDemo()); 
			object.start(); 
		} 
	} 
} 
