package cn.zdxh.hotel.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.zdxh.hotel.dao.EmployeeDao;
import cn.zdxh.hotel.modle.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public void save(Employee employee) {
        // TODO Auto-generated method stub
        this.hibernateTemplate.save(employee);
    }

    @Override
    public void update(Employee employee) {
        // TODO Auto-generated method stub
        this.hibernateTemplate.update(employee);
    }

    @Override
    public void delete(Employee employee) {
        // TODO Auto-generated method stub
        this.hibernateTemplate.delete(employee);
    }

    @Override
    public Employee findById(Employee employee) {
        // TODO Auto-generated method stub
        return this.hibernateTemplate.get(Employee.class, employee.getId());
    }

    @Override
    public List<Employee> findAll() {
        // TODO Auto-generated method stub
        return (List<Employee>) this.hibernateTemplate.find("from Employee");
    }

}
