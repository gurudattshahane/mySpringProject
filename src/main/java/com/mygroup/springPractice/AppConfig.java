package com.mygroup.springPractice;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mygroup.springPractice")
public class AppConfig {
	
//	@Bean
//	public Samsung getphone() {
//		return new Samsung();
//	}
//	
//	@Bean
//	public MobileProcessor getprocessor() {
//		return new Snapdragon();
//	}
}
