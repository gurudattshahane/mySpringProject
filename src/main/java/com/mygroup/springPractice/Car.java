package com.mygroup.springPractice;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	public void drive() {
		System.out.println("Driving the car");
	}
}
