package com.mann.CRUDJSF;


public class Employee{
	 
	
	  String rollid;  
	  String name;  
	  String email; 
	  
	  Employee(String rollid,String name,String email){  
		   this.rollid=rollid;  
		   this.name=name;  
		   this.email=email;  
		  }
	  
	 
	public String getRollid() {
		return rollid;
	}

	public void setRollid(String rollid) {
		this.rollid = rollid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

}
