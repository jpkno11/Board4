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
 <h2>메뉴수정</h2>
 <form action= "/Menus/Update" method= "GET">
 <table>
 <tr>
 <td>메뉴 아이디</td>
 <td><input type = "text" name= "menu_id" value="${menu.menu_id }" readonly/></td>
 </tr>
 <tr>
 <td>메뉴 이름</td>
 <td><input type = "text" name= "menu_name" value="${menu.menu_name }" readonly/></td>
 </tr>
 <tr>
  <td>메뉴 순서</td>
 <td><input type = "number" name= "menu_seq" value="${menu.menu_seq }" readonly/></td>
	</tr>
	<tr>
 <td colspan="2">
  <input type="submit" value="수정"/>
  <input type="button" value="목록"id="goList"/>
 </td>
 </tr>
 </table>
 
 </form>

</main>
<script>
 const goListEl = document.getElemetnById('goList');
 goListEl.addEventLister('click',fuction(e){
	 location.href= '/Menus/List';
 })

</script>
</body>
</html>