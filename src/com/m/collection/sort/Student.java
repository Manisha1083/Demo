package com.m.collection.sort;

public class Student implements Comparable<Student> {
	 
	
		int rollNo;
		String name;
		
		
		public Student(int rollNo , String name){
			
			this.rollNo = rollNo ;
			this.name = name;
			
		}

		
	/*	public int getRollNo() {
			return rollNo;
		}

		
		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}

		
		public String getName() {
			return name;
		}

		
		public void setName(String name) {
			this.name = name;
		}

		//public String toString() {
			//return "Student[rollNo=" + rollNo+ ", name= "+ name+"]";
		
		}*/
		
	
	
		public int compareTo(Student st){  
			 
			
		if(rollNo==st.rollNo)  
			return 0;  
			
			else if(rollNo>st.rollNo)  
			return 1;  
			
			else  
			return -1;  
			}  
			//return name.compareTo(st.name);

	
		}
	




/*class Student implements Comparable<Student>{  
int rollno;  
String name;  
int age;  
Student(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
  
public int compareTo(Student st){  
if(age==st.age)  
return 0;  
else if(age>st.age)  
return 1;  
else  
return -1;  
}  
}  */