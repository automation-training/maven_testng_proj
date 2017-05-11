package com.training.oop;

public class Dog extends Animal {

	public Dog() {
		super("Dog");
	}
	
	public void bark() {
		System.out.println(getName() + " is barking!");
	}
	
	@Override
	public void move() {
		System.out.println(getName() + " is running!");
	}
}
