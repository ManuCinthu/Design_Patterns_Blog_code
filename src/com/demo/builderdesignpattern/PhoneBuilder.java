package com.demo.builderdesignpattern;

public class PhoneBuilder {
	

		private int pid;
		private String pname;
		private String os;
		private String ram;
		

		public PhoneBuilder setPid(int pid) {
			this.pid = pid;
			return this;
		}


		public PhoneBuilder setPname(String pname) {
			this.pname = pname;
			return this;
			
		}


		public PhoneBuilder setOs(String os) {
			this.os = os;
			return this;
			
		}


		public PhoneBuilder setRam(String ram) {
			this.ram = ram;
			return this;
			
		}



	public Phone getPhone() {
		return new Phone(pid, pname, os, ram);
		
	}

	

}
