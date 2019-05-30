package cn.zdxh.hotel.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.zdxh.hotel.dao.UserDao;
import cn.zdxh.hotel.modle.User;

public class UserDaoImpl implements UserDao {

    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public void save(User user) {
        this.hibernateTemplate.save(user);

    }

    @Override
    public void update(User user) {
        this.hibernateTemplate.update(user);
    }

    @Override
    public void delete(User user) {
        this.hibernateTemplate.delete(user);
    }

    @Override
    public User findById(User user) {
        return this.hibernateTemplate.get(User.class, user.getCu_username());
    }

    @Override
    public List<User> findAll() {
        // TODO Auto-generated method stub
        return (List<User>) this.hibernateTemplate.find("from User");
    }

}
