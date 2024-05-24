package com.firstspringminiproject.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//field based injection, using autowired annotation on the field
@Component
public class BusinessClass {
	
	/*
	 * Field based injection - can be used only on methods, inside onstructors the objects are not yet created.
	 * @Autowired
	 * Dependency01 d01;
	 * @Autowired
	 * Dependency02 d02;
	 */
	
	Dependency01 d01;
	Dependency02 d02;
	
	
	@Autowired
	public void getD01(Dependency01 d01) {
		this.d01 = d01;
	}
	
	@Autowired
	public void getD02(Dependency02 d02) {
		this.d02 = d02;
	}

	public BusinessClass() {
		//System.out.println("in constructor!!");
		//System.out.println(d01+"\n"+d02); //null , null. both the objects although autowired are not created as yet.
	}
	
	//public BusinessClass(Dependency01 d01, Dependency02 d02) automatically autowires, it doesnt need the autowired annotation
	
	
	public String toString() {
		return d01+"\n"+d02;
	}

}
