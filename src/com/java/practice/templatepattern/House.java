package com.java.practice.templatepattern;

public abstract class House {
	public final void buildHouse(){
		buildFloor();
		buildWall();
		buildDoor();
		buildWindow();
		
		//return "House Completed";
	}
	
	public abstract void buildFloor();
	
	public abstract void buildWall();

	public void buildDoor(){
		System.out.println("Building floor is done");
	}
	
	public void buildWindow(){
		System.out.println("Building window is done");
	}

}
