package cn.zdxh.hotel.action;

import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.zdxh.hotel.modle.Customer;
import cn.zdxh.hotel.service.CustomerService;

public class CustomerAction extends ActionSupport implements SessionAware, ServletRequestAware, ServletResponseAware {
    //������������
    private Customer customer;
    //������Ϣ����
    private String message = null;
    //����һ���б��ʶ
    private String forward = null;
    //��ȡservice������ݿ��������
    private CustomerService customerService;
    //��ȡ���λỰ���session
    ActionContext action = ActionContext.getContext();
    private HttpServletRequest request;
    private HttpServletResponse response;


    ActionContext actionContext = ActionContext.getContext();

    //�ṩһ���˿���Ϣ�ǼǴ�����
    public String customerMessage() {
        //�Թ˿�ע����û������в��
        Customer c = customerService.findById(customer);
        if (c == null) {
            int flag = customerService.saveCustomer(customer);
            if (flag == 1) {
                //�˿�ע��ɹ�
                forward = "success";
                message = "��ϲ������Ϣ�Ǽǳɹ���";

                Cookie cookie = new Cookie("customer", customer.getID());
                //Ϊcookie������������
                cookie.setMaxAge(24 * 60 * 06);
                //���ÿɽ��ܱ�cookie��·����Χ
                cookie.setPath(request.getContextPath());
                //�㲥cookie
                response.addCookie(cookie);
                //actionContext.getSession().put("customer", customer);
//				request.getSession().setAttribute("customer", customer);
                action.put("customer", customer);
            } else {
                //�˿���Ϣע��ʧ��
                message = "ע��ʧ�ܣ�������ע�ᣡ";
                forward = "error";
            }

        } else {

            //����cookie���浱ǰע��˿͵�ID��Ϣ
            Cookie cookie = new Cookie("customer", customer.getID());
            //Ϊcookie������������
            cookie.setMaxAge(24 * 60 * 06);
            //���ÿɽ��ܱ�cookie��·����Χ
            cookie.setPath(request.getContextPath());
            //�㲥cookie
            response.addCookie(cookie);


            //�˿���Ϣע��ʧ��
            message = "ע��ʧ�ܣ�������ע�ᣡ";
            forward = "error";
        }


        System.out.println(customer.toString());
        return forward;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
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

}
