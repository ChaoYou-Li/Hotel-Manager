<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户主页</title>
</head>
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

<div class="_center_login" style="background-color:#F8F8F8; height:700px; width:800px; margin:auto;">

    <div style="margin:auto; 100px">
        <table style=" margin:auto">
            <tr>
                <td>
                    <h1>恭喜您！成功登录本系统</h1>
                </td>
            </tr>
        </table>
    </div>

    <div style="height:520px; width:auto; background-color:#FFFFFF; margin-left:15px; margin-right:15px; padding:15px; border-color:#0F9; border:2px; border:solid">
        <div style="height:40px; width:auto; background-color:#CC6; line-height:40px">
            <a style="font-size:18px; margin-left:20px">CUSTOMER CENTER 客户中心</a>
        </div>
        <hr/>
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
                                <a href="${pageContext.request.contextPath}/customer/customer.jsp?function=register">注册信息</a>

                            </td>
                        </tr>
                        <tr>
                            <td>
                                <a href="${pageContext.request.contextPath}/customer/customer.jsp?function=roomBooking">预订房间</a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <a href="${pageContext.request.contextPath}/customer/customer.jsp?function=emptyRoom">空房信息</a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <a href="${pageContext.request.contextPath}/customer/customer.jsp?function=menuBooking">预订餐饮</a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <a href="${pageContext.request.contextPath}/customer/customer.jsp?function=menuTable">餐饮列表</a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <a href="${pageContext.request.contextPath}/customer/customer.jsp?function=cleanRoom">房间清理</a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <a href="${pageContext.request.contextPath}/customer/customer.jsp?function=destroyRoom">注销房间</a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <a href="${pageContext.request.contextPath}/customer/customer.jsp?function=billMoney">消费账单</a>
                            </td>
                        </tr>

                    </table>

                </form>
            </div>

            <div>
                <p align="center">床前明月光</p>
                <p align="center">疑是地上霜</p>
                <p align="center">举头望明月</p>
                <p align="center">低头思酒窝</p>
            </div>
        </div>
        <div style="height:470px; width:550px; background-color:#F8F8F8; float:right">
            <c:set value="${param.function }" var="rose" property="rose"></c:set>

            <c:choose>
                <c:when test="${rose.equals('register') }">
                    <%@ include file="customerMessage.jsp" %>

                </c:when>
                <c:when test="${rose.equals('roomBooking')  }">
                    <%@ include file="roomBooking.jsp" %>
                </c:when>
                <c:when test="${rose.equals('emptyRoom')  }">


                    <%@ include file="emptyRoom.jsp" %>
                </c:when>
                <c:when test="${rose.equals('menuBooking')  }">
                    <%@ include file="menuBooking.jsp" %>
                </c:when>
                <c:when test="${rose.equals('menuTable')  }">
                    <%@ include file="menuTable.jsp" %>
                </c:when>
                <c:when test="${rose.equals('cleanRoom')  }">
                    <%@ include file="cleanRoom.jsp" %>
                </c:when>
                <c:when test="${rose.equals('destroyRoom')  }">
                    <%@ include file="destroyRoom.jsp" %>
                </c:when>
                <c:when test="${rose.equals('billMoney')  }">
                    <%@ include file="billMoney.jsp" %>
                </c:when>
            </c:choose>
        </div>
    </div>

    <div style="height:45px; width:auto; background-color:#FF9;">
        <table align="center" style="line-height:45px; margin-top:20px">
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