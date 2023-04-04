package com.m.thread;
 
//Thread example by extending thread class
public class Multi extends Thread{
		@Override
	public void run() {
		 
			for (int i=1;i<=10;i++){
				try {
				sleep(100);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i);
				
		 }
		 }
		 
		 /*public static void main(String[]args) {
			// type 1
			 Thread t1= new Multi();
			 t1.start();
		 }*/

}


			//Thread example by implementing runnable interface

/*public class Multi implements Runnable{
		public void run() {
			
			System.out.println("Thread is running");
		}
		
 public static void main(String[]args) {
			 
			 Multi m1= new Multi();
			 Thread t1 = new Thread(m1);
			 t1.start();
		 }
*/

	
