<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<h2 align="center">员工信息变更</h2>

<form action="updateEmployee" method="post">
    <table style="margin:auto; margin-top:50px">

        <tr class="main">
            <td class="ch">员工证号：</td>
            <td><input type="text" name="employee.id" value="${employee.id }"/></td>
        </tr>
        <tr class="main">
            <td class="ch">员工姓名：</td>
            <td><input type="text" name="employee.name" value="${employee.name }"/></td>
        </tr>
        <tr class="main">
            <td class="ch">员工年龄：</td>
            <td><input type="text" name="employee.age"/></td>
        </tr>
        <tr class="main">
            <td class="ch">员工职位：</td>
            <td><input type="text" name="employee.position"/></td>
        </tr>
        <tr>
            <td>
                <input type="radio" name="employee.sex" value="boy" style="margin-left:50px"/>男

            </td>
            <td><input type="radio" name="employee.sex" value="girl" style="margin-left:50px"/>女</td>
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