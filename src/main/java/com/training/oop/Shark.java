package com.training.oop;

public class Shark extends Animal implements CanEat {

	public Shark() {
		super("Shark");
	}

	@Override
	public void move() {
		System.out.println(getName() + " is swimming!");
	}
	
	public void eat(String food) {
		System.out.println(getName() + " is eating " + food);
	}
}
