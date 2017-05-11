package com.training;

public class CarExampleRunner {
	
	public static void main(String[] args) {
		Car car1 = new Car("Green");
		System.out.println(car1.getTotalNumberOfCars());
		Car.getAverageNumberOfWheels();
		Car car2 = new Car("Red");
		Car car3 = new Car("Red");
		
		System.out.println(Car.getTotalNumberOfCars());
		System.out.println(car1.getTotalNumberOfCars());
		
		car2.counter = 100;
		System.out.println(car1.counter);
		System.out.println(car3.counter);
		
		System.out.println("SPEED");
		
		car2.speed = 60;
		System.out.println("1: " + car1.speed);
		System.out.println("2: " + car2.speed);
		
	}
	
	public static void main2(String[] args) {
		Car car = new Car("Green");
		
		car.speedUp();
		System.out.println(car.getSpeed());
		
		car.speedUp(59);
		car.speedUp("59");
		
		car.speedUp("11");
	}

	public static void main1(String[] args) {
		Car car = new Car("Green");
		
		System.out.println(car.getColor());
		
		Car car2 = new Car("Black");
		System.out.println(car2.getColor());
		
		System.out.println(car.getColor());
		
		car2.changeColor("Red");
		System.out.println(car2.getColor());
	}
}
