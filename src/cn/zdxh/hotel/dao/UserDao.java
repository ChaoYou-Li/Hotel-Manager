package cn.zdxh.hotel.dao;

import java.util.List;

import cn.zdxh.hotel.modle.User;

public interface UserDao {

    public void save(User user);

    public void update(User user);

    public void delete(User user);

    public User findById(User user);

    public List<User> findAll();
}
