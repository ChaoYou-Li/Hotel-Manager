package cn.zdxh.hotel.dao;

import java.util.List;

import cn.zdxh.hotel.modle.Employee;

public interface EmployeeDao {
    public void save(Employee employee);

    public void update(Employee employee);

    public void delete(Employee employee);

    public Employee findById(Employee employee);

    public List<Employee> findAll();

}
