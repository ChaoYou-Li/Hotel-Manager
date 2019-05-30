package cn.zdxh.hotel.service;

import java.util.List;

import cn.zdxh.hotel.modle.Menu;

public interface MenuService {
    public int saveMenu(Menu menu);

    public int updateMenu(Menu menu);

    public int deleteMenu(Menu menu);

    public Menu findMenuId(Menu menu);

    public List<Menu> findAllMenu();

}
