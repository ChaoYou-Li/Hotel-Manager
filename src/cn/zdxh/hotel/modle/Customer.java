package cn.zdxh.hotel.modle;

import java.util.HashSet;
import java.util.Set;

public class Customer {
    private String ID;
    private String name;
    private Integer age;
    private String sex;
    private String phoneNumber;
    private String address;


    public Customer() {
        super();
        // TODO Auto-generated constructor stub
    }


    public Customer(String iD, String name, Integer age, String sex, String phoneNumber, String address) {
        super();
        ID = iD;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }


    public String getID() {
        return ID;
    }


    public void setID(String iD) {
        ID = iD;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Integer getAge() {
        return age;
    }


    public void setAge(Integer age) {
        this.age = age;
    }


    public String getSex() {
        return sex;
    }


    public void setSex(String sex) {
        this.sex = sex;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Customer [name=" + name + ", age=" + age + ", sex=" + sex + ", ID=" + ID + ", phoneNumber="
                + phoneNumber + "]";
    }


}
