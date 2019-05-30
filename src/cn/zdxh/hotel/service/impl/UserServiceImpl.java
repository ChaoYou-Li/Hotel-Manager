package cn.zdxh.hotel.service.impl;

import java.util.List;

import cn.zdxh.hotel.dao.UserDao;
import cn.zdxh.hotel.modle.User;
import cn.zdxh.hotel.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public int save(User user) {
        this.userDao.save(user);
        return 1;
    }

    @Override
    public int update(User user) {
        this.userDao.update(user);
        return 1;
    }

    @Override
    public int delete(User user) {
        this.userDao.delete(user);
        return 1;
    }

    @Override
    public User findById(User user) {
        return this.userDao.findById(user);
    }

    @Override
    public List<User> findAll() {
        return this.userDao.findAll();
    }


}
