package cn.zdxh.hotel.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.zdxh.hotel.modle.Employee;
import cn.zdxh.hotel.modle.User;
import cn.zdxh.hotel.service.UserService;

public class CustomerLoginAction extends ActionSupport {
    //�����������
    private User user;

    //������Ϣ����
    private String message;
    //����һ���б��ʶ
    private String forward = null;
    //��ȡservice������ݿ��������
    private UserService userService;
    //��ȡ���λỰ���session
    ActionContext actionContext = ActionContext.getContext();


    //�ṩһ���˿͵�¼������
    public String customerLogin() {
        //�Թ˿͵�¼���û������в��
        User u = userService.findById(user);
        //�жϵ�¼�û���Ϣ�Ƿ���ע��
        if (u != null) {
            //��¼�ɹ�
            if (u.getCu_password().equals(user.getCu_password())) {
                //������ȷ
                forward = "success";
                user.setCu_username(u.getCu_username());
                user.setCu_email(u.getCu_email());
                actionContext.getSession().put("user", user);
            } else {
                //�������
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


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }


}
