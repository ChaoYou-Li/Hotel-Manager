package cn.zdxh.hotel.modle;

public class MenuMessage {
    private String m_id;
    private String m_name;
    private Integer m_price;

    public MenuMessage() {
        super();
        // TODO Auto-generated constructor stub
    }

    public MenuMessage(String m_id, String m_name, Integer m_price) {
        super();
        this.m_id = m_id;
        this.m_name = m_name;
        this.m_price = m_price;
    }

    public String getM_id() {
        return m_id;
    }

    public void setM_id(String m_id) {
        this.m_id = m_id;
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


}
