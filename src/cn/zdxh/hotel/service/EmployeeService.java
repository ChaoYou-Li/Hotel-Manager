package cn.zdxh.hotel.service;

import java.util.List;

import cn.zdxh.hotel.modle.Employee;

public interface EmployeeService {
    public int saveEmployee(Employee employee);

    public int updateEmployee(Employee employee);

    public int deleteEmployee(Employee employee);

    public Employee findById(Employee employee);

    public List<Employee> findAll();

}
