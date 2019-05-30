package cn.zdxh.hotel.service;

import java.util.List;

import cn.zdxh.hotel.modle.User;

public interface UserService {

    public int save(User user);

    public int update(User user);

    public int delete(User user);

    public User findById(User user);

    public List<User> findAll();
}
