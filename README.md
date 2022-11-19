# mySpringProject
This project is created to learn spring framework

Adding some sample Car and Bike class.
In order to achieve loose coupling between the objects, we have to create interface which is 
implemented by Car and Bike class. <br>So adding Vehicle interface with drive abstract method.

<p align="center">
  <img src="./images/vehicle-interface-uml.png" />
</p>

## Dependency Injection with XML Configuration

Adding the springConfig.xml in the project with following configuration

```xml
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans 
    http://www.springframework.org/schema/beans/spring-beans.xsd">
	
	<bean id="vehicle" class="com.mygroup.springPractice.Bike"></bean>
</beans>
```

## Annotation based configuration

Changing the springConfig.xml with the following configuration

```xml
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:context="http://www.springframework.org/schema/context"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans.xsd
   http://www.springframework.org/schema/context
   http://www.springframework.org/schema/context/spring-context.xsd">
	
	<context:component-scan base-package="com.mygroup.springPractice"></context:component-scan>
	<!--  <bean id="vehicle" class="com.mygroup.springPractice.Bike"></bean> -->
</beans>
```

then adding ```@Component``` annotation above the Car and Bike class with ```import org.springframework.stereotype.Component```

## bean property

To demonstrate bean property, lets create ```Tyre``` Class

<p align="center">
  <img src="./images/tyre-class-uml.png" />
</p>

then adding this bean to the springConfig.xml file
```xml
<bean id="tyre" class="com.mygroup.springPractice.Tyre">
	<property name="brand" value="MRF"></property>
</bean>
```
This way we can pass values to the Tyre class object which is being injected to the main ```App``` class

## Constructor Injection
In order to pass values directly to the constructor while object creation, we have to change the xml as shown below
```xml
<bean id="tyre" class="com.mygroup.springPractice.Tyre">
	<!--	<property name="brand" value="MRF"></property> -->
	<constructor-arg value="Ceat"></constructor-arg>
</bean>
```
and also we have to add constructor method in Tyre class like this
```java
public Tyre(String brand) {
	super();
	this.brand = brand;
}
```

## Autowired Injection

For this, We have created tyre object in the Car class field. So this means that our Car class depends upon Tyre class.<br>
To automatically inject the tyre object, we have to use ```@Autowired``` annotation from ```import org.springframework.beans.factory.annotation.Autowired``` above the object like shown below
```java
@Autowired
private Tyre tyre;
```
For this demo, we are using annotation based configuration for Tyre class as well. So we have added ```@Component``` annotation above the Tyre class name and commented the construction method as it is not required for this demo and modified toString method. In addition to that, we also have to comment out the following xml code as
```xml
<!-- 	<bean id="tyre" class="com.mygroup.springPractice.Tyre"> -->
<!-- 		<constructor-arg value="Ceat"></constructor-arg> -->
<!-- 		<property name="brand" value="MRF"></property>  -->
<!-- 	</bean> -->
```