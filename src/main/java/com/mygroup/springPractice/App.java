package com.mygroup.springPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This is my first spring application.
 * <p>XML Based Configuration and Annotation based configuration:
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
    	// Injecting the vehicle dependency
        Vehicle obj = (Vehicle)context.getBean("bike");
        obj.drive();
        // Injecting field value with bean property from xml in Tyre class object
        Tyre t = (Tyre)context.getBean("tyre");
        System.out.println(t);
    }
}
