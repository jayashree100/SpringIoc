package com.bridgelab.ioc;

public class Airtel implements Sim{

	@Override
	public void calling() {
		System.out.println("call using Airtel Sim");
		
	}

	@Override
	public void data() {
		System.out.println("browse the data using airtel Sim");
		
	}

	

	

}
