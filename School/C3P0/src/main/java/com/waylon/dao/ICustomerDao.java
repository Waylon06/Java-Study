package com.waylon.dao;

import com.waylon.domain.Customer;

import java.util.List;

public interface ICustomerDao {
    List<Customer> findAllCustomer();

    void saveCustomer(Customer customer);

    void updateCustomer(Customer customer);

    void deleteCustomer(int custId);

    Customer findCustomerById(int custId);
}
