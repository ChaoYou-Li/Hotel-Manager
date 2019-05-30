package cn.zdxh.hotel.service;

import java.util.List;

import cn.zdxh.hotel.modle.Room;

public interface RoomService {
    public int saveRoom(Room room);

    public int updateRoom(Room room);

    public int deleteRoom(Room room);

    public Room findRoomId(Room room);

    public List<Room> findAllRoom();


}
