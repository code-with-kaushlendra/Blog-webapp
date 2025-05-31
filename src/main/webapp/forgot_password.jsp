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
 }
body{
background:url('images/reg.jpg');
}
</style>
</head>

<body>
<form action="forgotpassword" method="post" class="forgot">
<label>Enter Your Registered Email </label>
<input type="email" name="email1" placeholder="Enter Email" required/>
<button type="submit">Reset Password</button>
</form>

</body>
</html>