package com.mann.CRUDJSF;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
 

@ManagedBean(name="bean", eager=true)

public class Search {

	  String rollid;  
	  String name;  
	  String email; 
	  String msg;
	  ArrayList<Employee> sl;
	  ArrayList<Employee> result;
	  
	 


	public String getMsg() {
		return msg;
	}



	public void setMsg(String msg) {
		this.msg = msg;
	}



	public ArrayList<Employee> getResult() {
		return result;
	}



	public void setResult(ArrayList<Employee> result) {
		this.result = result;
	}



	public ArrayList<Employee> getSl() {
		return sl;
	}



	public void setSl(ArrayList<Employee> sl) {
		this.sl = sl;
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



public Search() {  	 	
   sl= new ArrayList<Employee>();
	sl.add(new Employee("1","Apul","apul.gupta1421@gmail.com"));
	sl.add(new Employee("2", "Megha", "megha@mannindia.com")); 
	sl.add(new Employee("3", "Rishabh", "rishabh@mannindia.com"));
	sl.add(new Employee("4", "Ujjwal", "ujjwal@mannindia.com"));
	sl.add(new Employee("5", "Ayush", "ayush@mannindia.com"));
	sl.add(new Employee("6", "Lakshay", "lakshay@mannindia.com"));	
	
	result = new ArrayList<Employee>(sl);
	
	
 
	}

 public void searched(){
	 
	  
	 
	 if (name.isEmpty() && email.isEmpty() && !rollid.isEmpty()){
		 
		 searchid();
	 }
	  
	 
	 else if(rollid.isEmpty() && email.isEmpty() && !name.isEmpty()){
		 searchname( );
	 }
	 
	 else if(rollid.isEmpty() && name.isEmpty() && !email.isEmpty()){
		 searchemail();
	 }
	 
	 else if(!name.isEmpty() && email.isEmpty() && !rollid.isEmpty()){
		 searchidname();
	 }
		 
	 else if(name.isEmpty() && !email.isEmpty() && !rollid.isEmpty()){
		 searchidemail();
	 } 
		
	 else if(!name.isEmpty() && !email.isEmpty() && rollid.isEmpty()){
		 searchnameemail();
	 }
	 else if(!name.isEmpty() && !email.isEmpty() && !rollid.isEmpty()){
		 allentry();
	 }
	 else{
		 
		 setMsg("You Have Left All Fields Empty");
	 } 
 }

 public boolean searchid(){ 
	 
	  for(Employee emp:sl){  
	        
		  if(emp.getRollid().equals(rollid)){
			 
			  if(!result.isEmpty()){
				  result.clear();
			  }
			  
			   setMsg("Record Found");
			   
			  result= new ArrayList<Employee>();
			  result.add(new Employee(emp.getRollid(),emp.getName(),emp.getEmail()));
			     
			    System.out.println(emp.getRollid()+emp.getName()+emp.getEmail()+msg);
			    return true;
		  }
		  		  		    
	  }
	  
	 setMsg("No Record Found"); 
	return false; 	 
 }
 
 
 public boolean searchidname(){ 
	 
	  for(Employee emp:sl){  
	        
		  if(emp.getRollid().equals(rollid) && emp.getName().equals(name)){
			  
			  if(!result.isEmpty()){
				  result.clear();
			  }
			   setMsg("Record Found");
			   
			  result= new ArrayList<Employee>();
			  result.add(new Employee(emp.getRollid(),emp.getName(),emp.getEmail()));
			     
			    System.out.println(emp.getRollid()+emp.getName()+emp.getEmail()+msg);
			    return true;
		  }
		  		  		    
	  }
	  
	 setMsg("No Record Found"); 
	return false; 	 
}
 
 
 public boolean searchidemail(){ 
	 
	  for(Employee emp:sl){  
	        
		  if(emp.getRollid().equals(rollid) && emp.getEmail().equals(email)){
			  
			  if(!result.isEmpty()){
				  result.clear();
			  }
			   setMsg("Record Found");
			   
			  result= new ArrayList<Employee>();
			  result.add(new Employee(emp.getRollid(),emp.getName(),emp.getEmail()));
			     
			    System.out.println(emp.getRollid()+emp.getName()+emp.getEmail()+msg);
			    return true;
		  }
		  		  		    
	  }
	  
	 setMsg("No Record Found"); 
	return false; 	 
}
 
 
 
 
 
 
 
 public boolean searchname() {
	 
	 for(Employee emp:sl){  
	        
		  if(emp.getName().equals(name)){
			  setMsg("Record Found");
			  
			  if(!result.isEmpty()){
				  result.clear();
			  }
			  result= new ArrayList<Employee>();
			  result.add(new Employee(emp.getRollid(),emp.getName(),emp.getEmail()));
			     
			    System.out.println(emp.getRollid()+emp.getName()+emp.getEmail());
			    return true;
		  }
		    
	  }
	  
	 setMsg("No Record Found"); 
	return false; 	
	 
 }
 
public boolean searchnameemail() {
	 
	 for(Employee emp:sl){  
	        
		  if(emp.getName().equals(name) && emp.getEmail().equals(email)){
			  setMsg("Record Found");
			  
			  if(!result.isEmpty()){
				  result.clear();
			  }
			  result= new ArrayList<Employee>();
			  result.add(new Employee(emp.getRollid(),emp.getName(),emp.getEmail()));
			     
			    System.out.println(emp.getRollid()+emp.getName()+emp.getEmail());
			    return true;
		  }
		    
	  }
	  
	 setMsg("No Record Found"); 
	return false; 	
	 
 }
 
 
 
 public boolean searchemail(){

	 for(Employee emp:sl){  
	        
		  if(emp.getEmail().equals(email)){
			  
			  if(!result.isEmpty()){
				  result.clear();
			  }
			  setMsg("Record Found");
			  result= new ArrayList<Employee>();
			  result.add(new Employee(emp.getRollid(),emp.getName(),emp.getEmail()));    
			    System.out.println(emp.getRollid()+emp.getName()+emp.getEmail());
			    return true;
		  }
		    
	  }
	  
	 setMsg("No Record Found");  
	return false;
	 
	 
 }
 
public boolean allentry() {
	 
	 for(Employee emp:sl){  
	        
		  if(emp.getName().equals(name) && emp.getEmail().equals(email) && emp.getRollid().equals(rollid)){
			  setMsg("Record Found");
			  
			  if(!result.isEmpty()){
				  result.clear();
			  }
			  result= new ArrayList<Employee>();
			  result.add(new Employee(emp.getRollid(),emp.getName(),emp.getEmail()));
			     
			    System.out.println(emp.getRollid()+emp.getName()+emp.getEmail());
			    return true;
		  }
		    
	  }
	  
	 setMsg("No Record Found"); 
	return false; 	
	 
 }
 
 
}
