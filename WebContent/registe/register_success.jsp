<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录成功页面</title>
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

<div class="_center_login" style="background-color:#F8F8F8; height:620px; width:800px; margin:auto;">

    <div style="margin:auto; 100px">
        <table style=" margin:auto">
            <tr>
                <td>
                    <h1>恭喜您，账号注册成功！</h1>
                </td>
            </tr>
        </table>
    </div>
    <div style="height:250px; width:250px; margin:auto; padding:50px ">
        <p>账号信息</p>
        <p>用户名：${user.cu_username }</p>
        <p>密&nbsp;&nbsp;&nbsp;&nbsp;码：${user.cu_password }</p>
        <div style=" margin-top:100px; height:20px; width:auto">
            <div style="height:auto; width:80px; float:left">
                <a href="${pageContext.request.contextPath}/registe/register.jsp">返回注册</a>
            </div>
            <div style="float:right">
                <a href="#${pageContext.request.contextPath}/login/login.jsp">返回登录</a>
            </div>
        </div>
    </div>


    <div style="height:45px; width:auto; background-color:#FF9; margin-top:160px;">
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