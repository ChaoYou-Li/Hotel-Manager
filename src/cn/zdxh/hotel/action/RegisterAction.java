package cn.zdxh.hotel.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.zdxh.hotel.modle.User;
import cn.zdxh.hotel.service.UserService;

public class RegisterAction extends ActionSupport {
    //�����������
    private User user;
    private String re_password;

    //������Ϣ����
    private String message;
    //����һ���б��ʶ
    private String forward = null;
    //��ȡservice������ݿ��������
    private UserService userService;
    //��ȡ���λỰ���session
    ActionContext actionContext = ActionContext.getContext();


    //�˿�ע�ᴦ����
    public String customerRegiste() {
        int flag = 0;
        //�Թ˿�ע����û������в��
        User u = userService.findById(user);
        //�ж�ע���û����Ƿ��ظ�
        if (u != null && (u.getCu_username().trim().equals(user.getCu_username().trim()))) {
            //���û���������ʹ��
            message = "���û����Ѵ��ڣ�������ע�ᣡ";
            forward = "error";
        } else if (!user.getCu_username().equals(re_password)) {
            //�����û�����һ��
            message = "��������������벻һ�£����������룡";
            forward = "error";
        } else {
            //�û���û����ʹ�ã�����ע��
            flag = userService.save(user);
            //�ж��Ƿ�ע��ɹ�
            if (flag == 1) {
                message = "��ϲ�����˺�ע��ɹ���";
                forward = "success";
            } else {
                message = "�˺�ע��ʧ�ܣ�������ע�ᣡ";
                forward = "error";
            }


        }
        System.out.println(user.toString() + "<br>");
        //System.out.println(u.toString());
        return forward;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRe_password() {
        return re_password;
    }

    public void setRe_password(String re_password) {
        this.re_password = re_password;
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
