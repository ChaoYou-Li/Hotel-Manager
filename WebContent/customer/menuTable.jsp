<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h2 align="center">可供入住房间信息</h2>
<br/>
<br/>
<form action="menuTable" name="/" method="post">
    <input type="submit" value="查看">
</form>
<table align="center" border="1">

    <tr>
        <td width="130px">餐饮号码</td>
        <td width="130px">餐饮名称</td>
        <td width="130px">餐饮价格</td>
    </tr>
    <c:forEach items="${menuList }" var="c">
        <tr>
            <td>
                    ${c.m_id }
            </td>
            <td>
                    ${c.m_name }
            </td>
            <td>
                    ${c.m_price }
            </td>
        </tr>
    </c:forEach>
</table>