package cn.zdxh.hotel.service;

import java.util.List;

import cn.zdxh.hotel.modle.CustomerMessage;

public interface MessageService {
    public int saveMessage(CustomerMessage message);

    public int updateMessage(CustomerMessage message);

    public int deleteMessage(CustomerMessage message);

    public CustomerMessage findMessageId(CustomerMessage message);

    public List<CustomerMessage> findAllMessage();

}
