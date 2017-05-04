package com.training;

public class CarExampleRunner {

	public static void main(String[] args) {
		Car car = new Car("Green");
		
		System.out.println(car.getColor());
		
		Car car2 = new Car("Black");
		System.out.println(car2.getColor());
		
		System.out.println(car.getColor());
		
		car2.changeColor("Red");
		System.out.println(car2.getColor());
	}
}
