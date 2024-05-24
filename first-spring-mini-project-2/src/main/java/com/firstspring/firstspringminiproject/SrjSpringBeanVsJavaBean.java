package com.firstspring.firstspringminiproject;

import java.io.Serializable;

public class SrjSpringBeanVsJavaBean {
}


//Spring Beans example is in SrjSpringConfiguration class
//Java Bean
//Java beans must implement Serializable
class JavaBeans implements Serializable {
	//public constructor is needed
	String name;
	public JavaBeans() {}
	
	//getters and setters to access bean variables
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
}