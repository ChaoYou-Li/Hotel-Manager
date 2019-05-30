package cn.zdxh.hotel.service.impl;

import java.util.List;

import cn.zdxh.hotel.dao.CustomerDao;
import cn.zdxh.hotel.modle.Customer;
import cn.zdxh.hotel.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
    private CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public int saveCustomer(Customer customer) {
        // TODO Auto-generated method stub
        this.customerDao.save(customer);
        return 1;
    }

    @Override
    public int updateCustomer(Customer customer) {
        // TODO Auto-generated method stub
        this.customerDao.update(customer);
        return 1;
    }

    @Override
    public int deleteCustomer(Customer customer) {
        // TODO Auto-generated method stub
        this.customerDao.delete(customer);
        return 1;
    }

    @Override
    public Customer findById(Customer customer) {
        // TODO Auto-generated method stub
        return this.customerDao.findById(customer);
    }

    @Override
    public List<Customer> findAll(Customer customer) {
        // TODO Auto-generated method stub
        return this.customerDao.findAll();
    }

}
