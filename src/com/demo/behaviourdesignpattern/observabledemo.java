package com.demo.behaviourdesignpattern;



public class observabledemo {
	public static void main(String[] args) {

		Channel t = new Channel();
		
		Subscriber s1 = new Subscriber("a");
		Subscriber s2 = new Subscriber("b");
		Subscriber s3 = new Subscriber("c");
		Subscriber s4 = new Subscriber("d");
		
		t.subscribe(s1);
		t.subscribe(s2);
		t.subscribe(s3);
		t.unsubscribe(s4);
        s1.Subchannel(t);
		t.upload("test prep");
		
		
	}
	
	
	
	
}
