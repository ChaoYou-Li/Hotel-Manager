package cn.zdxh.hotel.modle;

public class CustomerMessage {
    private String ID;
    private String m_name;
    private Integer m_price;
    private Integer m_number;
    private String roomId;
    private Integer bookingTime;
    private Integer roomprice;
    private String roomMessaege;


    public CustomerMessage() {
        super();
        // TODO Auto-generated constructor stub
    }

    public CustomerMessage(String iD, String roomId, Integer bookingTime, Integer roomprice, String roomMessaege,
                           String m_name, Integer m_price, Integer m_number) {
        super();
        ID = iD;
        this.roomId = roomId;
        this.bookingTime = bookingTime;
        this.roomprice = roomprice;
        this.roomMessaege = roomMessaege;
        this.m_name = m_name;
        this.m_price = m_price;
        this.m_number = m_number;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public Integer getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Integer bookingTime) {
        this.bookingTime = bookingTime;
    }

    public Integer getRoomprice() {
        return roomprice;
    }

    public void setRoomprice(Integer roomprice) {
        this.roomprice = roomprice;
    }

    public String getRoomMasege() {
        return roomMessaege;
    }

    public void setRoomMasege(String roomMessaege) {
        this.roomMessaege = roomMessaege;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public Integer getM_price() {
        return m_price;
    }

    public void setM_price(Integer m_price) {
        this.m_price = m_price;
    }

    public Integer getM_number() {
        return m_number;
    }

    public void setM_number(Integer m_number) {
        this.m_number = m_number;
    }


}