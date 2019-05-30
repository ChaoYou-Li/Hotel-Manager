package cn.zdxh.hotel.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.zdxh.hotel.modle.Menu;
import cn.zdxh.hotel.modle.MenuMessage;
import cn.zdxh.hotel.service.MenuService;

public class MenuBookingAction extends ActionSupport implements SessionAware, ServletRequestAware, ServletResponseAware {
    //�����������
    private Menu menu;

    //������Ϣ����
    private String message;
    //����һ���б��ʶ
    private String forward = null;
    //��ȡservice������ݿ��������
    private MenuService menuService;
    //��ȡ���λỰ���session
    private HttpServletRequest request;
    private HttpServletResponse response;
    private String cu_ID;


    ActionContext actionContext = ActionContext.getContext();


    //�ṩһ����Ӳ˵���Ϣ����
    public String menuBooking() {
//		System.out.println(menu.toString());
        //���յ�ǰ�˿͵�ID��Ϣ
        Cookie[] cookie = request.getCookies();
        //����cookieѰ���Լ�������
        for (int i = 0; cookie != null && i < cookie.length; i++) {
            if ("customer".equals(cookie[i].getName())) {
                cu_ID = cookie[i].getValue();
                break;
            }
        }

        System.out.println(menu.toString());
        int flag;
        //�Ȳ�ѯ���ݿ��Ƿ�����Ԥ���˲���
        Menu m = menuService.findMenuId(menu);
//		System.out.println(menu.toString());
        if (m != null) {
            //�ж϶��͹˿��Ƿ�Ϊͬһ��

            if (m.getCu_ID() != null && m.getCu_ID().equals(cu_ID)) {//ͬһ�˶�����ֱ�Ӹ��²͵���Ϣ
                //�жϴ˶����Ƿ�������
                if (m.getFlag().equals("1")) {
                    //δ���ã�������������
                    m.setM_number(m.getM_number() + menu.getM_number());
                    flag = menuService.updateMenu(m);
                    if (flag == 1) {
                        //���ͳɹ�
                        message = "��ϲ�������������ɹ���";
                        forward = "success";

                    } else {
                        //����ʧ��
                        message = "����ʧ�ܣ������¶�����";
                        forward = "error";
                    }

                } else {
                    //�����ã���ԭ�����������������ö������������Ұ����ñ�ʶ���á�1��
                    m.setM_number(menu.getM_number());
                    m.setFlag("1");
                    flag = menuService.updateMenu(m);
                    if (flag == 1) {
                        //���ͳɹ�
                        message = "��ϲ�������������ɹ���";
                        forward = "success";

                    } else {
                        //����ʧ��
                        message = "����ʧ�ܣ������¶�����";
                        forward = "error";
                    }
                }
            } else {
                //����ͬһ���˶��ͣ���Ҫ��Ӳ͵���Ϣ
                m.setCu_ID(cu_ID);
                //1��ʾ���ͳɹ���δ�ò�
                m.setFlag("1");
                m.setM_number(menu.getM_number());
                flag = menuService.updateMenu(m);
                if (flag == 1) {
                    //���ͳɹ�
                    message = "��ϲ�������������ɹ���";
                    forward = "success";

                } else {
                    //����ʧ��
                    message = "����ʧ�ܣ������¶�����";
                    forward = "error";
                }

            }
        }

        return forward;
    }


    //�ṩһ���˵���Ϣ��ѯ����
    public String findMenuAll() {
        //��ѯ���в͵���Ϣ
        List<Menu> listMenu = menuService.findAllMenu();
        //�жϲ͵���Ϣ�Ƿ��ѯ�ɹ�
        if (listMenu.isEmpty()) {
            //�˵���ѯʧ��
            message = "��ѯʧ�ܣ������²�ѯ��";
            forward = "error";
        } else {
            //�͵���ѯ�ɹ�
            forward = "success";
            //����˵���Ϣ���ݼ�
            actionContext.put("menuList", listMenu);
        }

        return forward;
    }


    //��ѯ�����˵���Ϣ����
    public String findMenu(Menu menu) {
        Menu m = menuService.findMenuId(menu);
        if (m != null) {
            //��ѯ�ɹ�
            message = "�˵���ѯ�ɹ���";
            forward = "success";


            Cookie cookie = new Cookie("menuMessage", menu.getM_id());
            //Ϊcookie������������
            cookie.setMaxAge(24 * 60 * 06);
            //���ÿɽ��ܱ�cookie��·����Χ
            cookie.setPath(request.getContextPath());
            //�㲥cookie
            response.addCookie(cookie);
        } else {
            message = "��ѯʧ�ܣ������²�ѯ��";
            forward = "error";
        }

        return forward;
    }


    //�ṩһ���˵���Ϣ�������
    public String updateMenu(Menu menu) {
        //�Ȳ�ѯ�˵���Ϣ���ݿ�
        Menu m = menuService.findMenuId(menu);
        //�жϲ˵��Ƿ����
        if (m != null) {
            //�˵����ڣ��Ѳ˵�״̬����Ϊ��0��
            m.setFlag("0");
            int flag = menuService.updateMenu(m);
            if (flag == 1) {
                //�͵���ѯ�ɹ�
                message = "�����ϲ˳ɹ���";
                forward = "success";
            } else {
                //�˵���ѯʧ��
                message = "�ϲ�ʧ�ܣ��������ϲˣ�";
                forward = "error";
            }

        } else {
            //�˵�������
            //�˵���ѯʧ��
            message = "��ѯʧ�ܣ������²�ѯ��";
            forward = "error";
        }

        return forward;
    }


    //�ṩһ���͵���Ϣɾ������
    public String deleteMenu(Menu menu) {
        //�Ȳ�ѯ�͵���Ϣ���ݿ�

        int flag = menuService.deleteMenu(menu);
        if (flag == 1) {
            message = "�˵�ɾ���ɹ���";
            forward = "success";
        } else {
            message = "�˵�ɾ��ʧ�ܣ�";
            forward = "error";
        }


        return forward;
    }


    //�ṩһ�������б���
    public String menuTable() {
        //����һ������������Ų�����Ϣ
        List<MenuMessage> list = new ArrayList<MenuMessage>();

        list.add(new MenuMessage("031", "÷�˿���", 68));
        list.add(new MenuMessage("032", "��������", 88));
        list.add(new MenuMessage("033", "����С��", 38));
        list.add(new MenuMessage("034", "�Οh����", 168));
        list.add(new MenuMessage("035", "��ʽ���", 128));
        list.add(new MenuMessage("036", "������Ϻ", 108));
        list.add(new MenuMessage("037", "��������", 98));


        //�ɹ�
        forward = "success";
//			actionContext.put("menuList", list);
        request.getSession().setAttribute("menuList", list);


        return forward;
    }


    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void setMenuService(MenuService menuService) {
        this.menuService = menuService;
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
