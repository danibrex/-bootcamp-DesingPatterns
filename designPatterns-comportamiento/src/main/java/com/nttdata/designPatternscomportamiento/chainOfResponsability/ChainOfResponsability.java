package com.nttdata.designPatternscomportamiento.chainOfResponsability;

public class ChainOfResponsability {
	
	private String name;
	private ChainOfResponsability subordinate;
	
	public ChainOfResponsability(String name) {
		super();
		this.name = name;
	}
	public ChainOfResponsability(String name, ChainOfResponsability subordinate) {
		super();
		this.name = name;
		this.subordinate = subordinate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ChainOfResponsability getSubordinate() {
		return subordinate;
	}
	public void setSubordinate(ChainOfResponsability subordinate) {
		this.subordinate = subordinate;
	}
	
	public void runOrder(String order) {
		if(subordinate == null) {
			System.out.println("Order " + order + " will be executed by " + name);
		} else {
			subordinate.runOrder(order);
		}
	}
	

}
