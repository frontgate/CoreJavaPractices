package com.java.practice.templatepattern;

public class TemplatePattern {

	public static void main(String args[]){
		
		House house;
		house = new WoodenHouse();
		house.buildHouse();
				
		house = new GlassHouse();
		house.buildHouse();
	}
}
