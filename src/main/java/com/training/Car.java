package com.training;

public class Car {
	
	public static int counter = 0;

	private String color;
	
	public int speed;
	
	// constructor
	public Car(String color) {
		this.color = color;
		this.speed = 0;
		counter++;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void changeColor(String color) {
		this.color = "Black";
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void speedUp() {
		System.out.println("In method with no parameters");
		speed++;
	}
	
	public void speedUp(int increase) {
		System.out.println("In method with int parameter");
		speed = speed + increase;
	}

	public void speedUp(String increase) {
		System.out.println("In method with String parameter");
		speed = speed + Integer.parseInt(increase);
	}
	
	public static int getAverageNumberOfWheels() {
		return 4;
	}
	
	public static int getTotalNumberOfCars() {
		return counter;
	}
}
