package com.demo.behaviourdesignpattern;



public class Subscriber {

	private String subname;
	public Subscriber(String subname) {
		
		this.subname = subname;
	}

	Channel channel;
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	
	public void update() {
		
		System.out.println("video uploaded");
		
	}
	
	public void Subchannel(Channel ch) {
		channel= ch;
	}
}

