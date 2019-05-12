package com.prashant.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Since the config xml is in the same package therefore we dont have to define path(package path). Also XML should be in class path i.e src/maim/java
       ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/prashant/spring/springcore/SpringConfig.xml");
       Employee employee = (Employee) ctx.getBean("emp");
       System.out.println(employee.getId());
       System.out.println(employee.getName());
	}

}
