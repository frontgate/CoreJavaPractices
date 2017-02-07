package com.java.practice.factorypattern;

public class ClientFactoryPattern {
	public static void main(String args[]){
		//FactoryProducer.getFactory("SHAPE").getShape("rectangle").draw();
		AbstractProductFactory prodFactory;
		Shape shape;
		Color color;
		
		prodFactory = FactoryProducer.getFactory("SHAPE");
		shape = prodFactory.getShape("rectangle");
		shape.draw();
		
		shape = prodFactory.getShape("circle");
		shape.draw();
		
		prodFactory = FactoryProducer.getFactory("COLOR");
		color = prodFactory.getColor("red");
		color.fill();
		color = prodFactory.getColor("green");
		color.fill();
	}

}
