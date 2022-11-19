package com.mygroup.springPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This is my first spring application.
 * <p>XML Based Configuration:
 * It has two classes: Car and Bike
 * which implements Vehicle class to loosely couple with App class
 * In App class, we are injecting the Car or Bike class object
 * 
 */
@SuppressWarnings("resource")
public class App 
{
    public static void main( String[] args )
    {
    	
		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
    	
        Vehicle obj = (Vehicle)context.getBean("vehicle");
        obj.drive();
        
    }
}
