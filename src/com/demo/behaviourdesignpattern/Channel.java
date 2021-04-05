package com.demo.behaviourdesignpattern;



import java.util.ArrayList;
import java.util.List;

public class Channel {
	private List<Subscriber> l= new ArrayList<>();
	private String title;
	
	
	

	public List<Subscriber> getL() {
		return l;
	}
	public void setL(List<Subscriber> l) {
		this.l = l;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	public void subscribe(Subscriber sub) {
		l.add(sub);
	}
	public void unsubscribe(Subscriber sub) {
		l.remove(sub);
	}
	
	
	
	public void notifySub() {
		for(Subscriber sub: l) {
			sub.update();
		}
	}
	
	public void upload(String title) {
		this.title=title;
		notifySub();
	}
	

}
