package cn.zdxh.hotel.dao;

import java.util.List;

import cn.zdxh.hotel.modle.Clean;


public interface CleanDao {
    public void save(Clean clean);

    public void update(Clean clean);

    public void delete(Clean clean);

    public Clean findById(Clean clean);

    public List<Clean> findAll();

}
