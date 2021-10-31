package com.satishlabs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("custDAO")
public class CustomerDAOImpl implements  CustomerDAO{

    @Autowired
    private JdbcTemplate jdbcTemp;

    @Override
    public void addCustomer(Customer cust) {
        String sql ="insert into customers values(?,?,?,?,?)";
        jdbcTemp.update(sql,cust.getCid(),cust.getCname(),cust.getEmail(),cust.getPhone(),cust.getCity());
    }

    @Override
    public List<Customer> getAllCustomers() {
        String sql="select * from customers";
        List<Customer> custList = jdbcTemp.query(sql,new CustomerRowMapper());
        return custList;
    }
}
