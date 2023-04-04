package com.m.thread;

public class TestThraed {

	public static void main(String[] args) {
		// type 2
		Thread t2 = new Multi();
		t2.start();
	//	t2.start(); // Starting same thread twice throws "IllegalThreadStateException"
		
		
		//type 3
		/*Multi multi = new Multi();
		Thread thread = new Thread (multi);
		thread.start();*/
	}

}
