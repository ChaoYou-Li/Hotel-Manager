package cn.zdxh.hotel.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.zdxh.hotel.dao.RoomDao;
import cn.zdxh.hotel.modle.Room;

public class RoomDaoImpl implements RoomDao {
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public void save(Room room) {
        // TODO Auto-generated method stub
        this.hibernateTemplate.save(room);
    }

    @Override
    public void update(Room room) {
        // TODO Auto-generated method stub
        this.hibernateTemplate.update(room);
    }

    @Override
    public void delete(Room room) {
        // TODO Auto-generated method stub
        this.hibernateTemplate.delete(room);
    }

    @Override
    public Room findById(Room room) {
        // TODO Auto-generated method stub
        if (room.getRoomId() != null) {
            return this.hibernateTemplate.get(Room.class, room.getRoomId());
        } else if (room.getCu_ID() != null) {
            return this.hibernateTemplate.get(Room.class, room.getCu_ID());
        } else {
            return this.hibernateTemplate.get(Room.class, room.getFlag());
        }


    }

    @Override
    public List<Room> findAll() {
        // TODO Auto-generated method stub
        return (List<Room>) this.hibernateTemplate.find("from Room");
    }


}
