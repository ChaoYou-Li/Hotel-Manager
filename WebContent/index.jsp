<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>首页</title>
</head>
<style type="text/css">
    ._divMenu {
        margin: 15px;
        text-align: center;
        width: auto;
        border-top-width: 4px;
        border-top-style: solid;
        border-top-color: #82B211;
        background: #1C3F09;
        padding: 10px 0px 10px 0px;
        font-size: 14px;
    }

    ._divMenu a {
        font-size: 14px;
        color: #FFFFFF;
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
        </tr>
    </table>
</div>
<div style="height:650px; width:800px; background-color:#CCC; margin:auto;">
    <!-- 首页顶部 -->
    <div class="_divHead" style="padding:15px">
        <table class="_tableHead">
            <tr>
                <div style="float:left; margin-left:30px;">
                    <a href="${pageContext.request.contextPath}/login/login.jsp?rose=not">登录</a>
                    | <a href="${pageContext.request.contextPath}/registe/register.jsp">免费注册</a>
                </div>
                <div style=" float:right; margin-right:30px">
                    <a href="#">业务浏览</a>
                    | <a href="#">客服中心</a>
                </div>

            </tr>
        </table>
    </div>

    <!-- 首页菜单列表 -->
    <div class="_divMenu">
        <a href="#">about</a>
        <a href="#">feature</a>
        <a href="#">members</a>
        <a href="#">connect</a>
        <a href="#">dream</a>
        <a href="#">start</a>
    </div>

    <div style="height:500px; width:770px; background:#0C6; margin:15px;">
        <img src="image/index.jpg" style="height:500px; width:770px"/>
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