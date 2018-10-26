<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% request.setAttribute("name","request");
    session.setAttribute("name", "session");
    application.setAttribute("name","pageContext");
    pageContext.setAttribute("user","zhangsan",PageContext.REQUEST_SCOPE);%>
</body>
</html>