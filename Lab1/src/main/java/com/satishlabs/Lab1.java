package com.satishlabs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.util.List;

public class Lab1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerDAO cdao = (CustomerDAO) ctx.getBean("custDAO");

        //1 add Customer
        Customer cust1 = new Customer(103,"Kumar","k@gmail","124844","Ranchi");
        cdao.addCustomer(cust1);

        //2. getAll Customers
        System.out.println("Get All Customers");
        List<Customer> list = cdao.getAllCustomers();
        list.forEach(cust -> System.out.println(cust));
    }
}

