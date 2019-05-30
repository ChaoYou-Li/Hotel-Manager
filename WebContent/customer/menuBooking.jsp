<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<h2 align="center">餐饮信息登记</h2>
<form action="menuBooking" method="post">
    <table style="margin:auto; margin-top:50px">
        <tr class="main">
            <td class="ch">餐饮号码：</td>
            <td><input type="text" name="menu.m_id"/></td>
        </tr>
        <tr class="main">
            <td class="ch">餐饮名字：</td>
            <td><input type="text" name="menu.m_name"/></td>
        </tr>
        <tr class="main">
            <td class="ch">订餐数量：</td>
            <td><input type="text" name="menu.m_number"/></td>
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