<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<h2 align="center">房间信息登记</h2>
<form action="roomBooking" method="post">
    <table style="margin:auto; margin-top:50px">

        <tr class="main">
            <td class="ch">房间号码：</td>
            <td><input type="text" name="room.roomId" value="${room.roomId }"/></td>
        </tr>
        <tr class="main">
            <td class="ch">预定时间：</td>
            <td><input type="text" name="room.bookingTime"/></td>
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