package cn.zdxh.hotel.service.impl;

import java.util.List;

import cn.zdxh.hotel.dao.MenuDao;
import cn.zdxh.hotel.modle.Menu;
import cn.zdxh.hotel.service.MenuService;

public class MenuServiceImpl implements MenuService {
    private MenuDao menuDao;

    public void setMenuDao(MenuDao menuDao) {
        this.menuDao = menuDao;
    }

    @Override
    public int saveMenu(Menu menu) {
        // TODO Auto-generated method stub
        this.menuDao.save(menu);
        return 1;
    }

    @Override
    public int updateMenu(Menu menu) {
        // TODO Auto-generated method stub
        this.menuDao.update(menu);
        return 1;
    }

    @Override
    public int deleteMenu(Menu menu) {
        // TODO Auto-generated method stub
        this.menuDao.delete(menu);
        return 1;
    }

    @Override
    public Menu findMenuId(Menu menu) {
        // TODO Auto-generated method stub
        return this.menuDao.findById(menu);
    }

    @Override
    public List<Menu> findAllMenu() {
        // TODO Auto-generated method stub
        return this.menuDao.findAll();
    }

}
