package cn.zdxh.hotel.modle;

public class Employee {
    private String id;
    private String name;
    private Integer age;
    private String sex;
    private String position;

    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Employee(String id, String name, Integer age, String sex, String position) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


}
