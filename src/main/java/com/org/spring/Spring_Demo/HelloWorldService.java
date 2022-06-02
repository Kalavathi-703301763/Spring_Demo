package com.org.spring.Spring_Demo;

public class HelloWorldService {

	private String name;
    private String Address;
    
    public void setAddress(String address) {
    	Address=address;
    }
    public void setName(String name) {
    	this.name=name;
    }
    public String InfoData() {
    	return "Hello" + name + "your are staying "+Address ;
    	
    }


}
