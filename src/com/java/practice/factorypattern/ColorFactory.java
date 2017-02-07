package com.java.practice.factorypattern;

public class ColorFactory extends AbstractProductFactory{

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getColor(String color) {
		if("red".equals(color)){
			return new Red();
		}else if("green".equals(color)){
			return new Green();
		}
		else return null;
	}

}
