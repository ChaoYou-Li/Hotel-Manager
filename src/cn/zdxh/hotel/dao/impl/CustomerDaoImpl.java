package cn.zdxh.hotel.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.zdxh.hotel.dao.CustomerDao;
import cn.zdxh.hotel.modle.Customer;

public class CustomerDaoImpl implements CustomerDao {
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public void save(Customer customer) {
        // TODO Auto-generated method stub
        this.hibernateTemplate.save(customer);
    }

    @Override
    public void update(Customer customer) {
        // TODO Auto-generated method stub
        this.hibernateTemplate.update(customer);
    }

    @Override
    public void delete(Customer customer) {
        // TODO Auto-generated method stub
        this.hibernateTemplate.delete(customer);
    }

    @Override
    public Customer findById(Customer customer) {
        // TODO Auto-generated method stub
        return this.hibernateTemplate.get(Customer.class, customer.getID());
    }

    @Override
    public List<Customer> findAll() {
        // TODO Auto-generated method stub
        return (List<Customer>) this.hibernateTemplate.find("from Customer");
    }

}
