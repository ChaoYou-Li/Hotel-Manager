package cn.zdxh.hotel.service;

import java.util.List;

import cn.zdxh.hotel.modle.Clean;

public interface CleanService {
    public int saveClean(Clean clean);

    public int updateClean(Clean clean);

    public int deleteClean(Clean clean);

    public Clean findCleanId(Clean clean);

    public List<Clean> findAllClean();

}
