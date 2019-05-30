package cn.zdxh.hotel.service.impl;

import java.util.List;

import cn.zdxh.hotel.dao.RoomDao;
import cn.zdxh.hotel.modle.Room;
import cn.zdxh.hotel.service.RoomService;

public class RoomServiceImpl implements RoomService {
    private RoomDao roomDao;

    public void setRoomDao(RoomDao roomDao) {
        this.roomDao = roomDao;
    }

    @Override
    public int saveRoom(Room room) {
        // TODO Auto-generated method stub
        this.roomDao.save(room);
        return 1;
    }

    @Override
    public int updateRoom(Room room) {
        // TODO Auto-generated method stub
        this.roomDao.update(room);
        return 1;
    }

    @Override
    public int deleteRoom(Room room) {
        // TODO Auto-generated method stub
        this.roomDao.delete(room);
        return 1;
    }

    @Override
    public Room findRoomId(Room room) {
        // TODO Auto-generated method stub
        return this.roomDao.findById(room);
    }

    @Override
    public List<Room> findAllRoom() {
        // TODO Auto-generated method stub
        return this.roomDao.findAll();
    }

}
