package cn.zdxh.hotel.service;

import java.util.List;

import cn.zdxh.hotel.modle.Customer;

public interface CustomerService {
    public int saveCustomer(Customer customer);

    public int updateCustomer(Customer customer);

    public int deleteCustomer(Customer customer);

    public Customer findById(Customer customer);

    public List<Customer> findAll(Customer customer);

}
