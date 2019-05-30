package cn.zdxh.hotel.dao;

import java.util.List;

import cn.zdxh.hotel.modle.Menu;

public interface MenuDao {
    public void save(Menu menu);

    public void update(Menu menu);

    public void delete(Menu menu);

    public Menu findById(Menu menu);

    public List<Menu> findAll();

}
