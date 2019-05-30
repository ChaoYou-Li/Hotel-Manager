package cn.zdxh.hotel.modle;

public class Clean {
    private String roomId;
    private String way;
    private Integer price;
    private String cu_ID;

    public Clean() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Clean(String roomId, String way, Integer price, String cu_ID) {
        super();
        this.roomId = roomId;
        this.way = way;
        this.price = price;
        this.cu_ID = cu_ID;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getCu_ID() {
        return cu_ID;
    }

    public void setCu_ID(String cu_ID) {
        this.cu_ID = cu_ID;
    }


}
