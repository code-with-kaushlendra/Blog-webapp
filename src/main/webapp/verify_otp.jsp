<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Enter Reset Code</h2>
<form action="VerifyCodeServlet" method="post">
    <input type="text" name="code" placeholder="Enter code" required />
    <button type="submit">Verify</button>
</form>

</body>
</html>