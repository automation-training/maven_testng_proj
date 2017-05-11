package com.training.oop;

public class Duck extends Animal {

	public Duck() {
		super("Duck");
	}
	
	@Override
	public void move() {
		System.out.println(getName() + " is flying!");
	}
}
