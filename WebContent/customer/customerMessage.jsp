<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<h2 align="center">顾客信息登记</h2>

<form action="customerMessage" method="post">
    <table style="margin:auto; margin-top:50px">
        ${message }
        <tr class="main">
            <td class="ch">身份证号：</td>
            <td><input type="text" name="customer.ID" value="${customer.ID }"/></td>
        </tr>
        <tr class="main">
            <td class="ch">真实姓名：</td>
            <td><input type="text" name="customer.name" value="${customer.name }"/></td>
        </tr>
        <tr class="main">
            <td class="ch">真实年龄：</td>
            <td><input type="text" name="customer.age"/></td>
        </tr>
        <tr class="main">
            <td class="ch">
                手机号码：
            </td>
            <td>
                <input type="text" name="customer.phoneNumber"/>
            </td>
        </tr>
        <tr class="main">
            <td class="ch">籍贯地址：</td>
            <td><input type="text" name="customer.address"/></td>
        </tr>
        <tr>
            <td>
                <input type="radio" name="customer.sex" value="boy" style="margin-left:50px"/>男

            </td>
            <td><input type="radio" name="customer.sex" value="girl" style="margin-left:50px"/>女</td>
        </tr>
        <tr height="30px">
            <td>
                &nbsp;
            </td>
        </tr>
        <tr class="main" style="margin:20px">
            <td id="anniu1"><input type="reset" value="重置" style="margin-left:50px"/></td>
            <td id="anniu2"><input type="submit" value="注册" style="margin-left:50px"/></td>
        </tr>
    </table>
</form>