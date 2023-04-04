package com.m.polymorphism;

 class Employee {


		void show(){

		System.out.println("I am an Employee");

		}


		} 

		class Tester extends Employee {

		void show(){

		System.out.println("I am aworking as Test Engineer");

		}

		public static void main (String args[])

		{

		Tester ref = new Tester();

		Tester test = new Tester();

		ref.show();

		test.show();



		}



		}

