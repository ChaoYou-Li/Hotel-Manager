<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录页面</title>
</head>
<style type="text/css">
    .main {
        margin: 20px;
    }

    .ch {
        width: 80px;
        float: left;
        text-align: right;
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
                <a href="${pageContext.request.contextPath}/index.jsp">返回首页</a>
            </div>

        </tr>
    </table>
</div>

<div class="_center_login" style="background-color:#F8F8F8; height:730px; width:800px; margin:auto;">

    <div style="margin:auto; 100px">
        <table style=" margin:auto">
            <tr>
                <td>
                    <h1>欢迎来到登录页面</h1>
                </td>
            </tr>
        </table>
    </div>

    <div style="padding:15px; height:570px; width:auto">

        <div style="height:300px; width:auto">
            <div style="height:280px; width:58%; float:left; background-color:#FFFFFF; padding:10px">
                <div style="height:40px; width:auto; background-color:#CC6; line-height:40px">
                    <a style="font-size:18px; margin-left:20px">CONTACT US 联系我们</a>
                </div>
                <div style="height:210px; width:auto; padding:15px">
                    <div style="height:180px; width:130px; float:left">
                        <img src="${pageContext.request.contextPath}/image/girl_phone.jpg" width="130px"
                             height="180px"/>
                    </div>
                    <div style="height:180px; width:67%; float:right">
                        <p style="font-size:14px; font-weight:bold">免费电话：020-375888631</p>
                        <p style="font-size:14px; font-weight:bold">服务 QQ：54634816</p>
                        <p style="font-size:14px; font-weight:bold">传 真：0415-3254165</p>

                        <p style="font-size:14px; font-weight:bold">邮政编码：251350</p>

                        <p style="font-size:14px; font-weight:bold">酒店地址：中山大学新华学院东莞校区</p>

                    </div>
                </div>
            </div>
            <c:set value="${param.rose }" var="rose" property="rose"></c:set>
            <c:choose>
                <c:when test="${rose.equals('not') }">
                    <%@ include file="notLogin.jsp" %>
                </c:when>
                <c:when test="${rose.equals('employee') }">
                    <%@ include file="employeeLogin.jsp" %>

                </c:when>
                <c:when test="${rose.equals('customer')  }">
                    <%@ include file="customerLogin.jsp" %>
                </c:when>
            </c:choose>
        </div>

        <div style="height:230px; width:auto; background-color:#F2F2F2; margin-top:15px; padding:10px">
            <div style="height:40px; width:auto; background-color:#CC6; line-height:40px">
                <a style="font-size:18px; margin-left:20px">DISCOVER MESSAGE 发现资讯</a>
            </div>
            <div>
                <table>
                    <tr>
                        <td>
                            <p>好消息！好消息！好消息！</p>
                            <ul>
                                <li>[2018-11-18]本酒店将推出部分订购餐饮打6.8折！你还在等什么？赶紧来预订吧。</li>
                                <li>[2018-10-01]本酒店将于近日起为响应国庆黄金周各大顾客订房需要，将推出更多客房套餐供各大旅客选择！</li>
                                <li>[2018-09-23]本酒店将于国家传统节日--中秋节推出团圆聚餐多种餐点订购项目，敬请关注。</li>
                                <li>[2018-09-01]本酒店将为了迎接18届新生的开学典礼聚餐活动套餐，优惠多多，服务优质。</li>
                                <li>[2018-08-15]本酒店欢迎各位暑期旅游的顾客朋友们到此住宿，我们将诚挚于您。</li>
                            </ul>


                        </td>
                    </tr>
                </table>
            </div>
        </div>

    </div>
    <div style="height:45px; width:auto; background-color:#FF9;">
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