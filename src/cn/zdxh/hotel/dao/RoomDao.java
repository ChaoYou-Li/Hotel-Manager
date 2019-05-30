package cn.zdxh.hotel.dao;

import java.util.List;

import cn.zdxh.hotel.modle.Room;

public interface RoomDao {

    public void save(Room room);

    public void update(Room room);

    public void delete(Room room);

    public Room findById(Room room);

    public List<Room> findAll();

}
