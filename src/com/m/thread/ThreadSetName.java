package com.m.thread;

public class ThreadSetName extends Thread{
	
		public void run() {
			
			System.out.println("Thread Running");
		}

		
		
public static void main(String[] args) {
		
		ThreadSetName t1 = new ThreadSetName();
		t1.setPriority(MAX_PRIORITY);
		ThreadSetName t2= new ThreadSetName();
		t2.setPriority(MIN_PRIORITY);
		System.out.println(t1.getName());  //returns name of thread
		
		System.out.println(t2.getName());
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		t1.start();
		t2.start();
		
		t1.setName("abc");    //changes name of thread
		t2.setName("xyz");
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
	
		
	}

}
