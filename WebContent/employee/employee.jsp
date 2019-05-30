<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>员工主页</title>
</head>
<style type="text/css">
    ._divMenu {
        text-align: center;
        width: auto;
        border-top-width: 4px;
        border-top-style: solid;
        border-top-color: #82B211;
        background: #1FC6FA;
        padding: 10px 0px 10px 0px;
        font-size: 14px;
    }

    ._divMenu a {
        font-size: 14px;
        font-weight: bold;
        padding: 10px 10px 10px 20px;

    }

</style>
<body>
<div class="_title_head" style="background-color:#0298D7; width:800px; margin:auto">
    <table>
        <tr>
            <td>
                <h2 style="margin-left:40px; color:#FFF;">酒店信息管理系统</h2>
            </td>
            <div style="float:right; margin-right:50px; margin-top:40px;">
                <a href="${pageContext.request.contextPath}/index.jsp" style="color:#FFF">返回首页</a>
            </div>

        </tr>
    </table>
</div>

<div class="_center_login" style="background-color:#F8F8F8; height:800px; width:800px; margin:auto;">

    <div style="margin:auto; 100px">
        <table style=" margin:auto">
            <tr>
                <td>
                    <h1>恭喜您！成为了本酒店的一员</h1>
                </td>
            </tr>
        </table>
    </div>

    <div style="height:620px; width:auto; background-color:#FFFFFF; margin-left:15px; margin-right:15px; padding:15px; border-color:#0F9; border:2px; border:solid">
        <div style="height:40px; width:auto; background-color:#CC6; line-height:40px">
            <a style="font-size:18px; margin-left:20px">CUSTOMER CENTER 客户中心</a>
        </div>
        <hr/>


        <div class="_divMenu">
            <a href="${pageContext.request.contextPath}/employee/employee.jsp">经理</a>
            <a href="${pageContext.request.contextPath}/employee/employee.jsp">前台</a>
            <a href="${pageContext.request.contextPath}/employee/employee.jsp">厨师</a>
            <a href="${pageContext.request.contextPath}/employee/employee.jsp">保洁</a>
            <div style=" height:auto; width:80px; float:right; margin-bottom:5px">
                ${param.rose }
            </div>
        </div>
        <%--         <c:set value="${param.rose }" var ="rose" property="rose"></c:set> --%>

        <%--        <c:choose> --%>
        <%--        <c:when test="${rose.equals('manager') }"> --%>
        <%--        		<%@ include file="managerModule.jsp"%> --%>

        <%--        </c:when> --%>
        <%--        <c:when test="${rose.equals('front')  }"> --%>
        <%--        		<%@ include file="frontModule.jsp" %> --%>
        <%--        </c:when> --%>
        <%--        <c:when test="${rose.equals('cooker')  }"> --%>
        <%--        		<%@ include file="cookerModule.jsp" %> --%>
        <%--        </c:when> --%>
        <%--        <c:when test="${rose.equals('cleaner')  }"> --%>
        <%--        		<%@ include file="cleanerModule.jsp" %> --%>
        <%--        </c:when> --%>
        <%--        </c:choose> --%>
    </div>
    <div style="height:45px; width:auto; background-color:#FF9; margin-top:20px">
        <table align="center" style="line-height:45px;">
            <tr>
                <td>
                    <a>技术支持@酒店运营管理信息系统 全国免费热线：020-375888631</a>
                </td>
            </tr>
        </table>

    </div>
</div>
</body>
</html>