<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h2 align="center">个人消费账单</h2>

您需要支付的总金额：${sumMoney }
<br/>
<br/>
<form action="billMoney" method="post">
    <input type="submit" value="查看">
</form>
<table align="center" style="font-size:14px">

    <tr>
        <td>
            <table>
                <tr>
                    <td>身份证号</td>
                    <td>餐饮名称</td>
                    <td>餐饮单价</td>
                    <td>订餐数量</td>
                </tr>
                <c:forEach items="${listMenu }" var="c">
                    <tr>
                        <td>${c.cu_ID}</td>
                        <td>${c.m_name}</td>
                        <td>${c.m_price}</td>
                        <td>${c.m_number}</td>
                    </tr>
                </c:forEach>
            </table>
        </td>
        <td>
            <table>
                <tr>
                    <td>房间号码</td>
                    <td>订房时间</td>
                    <td>房间单价</td>
                    <td>房间状况</td>
                </tr>
                <c:forEach items="${listRoom }" var="c">
                    <tr>
                        <td>${c.roomId}</td>
                        <td>${c.bookingTime}</td>
                        <td>${c.roomprice}</td>
                        <td>${c.roomMessage}</td>
                    </tr>
                </c:forEach>
            </table>
        </td>

    </tr>
    <c:forEach items="${menuList }" var="c">

    </c:forEach>


</table>