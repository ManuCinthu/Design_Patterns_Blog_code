package com.demo.builderdesignpattern;

public class Phone {


	private int pid;
	private String pname;
	private String os;
	private String ram;
	
	public int getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public String getOs() {
		return os;
	}

	public String getRam() {
		return ram;
	}

	
	
	public Phone(int pid, String pname, String os, String ram) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.os = os;
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Phone [pid=" + pid + ", pname=" + pname + ", os=" + os + ", ram=" + ram + "]";
	}
	
    

}
