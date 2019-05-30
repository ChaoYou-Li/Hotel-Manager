<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<div style="height:300px; width:38%; float:right; background-color:#FFFFFF; float:right; font-size:12px; font-weight:bold">
    <table>
        <tr>
            <img src="${pageContext.request.contextPath}/image/login_title.jpg" width="100%" height="50px"/>
        </tr>
        <tr>
            <td>
                <div style="height:160px; width:auto;">

                    <form action="employeelogin" method="post" style="margin:20px">
                        <table>
                            <tr class="main">
                                <td class="ch">用户名：</td>
                                <td><input type="text" name="employee.name" value="${employee.name }" size="20"/></td>
                            </tr>
                            <tr class="main">
                                <td class="ch">密&nbsp;&nbsp;&nbsp;&nbsp;码：</td>
                                <td><input type="password" name="employee.id" size="20"/></td>
                            </tr>
                            <tr>
                                <td>
                                    <a href="${pageContext.request.contextPath}/login/login.jsp?rose=customer"
                                       style=" margin-left:40px">顾客</a>
                                </td>
                                <td>
                                    <a href="${pageContext.request.contextPath}/login/login.jsp?rose=employee"
                                       style=" margin-left:70px"> 员工</a>
                                </td>
                            </tr>
                            <tr class="main">
                                <td class="ch"></td>

                            </tr>
                            <tr class="main" style="margin:20px">
                                <td id="anniu1"><input type="reset" value="重置" style=" margin-left:40px"/></td>
                                <td id="anniu2"><input type="submit" value="登录" style=" margin-left:70px"/></td>
                            </tr>
                        </table>
                    </form>
                    <!-- 显示验证错误信息 -->
                    ${message }
                    <s:fielderror cssStyle="color:red"/>
                    <font color="red"><s:property value="message"/></font><br>
                </div>
            </td>
        </tr>
    </table>

    <div style="float:right; margin-bottom:10px; margin-right:20px">
        没有账号？&nbsp;&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/registe/register.jsp">返回注册</a>
    </div>
</div>