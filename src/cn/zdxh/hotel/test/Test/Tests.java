package cn.zdxh.hotel.test.Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zdxh.hotel.modle.Employee;
import cn.zdxh.hotel.modle.Menu;
import cn.zdxh.hotel.modle.Room;
import cn.zdxh.hotel.modle.User;
import cn.zdxh.hotel.service.EmployeeService;
import cn.zdxh.hotel.service.MenuService;
import cn.zdxh.hotel.service.RoomService;
import cn.zdxh.hotel.service.UserService;

public class Tests {

    @Test
    public void test() {
        Employee e = new Employee();
        e.setId("1");
        e.setName("1");
        e.setAge(20);
        e.setSex("Ů");
        e.setPosition("cooker");
        String xmlPath = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        EmployeeService roomService = applicationContext.getBean("employeeService", EmployeeService.class);
        roomService.saveEmployee(e);
    }

}




