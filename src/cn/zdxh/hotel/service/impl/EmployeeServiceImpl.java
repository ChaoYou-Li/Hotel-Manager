package cn.zdxh.hotel.service.impl;

import java.util.List;

import cn.zdxh.hotel.dao.EmployeeDao;
import cn.zdxh.hotel.modle.Employee;
import cn.zdxh.hotel.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao employeeDao;

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public int saveEmployee(Employee employee) {
        // TODO Auto-generated method stub
        this.employeeDao.save(employee);
        return 1;
    }

    @Override
    public int updateEmployee(Employee employee) {
        // TODO Auto-generated method stub
        this.employeeDao.update(employee);
        return 1;
    }

    @Override
    public int deleteEmployee(Employee employee) {
        // TODO Auto-generated method stub
        this.employeeDao.delete(employee);
        return 1;
    }

    @Override
    public Employee findById(Employee employee) {
        // TODO Auto-generated method stub
        return this.employeeDao.findById(employee);
    }

    @Override
    public List<Employee> findAll() {
        // TODO Auto-generated method stub
        return this.employeeDao.findAll();
    }

}
