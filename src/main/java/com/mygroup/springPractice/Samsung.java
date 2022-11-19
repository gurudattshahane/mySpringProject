package com.mygroup.springPractice;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {
	
	@Autowired
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
