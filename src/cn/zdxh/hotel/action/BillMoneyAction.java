package cn.zdxh.hotel.action;

import java.util.ArrayList;
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

import cn.zdxh.hotel.modle.Customer;
import cn.zdxh.hotel.modle.CustomerMessage;
import cn.zdxh.hotel.modle.Menu;
import cn.zdxh.hotel.modle.Room;
import cn.zdxh.hotel.service.CleanService;
import cn.zdxh.hotel.service.RoomService;
import cn.zdxh.hotel.service.MenuService;
import cn.zdxh.hotel.service.MessageService;

public class BillMoneyAction extends ActionSupport implements SessionAware, ServletRequestAware, ServletResponseAware {
    //��ȡservice������ݿ��������
    private CleanService cleanService;
    private RoomService roomService;
    private MenuService menuService;
    private MessageService messageService;


    //������Ϣ����
    private String message = null;
    //����һ���б��ʶ
    private String forward = null;

    private String cu_ID;

    //��ȡ���λỰ���session
    private HttpServletRequest request;
    private HttpServletResponse response;
    ActionContext actionContext = ActionContext.getContext();
//	private Customer customer = (Customer) actionContext.get("customer");


    //�ṩһ�������˵����ɷ���
    public String billTable() {
        //��������Ͳ˵���Bean����
        Room room = new Room();
        Menu menu = new Menu();
        //��ȡ�õ��Է���Ͳ˵�������action����
        MenuBookingAction menuBooking = new MenuBookingAction();
        RoomBookingAction roomBooking = new RoomBookingAction();
        //��ȡ�õ���ǰע��˿͵�ID
        Cookie[] cookie = request.getCookies();
        //����cookieѰ���Լ�������
        for (int i = 0; cookie != null && i < cookie.length; i++) {
            if ("customer".equals(cookie[i].getName())) {
                cu_ID = cookie[i].getValue();
                break;
            }
        }


//		Cookie cookie = new Cookie("roomMoney",room.getRoomId());
//		//Ϊcookie������������
//		cookie.setMaxAge(24*60*06);
//		//���ÿɽ��ܱ�cookie��·����Χ
//		cookie.setPath(request.getContextPath());
//		//�㲥cookie
//		response.addCookie(cookie);

        //�ѵ�ǰע��˿͵�ID��ŵ�����Ͳ˵���Bean��Ϊ����ѯ�������˵�������
        room.setCu_ID(cu_ID);
        menu.setCu_ID(cu_ID);


        //��ѯ���в˵������
        List<Menu> list = menuService.findAllMenu();
        //����һ������������ſշ���
        List<Menu> listMenu = new ArrayList<Menu>();
        //������������
        for (Menu n : list) {
            //��ѯÿһ���˵�,�ж��ǲ��Ǹù˿͵Ĳ˵�����������
            if (n.getCu_ID() != null && n.getCu_ID().equals(cu_ID)) {
                //�������˵���ŵ�һ����������,������������
                n.setCu_ID(cu_ID);
                listMenu.add(n);


                //
//				n.setFlag("1");
//				menuBooking.updateMenu(n);
            }
        }
        //��Ҫ���˵Ĳ˵��浽session��
        request.getSession().setAttribute("listMenu", listMenu);
        //���ؿշ�������


        //��ѯ���з���������������˵�����һ��
        List<Room> list2 = roomService.findAllRoom();

        List<Room> listRoom = new ArrayList<Room>();
//		List<CustomerMessage> listMessage = new ArrayList<CustomerMessage>();
        for (Room n : list2) {
            if (n.getFlag().equals("0") && n.getCu_ID().equals(cu_ID)) {
                listRoom.add(n);

            }
        }
        request.getSession().setAttribute("listRoom", listRoom);

        //�ѷ���Ͳ˵���Ϣ�Ŵ���Ϣ��


        int flag = billMoney();
        System.out.println("success");
        return "success";

    }


    //�ṩһ�����������㷽��
    public int billMoney() {
        //�����������������۸�Ԥ������
        int sumMoney = 0;
        int roomMoney = 0;
        int menuMoney = 0;
        int roomprice;
        int bookingTime;
        int menuprice;
        int menuNumber;

        //��ѯ��������������Ϣ�����㷿Ǯ
        List<Room> listRoom = (List<Room>) request.getSession().getAttribute("listRoom");
        //��������
        for (Room r : listRoom) {
            if (r != null) {
                //��ȡ����ļ۸���Ϣ��Ԥ��ʱ��,���㷿Ǯ
                roomprice = r.getRoomprice();
                bookingTime = r.getBookingTime();
                roomMoney += roomprice * bookingTime;
                //������ɺ󣬰ѷ�������������Ϣ
                r.setCu_ID(null);
                r.setFlag("1");
//				r.setBookingTime(0);
                roomService.updateRoom(r);
            }
        }//����������


        //��ѯ��������������Ϣ�����㷿Ǯ
        List<Menu> listMenu = (List<Menu>) request.getSession().getAttribute("listMenu");
        //�������Ѳ˵�
        for (Menu m : listMenu) {
            if (m != null) {
                //��ȡ�˵��۸������
                menuprice = m.getM_price();
                menuNumber = m.getM_number();
                menuMoney += menuprice * menuNumber;
                //��������������ò˵���Ϣ
//				m.setCu_ID(null);
//				m.setFlag("1");
//				m.setM_number(0);
                menuService.updateMenu(m);
            }
        }


        //�ѷ�Ǯ�ͷ�Ǯ��һ����Ϊ�˿͵�������
        sumMoney = roomMoney + menuMoney;

        //��������Ӧ��ҳ��
        request.getSession().setAttribute("sumMoney", sumMoney);
        sumMoney = 0;
        return 1;
    }


    public void setCleanService(CleanService cleanService) {
        this.cleanService = cleanService;
    }

    public void setRoomService(RoomService roomService) {
        this.roomService = roomService;
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


    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }


}
