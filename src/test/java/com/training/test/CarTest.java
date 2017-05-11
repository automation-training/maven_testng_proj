package com.training.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.training.Car;

public class CarTest {

	@Test
	public void testCarInitialColor() {
		Car car = new Car("Green");
		
		Assert.assertEquals(car.getColor(), "Green", "Incorrect initial color");
	}
	
	@Test
	public void testChangeColor() {
		Car car = new Car("Green");
		car.changeColor("Red");
		
		Assert.assertEquals(car.getColor(), "Red", "Incorrect changed color");
		Assert.assertEquals(true, false);
		Assert.assertEquals(1, 1.0);
	}
}
