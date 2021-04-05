package com.demo.prototypedesignpattern;

public class Protypedesignpattern {




	public static void main(String[] args) throws CloneNotSupportedException {
		Bookshop bs = new Bookshop();
		bs.setShopname("Novaliety");
		bs.loaddata();
		
		
		Bookshop bs1 = (Bookshop) bs.clone();
		bs.getB().remove(2);
		bs1.setShopname("ad");
		System.out.println(bs);
		System.out.println(bs1);
		
	}
}