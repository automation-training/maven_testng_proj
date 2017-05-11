package com.training.oop;

public class Shark extends Animal {

	public Shark() {
		super("Shark");
	}

	@Override
	public void move() {
		System.out.println(getName() + " is swimming!");
	}
}
