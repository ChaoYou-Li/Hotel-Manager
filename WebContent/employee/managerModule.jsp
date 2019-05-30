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
            <a href="${pageContext.request.contextPath}/employee/employee.jsp?rose=manager">经理</a>
            <a href="${pageContext.request.contextPath}/employee/employee.jsp?rose=front">前台</a>
            <a href="${pageContext.request.contextPath}/employee/employee.jsp?rose=cooker">厨师</a>
            <a href="${pageContext.request.contextPath}/employee/employee.jsp?rose=cleaner">保洁</a>
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


        <!-- 管理员模块 -->
        <div style="height:470px; width:auto;">
            <div style="height:450px; width:130px; background-color:#F8F8F8; padding:10px; float:left">
                <table>
                    <tr>
                        <td>
                            <b>我的操作</b>
                        </td>
                    </tr>

                </table>
                <div style="height:250px; width:120px; float:right;  margin-top:10px">
                    <form action="#" method="post">
                        <table>
                            <tr>
                                <td>
                                    <a href="${pageContext.request.contextPath}/employee/employee.jsp?function=add">员工招聘</a>

                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <a href="${pageContext.request.contextPath}/employee/employee.jsp?function=delete">员工辞退</a>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <a href="${pageContext.request.contextPath}/employee/employee.jsp?function=select">查看员工</a>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <a href="${pageContext.request.contextPath}/employee/employee.jsp?function=update">信息变更</a>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <a href="${pageContext.request.contextPath}/employee/employee.jsp?function=money">收入账单</a>
                                </td>
                            </tr>


                        </table>

                    </form>
                </div>

                <div>
                    <p align="center">春眠不觉晓</p>
                    <p align="center">处处闻啼鸟</p>
                    <p align="center">夜来风雨声</p>
                    <p align="center">花落知多少</p>
                </div>
            </div>
            <!-- 具体操作实现区 -->
            <div style="height:470px; width:550px; background-color:#F8F8F8; float:right">

                <c:set value="${param.function }" var="function" property="function"></c:set>
                <c:choose>
                    <c:when test="${function.equals('add') }">
                        <%@ include file="add.jsp" %>
                    </c:when>
                    <c:when test="${function.equals('delete')  }">
                        <%@ include file="delete.jsp" %>
                    </c:when>
                    <c:when test="${function.equals('update')  }">
                        <%@ include file="update.jsp" %>
                    </c:when>
                    <c:when test="${function.equals('select')  }">
                        <%@ include file="select.jsp" %>
                    </c:when>
                    <c:when test="${function.equals('money')  }">
                        <%@ include file="money.jsp" %>
                    </c:when>
                </c:choose>
            </div>
        </div>


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
   
   
   
   
