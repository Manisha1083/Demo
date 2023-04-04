package com.m.thread;

public class MyThread1 implements Runnable {
	
	public void run() {
		
		System.out.println("My Thread is Running");
	}
	
	public static void main(String argvs[]) {
	//Creating object of class MyThread1
		Runnable r =  new MyThread1();
		
		// creating an object of the class Thread using Thread(Runnable r, String name) 
		Thread t = new Thread(r , "My Thread");
		
		t.start();
		
		String str = t.getName();
		System.out.println(str);
		
		
		
		
		
		
		
		
		
	}

}
