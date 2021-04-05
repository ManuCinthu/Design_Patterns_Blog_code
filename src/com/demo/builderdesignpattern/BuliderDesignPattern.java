package com.demo.builderdesignpattern;

public class BuliderDesignPattern {
public static void main(String[] args) {
//		Phone obj = new Phone(12, "sam", "2GB", "Android");
//		System.out.println((obj));
		
		Phone p = new PhoneBuilder().setOs("Android").getPhone();
	
		
		System.out.println(p);
	}

}
