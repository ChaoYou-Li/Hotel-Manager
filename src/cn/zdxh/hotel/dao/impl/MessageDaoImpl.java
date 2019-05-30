package cn.zdxh.hotel.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.zdxh.hotel.dao.MessageDao;
import cn.zdxh.hotel.modle.CustomerMessage;

public class MessageDaoImpl implements MessageDao {
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public void save(CustomerMessage message) {
        // TODO Auto-generated method stub
        this.hibernateTemplate.save(message);
    }

    @Override
    public void update(CustomerMessage message) {
        // TODO Auto-generated method stub
        this.hibernateTemplate.update(message);
    }

    @Override
    public void delete(CustomerMessage message) {
        // TODO Auto-generated method stub
        this.hibernateTemplate.delete(message);
    }

    @Override
    public CustomerMessage findById(CustomerMessage message) {
        // TODO Auto-generated method stub
        return this.hibernateTemplate.get(CustomerMessage.class, message.getID());
    }

    @Override
    public List<CustomerMessage> findAll() {
        // TODO Auto-generated method stub
        return (List<CustomerMessage>) this.hibernateTemplate.find("from CustomerMessage");
    }

}
