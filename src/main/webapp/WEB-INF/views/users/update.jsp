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
<h2>사용자 수정</h2>
<form aciton = "/Uswers/Update" method= "POST">
<table>
<tr>
<td>아이디</td>
<td><input type = "text" name="useid" value="${vo.userid }" readonly/></td>
</tr>
<tr>
<td>아이디</td>
<td><input type="text"   name="userid" value="${vo.userid }" readonly/></td>
</tr>
<tr>
<td>비밀번호</td>
<td><input type="password" name="passwd" value="${vo.passwd }"/></td>
</tr>

<tr>
<td>이름</td>
<td><input type="text" name="username" value="${vo.username }"/></td>
</tr>
<tr>
	   <td>이메일</td>
	   <td><input type="text" name="email" value="${ vo.email }" /></td>
	 </tr>
	 
	 
	 <tr>
	   <td>포인트</td>
	   <td><input type="text" name="upoint" value="${ vo.upoint }" /></td>
	   </tr>
	   <tr>
	   <td>가입일</td>
	   <td><input type="text"  value="${ now }"readonly /></td>
	 </tr>
	 <tr>
	 <td colspan ="2">
	 <input type= "submit" value="수정"/>
	 <input type= "button" value="목록"id="goList"/>
     </td>
     </tr>
     </table>
     </form>
  </main>
     <script>
     const goListEl = document.getElemenbYId('goList');
     goListEl.addEventListener('click',fucntuon(e){
    	 
     })
     
     </script>

</body>
</html>