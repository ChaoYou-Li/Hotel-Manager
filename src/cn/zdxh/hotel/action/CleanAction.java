package cn.zdxh.hotel.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.zdxh.hotel.modle.Clean;
import cn.zdxh.hotel.modle.Customer;
import cn.zdxh.hotel.modle.Room;
import cn.zdxh.hotel.service.CleanService;
import cn.zdxh.hotel.service.RoomService;

public class CleanAction extends ActionSupport {
    //������������
    private Clean clean;
    //������Ϣ����
    private String message = null;
    //����һ���б��ʶ
    private String forward = null;
    //��ȡservice������ݿ��������
    private CleanService cleanService;
    private RoomService roomService;
    //��ȡ���λỰ���session
    ActionContext actionContext = ActionContext.getContext();
    private Customer customer = (Customer) actionContext.get("customer");

    //�ṩһ��������Ϣ��ӷ���
    public String cleanSave() {
        //�Ȳ�ѯ������Ϣ���ݿ�
        Room r = new Room();
        r.setRoomId(clean.getRoomId());
        Room room = roomService.findRoomId(r);
        //�жϸ÷����Ƿ����
        if (room != null) {
            //�жϷ�����Ϣ��˿���Ϣƥ��
            if (room.getCu_ID() == null) {
                message = "����ʧ�ܣ���������";
                forward = "error";
            } else if (room.getCu_ID().equals(customer.getID())) {
                //���ڣ���Ϣ�������ݱ�
                clean.setCu_ID(customer.getID());
                int flag = cleanService.saveClean(clean);
                if (flag == 1) {
                    message = "��������ɹ���";
                    forward = "success";
                    actionContext.put("cleanMessage", clean);
                } else {
                    message = "����ʧ�ܣ���������";
                    forward = "error";
                }
            } else {//���Ǵ˹˿ͷ���
                message = "����ʧ�ܣ���������";
                forward = "error";
            }

        } else {
            message = "û�д˷��䣬�������뷿��ţ�";
            forward = "error";
        }


        return forward;
    }


    //�ṩһ����������Ϣ��ѯ����
    public String findClean(Clean clean) {
        Clean c = cleanService.findCleanId(clean);
        if (c != null) {
            message = "��ѯ�ɹ���";
            forward = "success";
            actionContext.put("cleanMessage", c);
        } else {
            message = "��ѯʧ�ܣ������²�ѯ��";
            forward = "error";
        }

        return forward;
    }


    //�ṩһ����������Ϣɾ������
    public String deleteClean(Clean clean) {
        //�Ȳ�ѯ�ù˿��Ƿ���ڷ�������
        Clean c = cleanService.findCleanId(clean);
        if (c != null) {
            //����
            if (c.getCu_ID().equals(customer.getID())) {
                actionContext.put("cleanMoney", c);
                //ƥ�����,����ɾ��
                int flag = cleanService.deleteClean(clean);
                if (flag == 1) {
                    message = "����������˳ɹ���";
                    forward = "success";
                } else {
                    message = "����ʧ�ܣ������½��ˣ�";
                    forward = "error";
                }

            } else {//�÷��䲻�Ǵ˹˿ͷ���
                message = "����ʧ�ܣ������½��ˣ�";
                forward = "error";
            }
        } else {//�����ڴ˶���
            message = "����ʧ�ܣ������½��ˣ�";
            forward = "error";
        }


        return forward;
    }


    public void setRoomService(RoomService roomService) {
        this.roomService = roomService;
    }

    public Clean getClean() {
        return clean;
    }

    public void setClean(Clean clean) {
        this.clean = clean;
    }

    public void setCleanService(CleanService cleanService) {
        this.cleanService = cleanService;
    }


}
