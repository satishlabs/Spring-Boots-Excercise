package com.satishlabs;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab1Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerDAO cdao = (CustomerDAO) ctx.getBean("custDAO");
		
		//1. Add Customer
		Customer cust1 = new Customer(104, "Satish", "Satish@gmail", 1020,"Ranchi");
		cdao.addCustomer(cust1);
		
		//2. GetAll Customers
		System.out.println("Get All Customers");
		List<Customer> list = cdao.getAllCustomers();
		list.forEach(cust ->System.out.println(cust));
	}

}
