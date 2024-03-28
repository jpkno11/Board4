<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib  prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="icon" type="image/png" href="/img/favicon.png" />
<link rel="stylesheet"  href="/css/common.css" />
<script src="https://cdn.jsdelivr.net/npm/browser-scss@1.0.3/dist/browser-scss.min.js"></script>
</head>
<body>
   <main>
   <h2> 메뉴목록(수정2)</h2>
   <table>
   <tr>
   <td>menu_id</td>
   <td>menu_name</td>
   <td>menu_seq</td>
   <td>삭제</td>
   <td>수정</td>
   </tr>
   <tr>
   <td colspan= "5">
   [<a href= "/Menus/WriteForm">메뉴 등록</a>]&nbsp;&nbsp;&nbsp;
  [<a href="/Menus/WriteForm2">메뉴등록2</a>]
  </td>
  </tr>
  <c:forEach var= "MenuVo" items= "${menuList }">
  
  <tr>
     <td>${menuVo.menu_id }</td>
     <td>${menuVo.menu_name }</td>
     <td>${menuVo.menu_seq }</td>
     <td><a href="/Menus/Delete?menu_id${menuVo.menu_id }">삭제</a></td>
     <td><a href="/Menus/UpdateForm?menu_id${menuVo.menu_id }">수정</a></td>
     </tr>
     </c:forEach>
     
   
   </table>
   </main>
</body>
</html>