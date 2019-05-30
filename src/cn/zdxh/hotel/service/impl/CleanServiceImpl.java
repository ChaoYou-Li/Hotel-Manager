package cn.zdxh.hotel.service.impl;

import java.util.List;

import cn.zdxh.hotel.dao.CleanDao;
import cn.zdxh.hotel.modle.Clean;
import cn.zdxh.hotel.service.CleanService;

public class CleanServiceImpl implements CleanService {
    private CleanDao cleanDao;

    public void setCleanDao(CleanDao cleanDao) {
        this.cleanDao = cleanDao;
    }

    @Override
    public int saveClean(Clean clean) {
        // TODO Auto-generated method stub
        this.cleanDao.save(clean);
        return 1;
    }

    @Override
    public int updateClean(Clean clean) {
        // TODO Auto-generated method stub
        this.cleanDao.update(clean);
        return 1;
    }

    @Override
    public int deleteClean(Clean clean) {
        // TODO Auto-generated method stub
        this.cleanDao.delete(clean);
        return 1;
    }

    @Override
    public Clean findCleanId(Clean clean) {
        // TODO Auto-generated method stub
        return this.cleanDao.findById(clean);
    }

    @Override
    public List<Clean> findAllClean() {
        // TODO Auto-generated method stub
        return this.cleanDao.findAll();
    }

}
