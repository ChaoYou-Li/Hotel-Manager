package cn.zdxh.hotel.service.impl;

import java.util.List;

import cn.zdxh.hotel.dao.MessageDao;
import cn.zdxh.hotel.modle.CustomerMessage;
import cn.zdxh.hotel.service.MessageService;

public class MessageServiceImpl implements MessageService {
    private MessageDao messageDao;

    public void setMessageDao(MessageDao messageDao) {
        this.messageDao = messageDao;
    }

    @Override
    public int saveMessage(CustomerMessage message) {
        // TODO Auto-generated method stub
        this.messageDao.save(message);
        return 1;
    }

    @Override
    public int updateMessage(CustomerMessage message) {
        // TODO Auto-generated method stub
        this.messageDao.update(message);
        return 1;
    }

    @Override
    public int deleteMessage(CustomerMessage message) {
        // TODO Auto-generated method stub
        this.messageDao.delete(message);
        return 1;
    }

    @Override
    public CustomerMessage findMessageId(CustomerMessage message) {
        // TODO Auto-generated method stub
        return this.messageDao.findById(message);
    }

    @Override
    public List<CustomerMessage> findAllMessage() {
        // TODO Auto-generated method stub
        return this.messageDao.findAll();
    }

}
