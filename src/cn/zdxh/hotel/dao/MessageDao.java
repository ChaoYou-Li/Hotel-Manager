package cn.zdxh.hotel.dao;

import java.util.List;

import cn.zdxh.hotel.modle.CustomerMessage;

public interface MessageDao {
    public void save(CustomerMessage message);

    public void update(CustomerMessage message);

    public void delete(CustomerMessage message);

    public CustomerMessage findById(CustomerMessage message);

    public List<CustomerMessage> findAll();

}
