package cn.zdxh.hotel.modle;


public class Menu {
    private String m_id;
    private String m_name;
    private Integer m_number;
    private Integer m_price;
    private String flag;
    private String cu_ID;

    public Menu() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Menu(String m_id, String m_name, Integer m_number, Integer m_price, String flag, String cu_ID) {
        super();
        this.m_id = m_id;
        this.m_name = m_name;
        this.m_number = m_number;
        this.m_price = m_price;
        this.flag = flag;
        this.cu_ID = cu_ID;
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

    public Integer getM_number() {
        return m_number;
    }

    public void setM_number(Integer m_number) {
        this.m_number = m_number;
    }

    public Integer getM_price() {
        return m_price;
    }

    public void setM_price(Integer m_price) {
        this.m_price = m_price;
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

    @Override
    public String toString() {
        return "Menu [m_id=" + m_id + ", m_name=" + m_name + ", m_number=" + m_number + ", m_price=" + m_price
                + ", flag=" + flag + ", cu_ID=" + cu_ID + "]";
    }


}
