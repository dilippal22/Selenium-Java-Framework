package com.dgsl.java.numbersystem;

abstract class Vehicle {
	public int speed(){
		return 0;
	}
}

class Car extends Vehicle {
	public int speed() {
		return 60;
	}
}

class RaceCar extends Car {
	public int speed() {
		return 150;
	}
	
	public static void main(String[] args) {
		RaceCar race = new RaceCar();	//Static Polymorphism --> Compile-time Polymorphism
		System.out.println(race.speed());	//150
		
		Car _car = new RaceCar();	//Top Casting --> Dynamic Polymorphism --> Run-time Polymorphism
		System.out.println(_car.speed());	//150
		
		Vehicle _vehicle = new RaceCar();	//Top Casting --> Dynamic Polymorphism --> Run-time Polymorphism --> Child class object is referred by Parent class reference variable.
		System.out.println(_vehicle.speed());	//150
		
	}
}