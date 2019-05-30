<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h2 align="center">可供入住房间信息</h2>
<br/>
<br/>
<form action="emptyRoom" name="/" method="post">
    <input type="submit" value="查看">
</form>
<table align="center" border="1">

    <tr>
        <td width="130px">房间号码</td>
        <td width="130px">房间单价</td>
        <td width="130px">房间状况</td>
    </tr>

    <c:forEach items="${username }" var="c">

        <tr>
            <td>
                    ${c.roomId }
            </td>
            <td>
                    ${c.roomprice }
            </td>
            <td>
                    ${c.roomMessage }
            </td>
        </tr>
    </c:forEach>

</table>