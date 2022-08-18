package com.waylon.service;

import com.waylon.domain.Customer;

import java.util.List;

public interface ICustomerService {

    //查询所有客户
    List<Customer> findAllCustomer();
    //保存客户信息
    void saveCustomer(Customer customer);
    //更改客户信息
    void updateCustomer(Customer customer);
    //根据Id删除对象
    void deleteCustomer(int cust_id);
    //根据ID查询用户，返回用户信息
    Customer findCustomerById(int cust_id);


}
