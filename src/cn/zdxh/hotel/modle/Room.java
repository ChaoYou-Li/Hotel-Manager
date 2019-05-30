package cn.zdxh.hotel.modle;


public class Room {
    private String roomId;
    private Integer bookingTime;
    private Integer roomprice;
    private String roomMessage;
    private String flag;
    private String cu_ID;

    public Room() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Room [roomId=" + roomId + ", bookingTime=" + bookingTime + ", roomprice=" + roomprice + ", roomMessage="
                + roomMessage + ", flag=" + flag + ", cu_ID=" + cu_ID + "]";
    }

    public Room(String roomId, Integer bookingTime, Integer roomprice, String roomMessage, String flag, String cu_ID) {
        super();
        this.roomId = roomId;
        this.bookingTime = bookingTime;
        this.roomprice = roomprice;
        this.roomMessage = roomMessage;
        this.flag = flag;
        this.cu_ID = cu_ID;
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

    public String getRoomMessage() {
        return roomMessage;
    }

    public void setRoomMessage(String roomMessage) {
        this.roomMessage = roomMessage;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCu_ID() {
        return cu_ID;
    }

    public void setCu_ID(String cu_ID) {
        this.cu_ID = cu_ID;
    }


}
