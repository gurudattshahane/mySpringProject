package com.mygroup.springPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	
	@Autowired
	@Qualifier("mediatek")
	private MobileProcessor cpu;
	
	public MobileProcessor getCpu() {
		return cpu;
	}
	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void specs() {
		System.out.println("Specs: \nFull HD+ Display, 12MP Camera, 4GB RAM, Octa Core Processor");
	}
}
