package com.training.oop;

public class Cat implements CanEat{

	@Override
	public void eat(String food) {
		System.out.println("Cat eat " + food);
	}

}
