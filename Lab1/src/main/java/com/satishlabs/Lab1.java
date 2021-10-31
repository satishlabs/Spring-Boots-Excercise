package com.satishlabs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.util.List;

public class Lab1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerDAO cdao = (CustomerDAO) ctx.getBean("custDAO");

        //1 add Customer
        Customer cust1 = new Customer(102,"satish","sa@gmail","12344","Pata");
        cdao.addCustomer(cust1);

        //2. getAll Customers
        System.out.println("Get All Customers");
        List<Customer> list = cdao.getAllCustomers();
        list.forEach(cust -> System.out.println(cust));
    }
}

