<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
form{
width:300px;
margin:40px auto;
padding:25px;
display:flex;
flex-direction:column;
 background:#f9f9f9;
 gap:15px;
 align-items:center;

}


body{
background:url('images/reg.jpg');

}



</style>
</head>
<body>

<h2 style='text-align:center'>Reset Your Password</h2>
<form action="ResetPassword" method="post" class="resetbox">
    <input type="email" name="email1" placeholder="Your Email" required />
  <%--   <input type="password" name="confirmPassword" placeholder="Confirm Password" required /> --%>
    <button type="submit">Verify Email</button>
</form>


</body>
</html>