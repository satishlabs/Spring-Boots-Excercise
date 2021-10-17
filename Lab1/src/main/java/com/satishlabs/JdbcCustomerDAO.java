package com.satishlabs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("custDAO")
public class JdbcCustomerDAO implements CustomerDAO{
	@Autowired
	private  JdbcTemplate jdbcTemp;
	
	@Override
	public void addCustomer(Customer cust) {
		String sql = "insert into customers values(?,?,?,?,?)";
		jdbcTemp.update(sql,cust.getCid(),cust.getCname(),cust.getEmail(),cust.getPhone(),cust.getCity());
		cust.getCity();
	}

	@Override
	public List<Customer> getAllCustomers() {
		String sql ="select * from customers";
		List<Customer> list = jdbcTemp.query(sql, new CustomerRowMapper());
		return list;
	}

}
