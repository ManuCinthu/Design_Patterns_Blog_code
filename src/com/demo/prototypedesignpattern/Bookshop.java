package com.demo.prototypedesignpattern;



import java.util.ArrayList;
import java.util.List;

public class Bookshop  implements Cloneable{
	private String shopname;
	List <Book> b= new ArrayList<>();
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public List<Book> getB() {
		return b;
	}
	public void setB(List<Book> b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Bookshop [shopname=" + shopname + ", b=" + b + "]";
	}
	
	public void loaddata() {
		Book b = new Book();
		for(int i= 1;i<=10;i++) {
			
			b.setBid(i);
			b.setBname("book"+i);
			getB().add(b);
			System.out.println(b);
		}
	}
	@Override
	protected Bookshop clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Bookshop shop = new Bookshop();
		for(Book b:getB()) {
			shop.getB().add(b);
		}
		return shop;
	}
	
	
	
	}
	


