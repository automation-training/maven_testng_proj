package com.training;

public class Car {

	private String color;
	
	private int speed;
	
	// constructor
	public Car(String color) {
		this.color = color;
		this.speed = 0;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void changeColor(String color) {
		this.color = "Black";
	}
}
