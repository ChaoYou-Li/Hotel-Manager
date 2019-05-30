package cn.zdxh.hotel.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import cn.zdxh.hotel.modle.Employee;
import cn.zdxh.hotel.service.EmployeeService;

public class EmployeeAction extends ActionSupport implements SessionAware, ServletRequestAware, ServletResponseAware {
    private HttpServletRequest request;
    private HttpServletResponse response;
    private Employee employee;
    private EmployeeService employeeService;
    //������Ϣ����
    private String message = null;
    //����һ���б��ʶ
    private String forward = null;


    //�ṩһ��Ա����ӷ���
    public String addEmployee() {
        //�Ȳ�ѯ
        Employee e = employeeService.findById(employee);
        if (e != null) {
            message = "��Ա����������Ա��ʹ��";
            forward = "error";
        } else {
            int flag = employeeService.saveEmployee(employee);
            if (flag == 1) {
                //����ע���ɹ�
                message = "�ɹ���Ƹ����ӭ�´ι��٣�";
                forward = "success";
            } else {
                //����ע���ɹ�
                message = "��Ƹʧ�ܣ�������ע����";
                forward = "error";
            }

        }
        return forward;
    }


    public String deleteEmployee() {
        //�Ȳ�ѯ
        Employee e = employeeService.findById(employee);
        if (e == null) {
            message = "��Ա��ʹ�ô˺���";
            forward = "error";
        } else {
            int flag = employeeService.deleteEmployee(employee);
            if (flag == 1) {
                //����ע���ɹ�
                message = "�ɹ����ˣ���ӭ�´ι��٣�";
                forward = "success";
            } else {
                //����ע���ɹ�
                message = "����ʧ�ܣ�������ע����";
                forward = "error";
            }

        }
        return forward;
    }


    //�ṩһ���鿴Ա����Ϣ�ķ���
    public Employee selectEmployee() {
        Employee e = employeeService.findById(employee);

        if (e == null) {
            message = "��Ա��ʹ�ô˺���";
            forward = "error";
        } else {
            int flag = employeeService.deleteEmployee(employee);
            if (flag == 1) {
                //����ע���ɹ�
                message = "�ɹ����ˣ���ӭ�´ι��٣�";
                forward = "success";
                request.getSession().setAttribute("employee", e);


            } else {
                //����ע���ɹ�
                message = "����ʧ�ܣ�������ע����";
                forward = "error";
            }

        }

        return e;
    }


    //�ṩһ����ѯȫ��Ա����Ϣ����
    public List<Employee> findAllEmployee() {
        List<Employee> list = employeeService.findAll();
        System.out.println("�ɹ�");
        if (list != null) {
            message = "�ɹ����ˣ���ӭ�´ι��٣�";
            forward = "success";
            request.getSession().setAttribute("listEmployee", list);
            return list;
        } else {
            message = "����ʧ�ܣ�������ע����";
            forward = "error";
            return null;
        }


    }


    public String updateemployee() {
        //��ѯ
        Employee e = employeeService.findById(employee);

        if (e == null) {
            message = "��Ա��ʹ�ô˺���";
            forward = "error";
        } else {
            int flag = employeeService.updateEmployee(employee);
            if (flag == 1) {
                //����ע���ɹ�
                message = "�ɹ����ˣ���ӭ�´ι��٣�";
                forward = "success";
                request.getSession().setAttribute("employee", e);


            } else {
                //����ע���ɹ�
                message = "����ʧ�ܣ�������ע����";
                forward = "error";
            }

        }


        return forward;
    }


    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public HttpServletResponse getResponse() {
        return response;
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public void setServletResponse(HttpServletResponse arg0) {
        // TODO Auto-generated method stub
        this.response = arg0;
    }

    @Override
    public void setServletRequest(HttpServletRequest arg0) {
        // TODO Auto-generated method stub
        this.request = arg0;
    }

    @Override
    public void setSession(Map<String, Object> arg0) {
        // TODO Auto-generated method stub

    }

}
