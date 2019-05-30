package cn.zdxh.hotel.dao;

import java.util.List;

import cn.zdxh.hotel.modle.Customer;

public interface CustomerDao {
    public void save(Customer customer);

    public void update(Customer customer);

    public void delete(Customer customer);

    public Customer findById(Customer customer);

    public List<Customer> findAll();

}
