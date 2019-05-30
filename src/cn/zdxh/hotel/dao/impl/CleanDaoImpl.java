package cn.zdxh.hotel.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.zdxh.hotel.dao.CleanDao;
import cn.zdxh.hotel.modle.Clean;

public class CleanDaoImpl implements CleanDao {
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public void save(Clean clean) {
        // TODO Auto-generated method stub
        this.hibernateTemplate.save(clean);
    }

    @Override
    public void update(Clean clean) {
        // TODO Auto-generated method stub
        this.hibernateTemplate.update(clean);
    }

    @Override
    public void delete(Clean clean) {
        // TODO Auto-generated method stub
        this.hibernateTemplate.delete(clean);
    }

    @Override
    public Clean findById(Clean clean) {
        // TODO Auto-generated method stub
        if (clean.getRoomId() != null) {
            return this.hibernateTemplate.get(Clean.class, clean.getRoomId());
        } else {
            return this.hibernateTemplate.get(Clean.class, clean.getCu_ID());
        }

    }

    @Override
    public List<Clean> findAll() {
        // TODO Auto-generated method stub
        return (List<Clean>) this.hibernateTemplate.find("from Clean");
    }

}
