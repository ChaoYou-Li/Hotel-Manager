<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<h2 align="center">清理房间信息登记</h2>
<form action="" method="post">
    <table style="margin:auto; margin-top:50px">

        <tr class="main">
            <td class="ch">清理房号：</td>
            <td><input type="text" name="room.roomId" value="${room.roomId }"/></td>
        </tr>
        <tr class="main">
            <td class="ch">清理方式：</td>
            <td>
                <select neme="clean">
                    <option selected="selected">请您选择</option>
                    <option value="1">干洗衣服</option>
                    <option value="2">无水拖地</option>
                    <option value="3">桌案整理</option>
                    <option value="4">被褥叠放</option>
                </select>
            </td>
        </tr>
        <tr class="main">
            <td class="ch">选择时间：</td>
            <td>
                <select name="price">
                    <option selected="selected">请您选择</option>
                    <option value="1">早上</option>
                    <option value="2">中午</option>
                    <option value="3">傍晚</option>
                    <option value="4">午夜</option>
                </select>
            </td>
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