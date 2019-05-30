<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户注册</title>
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
                    <h1>欢迎来到注册页面</h1>
                </td>
            </tr>
        </table>
    </div>
    <div style="height:460px; width:auto; background:url(image/register.jpg)">
        <div style="height:280px; width:300px; background:none; margin-left:250px; float:left; ">
            <form action="register" method="post">
                <table style="margin:auto; margin-top:85px">
                    <tr class="main">
                        <td class="ch">用户名：</td>
                        <td><input type="text" name="user.cu_username" value="${user.cu_username }"/></td>
                    </tr>
                    <tr class="main">
                        <td class="ch">密码：</td>
                        <td><input type="password" name="user.cu_password"/></td>
                    </tr>
                    <tr class="main">
                        <td class="ch">确认密码：</td>
                        <td><input type="password" name="re_password"/></td>
                    </tr>
                    <tr class="main">
                        <td class="ch">
                            手机号：
                        </td>
                        <td>
                            <input type="text" name="user.cu_phoneNumber"/>
                        </td>
                    </tr>
                    <tr class="main">
                        <td class="ch">邮箱：</td>
                        <td><input type="text" name="user.cu_email" value="${user.cu_email }"/></td>
                    </tr>
                    <tr class="main" style="margin:20px">
                        <td id="anniu1"><input type="reset" value="重置"/></td>
                        <td id="anniu2">
                            <input type="submit" value="注册"/>
                            <a href="${pageContext.request.contextPath}/login/login.jsp?rose=not"
                               style="float:right; margin-top:auto">返回登录</a>
                        </td>

                    </tr>
                </table>
            </form>
        </div>
        <div style="height:195px; width:250px; background:none; float:right; padding-top:85px">

            <!-- 显示验证错误信息 -->

            <s:fielderror cssStyle="color:red"/>
            <font color="red"><s:property value="message"/></font><br>
        </div>
    </div>
    <div style="height:45px; width:auto; background-color:#FF9;">
        <table align="center" style="line-height:45px; margin-top:50px">
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