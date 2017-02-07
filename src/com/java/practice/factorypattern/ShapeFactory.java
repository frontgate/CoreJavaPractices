package com.java.practice.factorypattern;

public class ShapeFactory extends AbstractProductFactory{

	@Override
	public Shape getShape(String shape) {
		if("rectangle".equals(shape)){
			return new Rectangle();
		}else if("circle".equals(shape)){
			return new Circle();
		}
		else return null;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
