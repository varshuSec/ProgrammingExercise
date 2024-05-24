package com.firstspringminiproject.advancedspringconcepts;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//prototype scoped beans create new bean during each getBean() call while singleton scoped beans create one bean per spring IOC container i.e the appContext object.
//prototype beans are created when state of an object is required to be preserved, while singleton scoped beans are generally generic beans.
//singleton beans are the default while prototype need to be specified with @scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE.)
@Component
class SingletonClass {
	
}

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeClass {
	
}

@ComponentScan
public class SpringSingletonVsPrototypeBeanScope {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext("com.firstspringminiproject.advancedspringconcepts");
		AnnotationConfigApplicationContext appContext2 = new AnnotationConfigApplicationContext("com.firstspringminiproject.advancedspringconcepts");
		
		System.out.println(appContext.getBean(PrototypeClass.class));
		System.out.println(appContext.getBean(PrototypeClass.class));
		System.out.println(appContext.getBean(PrototypeClass.class));
		System.out.println(appContext.getBean(PrototypeClass.class));
		
		System.out.println(appContext.getBean(SingletonClass.class));
		System.out.println(appContext.getBean(SingletonClass.class));
		System.out.println(appContext.getBean(SingletonClass.class));
		System.out.println(appContext.getBean(SingletonClass.class));
		
		
		System.out.println(appContext2.getBean(PrototypeClass.class));
		System.out.println(appContext2.getBean(PrototypeClass.class));
		System.out.println(appContext2.getBean(PrototypeClass.class));
		System.out.println(appContext2.getBean(PrototypeClass.class));
		
		System.out.println(appContext2.getBean(SingletonClass.class));
		System.out.println(appContext2.getBean(SingletonClass.class));
		System.out.println(appContext2.getBean(SingletonClass.class));
		System.out.println(appContext2.getBean(SingletonClass.class));
		
		
	}
}
