package com.java.practice.factorypattern;

public abstract class AbstractProductFactory {
	public abstract Shape getShape(String shape);
	public abstract Color getColor(String color);
	
}
