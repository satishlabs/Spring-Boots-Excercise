package com.satishlabs;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerRowMapper implements RowMapper<Customer> {
    @Override
    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
        Customer cust = new Customer();
        cust.setCid(rs.getInt(1));
        cust.setCname(rs.getString(2));
        cust.setEmail(rs.getString(3));
        cust.setPhone(rs.getString(4));
        cust.setCity(rs.getString(5));
        return cust;
    }
}
