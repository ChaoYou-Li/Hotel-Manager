package cn.zdxh.hotel.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.zdxh.hotel.dao.MenuDao;
import cn.zdxh.hotel.modle.Menu;

public class MenuDaoImpl implements MenuDao {
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public void save(Menu menu) {
        // TODO Auto-generated method stub
        this.hibernateTemplate.save(menu);
    }

    @Override
    public void update(Menu menu) {
        // TODO Auto-generated method stub
        this.hibernateTemplate.update(menu);
    }

    @Override
    public void delete(Menu menu) {
        // TODO Auto-generated method stub
        this.hibernateTemplate.delete(menu);
    }

    @Override
    public Menu findById(Menu menu) {
        // TODO Auto-generated method stub
        System.out.println("ִ����");
        return this.hibernateTemplate.get(Menu.class, menu.getM_id());

    }

    @Override
    public List<Menu> findAll() {
        // TODO Auto-generated method stub
        return (List<Menu>) this.hibernateTemplate.find("from Menu");
    }


}
