package cn.zdxh.hotel.modle;

public class User {
    private String cu_username;
    private String cu_password;
    private String cu_phoneNumber;
    private String cu_email;

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    public User(String cu_username, String cu_password, String cu_phoneNumber, String cu_email) {
        super();
        this.cu_username = cu_username;
        this.cu_password = cu_password;
        this.cu_phoneNumber = cu_phoneNumber;
        this.cu_email = cu_email;
    }

    public String getCu_username() {
        return cu_username;
    }

    public void setCu_username(String cu_username) {
        this.cu_username = cu_username;
    }

    public String getCu_password() {
        return cu_password;
    }

    public void setCu_password(String cu_password) {
        this.cu_password = cu_password;
    }

    public String getCu_phoneNumber() {
        return cu_phoneNumber;
    }

    public void setCu_phoneNumber(String cu_phoneNumber) {
        this.cu_phoneNumber = cu_phoneNumber;
    }

    public String getCu_email() {
        return cu_email;
    }

    public void setCu_email(String cu_email) {
        this.cu_email = cu_email;
    }

    @Override
    public String toString() {
        return "User [cu_username=" + cu_username + ", cu_password=" + cu_password + ", cu_phoneNumber="
                + cu_phoneNumber + ", cu_email=" + cu_email + "]";
    }


}
