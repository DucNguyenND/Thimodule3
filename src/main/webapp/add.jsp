<%--
  Created by IntelliJ IDEA.
  User: DucNguyen
  Date: 7/11/2022
  Time: 11:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: DucNguyen
  Date: 7/11/2022
  Time: 10:43 AM
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Nhập thông tin cần sửa</h2>
<form action="/qlnv?action=add" method="post">
    <input type="number" name="idnv" placeholder="ID NV">
    <input type="text" name="namenv" placeholder="Tên NV">
    <input type="date" name="birthday" placeholder="Birthday">
    <input type="text" name="address" placeholder="Địa chỉ">
    <input type="text" name="phone" placeholder="SĐT">
    <input type="text" name="email" placeholder=" Email">
    <input type="number" name="idphongban" placeholder="id phòng ban">
    <button type="submit">Submit</button>


</form>
</body>
</html>
