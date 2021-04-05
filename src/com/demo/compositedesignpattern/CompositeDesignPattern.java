package com.demo.compositedesignpattern;

public class CompositeDesignPattern {


	
	public static void main(String[] args) {
		Component hd = new Leaf(400,"HOD");
		Component mouse = new Leaf(4500,"Mouse");
		Component monitor = new Leaf(700,"monitor");
		Component ram = new Leaf(90000,"RAm");
		Component cpu = new Leaf(900,"CPU");
		
		Composite ph  = new Composite("Peri");
		Composite cabinet  = new Composite("cabinet");
		Composite mb  = new Composite("mb");
		Composite computer  = new Composite("Computer");
		
		mb.addComponent(ram);
		mb.addComponent(cpu);
		System.out.println(mb);
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		System.out.println(ph);
		
		
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		System.out.println(cabinet);
		
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		System.out.println(computer);
		
//		  ram.showPrise();
//		  ph.showPrise();
//		  computer.showPrise();
//		
		
	}

}
