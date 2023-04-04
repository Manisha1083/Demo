package com.m.interFace;

interface ZoomClient{

public static final double cost=13200;

public abstract void launchMeeting();
public abstract void createMeeting();
public abstract void recordMeeting();

}

class ZoomApp implements ZoomClient {

public void launchMeeting(){

System.out.println("I am luanching the meeting");

}
public void createMeeting(){
System.out.println("I am creating the meeting");

}
public void recordMeeting(){

System.out.println("I am recording the meeting");

}

public void loginZoom(){

System.out.println("I am entering into system");

}

	public static void main(String args[])

	{
	
	ZoomApp z= new ZoomApp();
	
z.launchMeeting();
z.createMeeting();
z.recordMeeting();
z.loginZoom();


}

}

