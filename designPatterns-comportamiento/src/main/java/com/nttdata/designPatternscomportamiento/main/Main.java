package com.nttdata.designPatternscomportamiento.main;



import com.nttdata.designPatternscomportamiento.chainOfResponsability.ChainOfResponsability;


public class Main {

	public static void main(String[] args) {
		/***********************Chain of Responsability****************************/		
		System.out.println("************Chain of Responsability************");		
		
		ChainOfResponsability soldier = new ChainOfResponsability("Soldier");
		ChainOfResponsability sargent = new ChainOfResponsability("Sargent", soldier);
		ChainOfResponsability capitan = new ChainOfResponsability("Capitan", sargent);
		
		capitan.runOrder("Push red button");
	}

}
