package com.demo.compositedesignpattern;


import java.util.ArrayList;
import java.util.List;


interface Component{
	void showPrise();
}


class Leaf implements Component{
	
	int prise;
	String name;
	

	public Leaf(int prise, String name) {
		super();
		this.prise = prise;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Leaf [prise=" + prise + ", name=" + name + "]";
	}


	@Override
	public void showPrise() {
		// TODO Auto-generated method stub
		System.out.println(name+":"+prise);
	}

}

class Composite implements Component{
	String name;
	List<Component> components=new  ArrayList<>();
	

	@Override
	public String toString() {
		return "Composite [name=" + name + ", components=" + components + "]";
	}


	public Composite(String name) {
		super();
		this.name = name;
	}

	
	public void addComponent(Component com) {
		components.add(com);
				
	}

	@Override
	public void showPrise() {
		//System.out.println(name);
		for(Component n:components) {
			n.showPrise();
		}
		
	}
	
	
}
