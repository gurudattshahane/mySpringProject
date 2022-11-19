package com.mygroup.springPractice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Snapdragon implements MobileProcessor {

	@Override
	public void process() {
		System.out.println("Snapdragon CPU completed processing");
	}

}
