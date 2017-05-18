package com.training.oop;

public class AnimalDemo {

	public static void main(String[] args) {
		// Approach 1
//		Animal dog = new Animal("Dog");
//		dog.move();
//		
//		Animal duck = new Animal("Duck");
//		duck.move();
//		
//		Animal shark = new Animal("Shark");
//		shark.move();
		
		// Approach 2
//		Dog dog1 = new Dog();
//		dog1.move();
		//dog1.bark();
		
//		Duck duck1 = new Duck();
//		duck1.move();
//		
//		Shark shark1 = new Shark();
//		shark1.move();
		
		// Approach 3
//		Animal animal = new Dog();
//		animal.move();
//		
//		animal = new Duck();
//		animal.move();
//		
//		animal = getAnimal();
//		animal.move();
		
		// Encapsulation
		Animal cat = new Animal("Cat");
		cat.move();
		
//		cat.name = "Dog";
		cat.move();
		
		CanEat hungryAnimal = new Dog();
		hungryAnimal.eat("Bone");
		
		feed(new Dog());
		feed(new Shark());
		feed(new Cat());
	}
	
	public static void feed(CanEat someone) {
		someone.eat("fish");
	}
	
	public static Animal getAnimal() {
		return new Dog();
	}
}
