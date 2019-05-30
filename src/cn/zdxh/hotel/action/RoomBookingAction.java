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
import cn.zdxh.hotel.modle.Room;
import cn.zdxh.hotel.service.RoomService;

@SuppressWarnings("serial")
public class RoomBookingAction extends ActionSupport implements SessionAware, ServletRequestAware, ServletResponseAware {
    private static final HttpServletRequest ServlectActionContext = null;
    //������������
    private Room room;
    //������Ϣ����
    private String message = null;
    //����һ���б��ʶ
    private String forward = null;
    //��ȡservice������ݿ��������
    private RoomService roomService;
    //��ȡ���λỰ���session
    private HttpServletRequest request;
    private HttpServletResponse response;
    ActionContext actionContext = ActionContext.getContext();

    //	private Customer customer = (Customer) request.getAttribute("customer");
    private String cu_ID;

    //


    //�ṩһ��Ԥ������ǼǴ�����
    public String roomBooking() {
        //���յ�ǰ�˿͵�ID��Ϣ
        Cookie[] cookie = request.getCookies();
        //����cookieѰ���Լ�������
        for (int i = 0; cookie != null && i < cookie.length; i++) {
            if ("customer".equals(cookie[i].getName())) {
                cu_ID = cookie[i].getValue();
                break;
            }
        }


        int flag;
        //�Թ˿�Ԥ��������Ϣ���в��
        Room r = roomService.findRoomId(room);
        if (r != null) {
            System.out.println(cu_ID);
            if (r.getFlag().equals("1")) {
                //�������Ԥ��
                r.setCu_ID(cu_ID);//���÷���Ĺ˿�ID
                r.setFlag("0");//���÷���״̬
                r.setBookingTime(room.getBookingTime());
                flag = roomService.updateRoom(r);//���·�����Ϣ

                forward = "success";
                message = "��ϲ��������Ԥ���ɹ���";
//			System.out.println(customer.toString()+"B");

            } else {
                //�˿���Ϣע��ʧ��
                message = "Ԥ��ʧ�ܣ�������ѡ�񷿼䣡";
                forward = "error";
            }
        } else {
            System.out.println("��ѯ����");
            forward = "error";
        }
        return forward;

    }


    //�ṩһ���շ��䷿����Ϣ��ѯ����
    public String findEmpty() {
        System.out.println("1111");
        //�Ȳ�ѯ���з���
        List<Room> list = roomService.findAllRoom();
        //����һ������������ſշ���
        List<Room> listRoom = new ArrayList<Room>();
        //������������
        for (Room n : list) {
            //��ѯÿһ������
            //�������״̬Ϊ��1����Ϊ�շ�
            if (n.getFlag().equals("1")) {
                //�ѷ�����뼯��
                listRoom.add(n);
                System.out.println(n.toString());
            }
        }

//		actionContext.put("emptyRoom", "123456");
        request.getSession().setAttribute("username", listRoom);
        //���ؿշ�������
        return "success";
    }


    //�ṩһ����ס������Ϣ��ѯ����
    public List<Room> findUsed() {
        System.out.println("2222");
        //�Ȳ�ѯ���з���
        List<Room> list = roomService.findAllRoom();
        //����һ������������ſշ���
        List<Room> listRoom = new ArrayList<Room>();
        //������������
        for (Room n : list) {
            //�������״̬Ϊ��1����Ϊ�շ�
            if (n.getFlag().equals("0")) {
                //�ѷ�����뼯��
                listRoom.add(n);
            }
        }

        //���ؿշ�������
        return listRoom;
    }


    //�ṩһ������������Ϣ��ѯ����
    public String findRoom(Room room) {
        Room r = roomService.findRoomId(room);
        //�жϲ�ѯ���
        if (r != null) {
            //��ѯ�ɹ�
            message = "�����ѯ�ɹ���";
            forward = "success";
            //�洢������Ϣ
            actionContext.put("roomMessage", r);

        } else {
            message = "��ѯʧ�ܣ������²�ѯ��";
            forward = "error";
        }

        return forward;
    }


    //�ṩһ������ע����ס�ķ���
    public String destroyRoom() {
        //�Ȳ�ѯ������Ϣ���ݿ�
        Room r = roomService.findRoomId(room);
        if (r != null) {
            //������ڣ����з���ע������
            r.setFlag("1");
            int flag = roomService.updateRoom(r);
            if (flag == 1) {
                //����ע���ɹ�
                message = "�ɹ�ע������ӭ�´ι��٣�";
                forward = "success";
            } else {
                //����ע���ɹ�
                message = "ע��ʧ�ܣ�������ע����";
                forward = "error";
            }
        } else {
            //�޴˷���
            message = "ע��ʧ�ܣ�������ע����";
            forward = "error";
        }


        return forward;
    }


    //�ṩһ�������巿����
    public String deleteRoom(Room room) {
        //�Ȳ�ѯ������Ϣ���ݿ�
        Room r = roomService.findRoomId(room);
        if (r != null && (r.getCu_ID() != null) && (r.getFlag().equals("0"))) {
            //������ڣ����з���ע������

            Cookie cookie = new Cookie("roomMoney", room.getRoomId());
            //Ϊcookie������������
            cookie.setMaxAge(24 * 60 * 06);
            //���ÿɽ��ܱ�cookie��·����Χ
            cookie.setPath(request.getContextPath());
            //�㲥cookie
            response.addCookie(cookie);


            r.setFlag("1");
            r.setCu_ID(null);
            int flag = roomService.updateRoom(r);
            if (flag == 1) {
                //��Ǯ����ɹ�
                message = "�ɹ����㣬��ӭ�´ι��٣�";
                forward = "success";

            } else {
                //����ע���ɹ�
                message = "����ʧ�ܣ������½��㣡";
                forward = "error";
            }
        } else {
            //�޴˷���
            message = "����ʧ�ܣ������½��㣡";
            forward = "error";
        }


        return forward;
    }


    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setRoomService(RoomService roomService) {
        this.roomService = roomService;
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
