package cn.zdxh.hotel.interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor {
    private static final long serializableUID = 1L;

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        //�õ�ActionContext
        ActionContext actionContext = invocation.getInvocationContext();
        //��ȡuser����
        Object user = actionContext.getSession().get("user");
        Object employee = actionContext.getSession().get("employee");
        if ((user != null) || (employee != null)) {
            return invocation.invoke();
        } else {
            actionContext.put("message", "����δ��¼�����ȵ�¼��");
            return Action.LOGIN;
        }

    }

}
