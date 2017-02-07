package com.java.practice.factorypattern;

public class FactoryProducer {

	public static AbstractProductFactory getFactory(String choice){
		
		if("SHAPE".equals(choice)){
			return  new ShapeFactory();

		}else if("COLOR".equals(choice)){
			return  new ColorFactory();

		}
		return null;
	}
}
