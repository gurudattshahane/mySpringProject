package com.mygroup.springPractice;

import org.springframework.stereotype.Component;

@Component
public class Mediatek implements MobileProcessor {

	@Override
	public void process() {
		System.out.println("Mediatek CPU completed processing");
	}

}
