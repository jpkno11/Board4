<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="icon" type="image/png" href="/img/favicon.png" />
<link rel="stylesheet"  href="/css/common.css" />
</head>
<body>
<main>
<h2>메뉴 등록</h2>
<form action= "/Menus/Write2" method= "GET">
<table>
 <tr>
 <td>메뉴 이름</td>
 <td><input type="text" name="menu_name"/></td>
 </tr>
 <tr>
 <td colspan="2">
 <input type= "submit" value="추가"/>
 <input type= "button" value="목록" id="goList"/>
 </td>
 </tr>
</table>




</form>
</main>
</body>
</html>