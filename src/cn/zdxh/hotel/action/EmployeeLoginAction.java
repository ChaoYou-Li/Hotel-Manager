package cn.zdxh.hotel.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.zdxh.hotel.modle.Employee;
import cn.zdxh.hotel.service.EmployeeService;

public class EmployeeLoginAction extends ActionSupport {
    //�����������
    private Employee employee;

    //������Ϣ����
    private String message;
    //����һ���б��ʶ
    private String forward = null;
    //��ȡservice������ݿ��������
    private EmployeeService employeeService;
    //��ȡ���λỰ���session
    ActionContext actionContext = ActionContext.getContext();


    //�ṩһ��Ա����¼������
    public String employeeLogin() {
        //��Ա����¼���û������в��
        Employee e = employeeService.findById(employee);
        //�жϵ�¼�û���Ϣ�Ƿ���ע��
        if (e != null) {//������ȷ
            if (e.getName().equals(employee.getName())) {
                //�û�����ȷ
                forward = "success";
                employee.setName(e.getName());
                actionContext.getSession().put("employee", employee);
            } else {
                //�û�������
                message = "�û������������������µ�¼";
                forward = "error";
            }

        } else {
            //�û�δע�ᣬ��¼ʧ��
            message = "�û������������������µ�¼��";
            forward = "error";
        }

        return forward;
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

}
