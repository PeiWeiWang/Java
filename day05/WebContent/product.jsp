<%@page import="com.cookie.CookieUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>购物商城</h1>
<img alt="" src="/day05/img05/1.jpg"><a href="/day05/ProductServlet?id=1">手电筒</a>
<img alt="" src="/day05/img05/2.jpg"><a href="/day05/ProductServlet?id=2">手机</a>
<img alt="" src="/day05/img05/3.jpg"><a href="/day05/ProductServlet?id=3">电视</a>
<img alt="" src="/day05/img05/4.jpg"><a href="/day05/ProductServlet?id=4">冰箱</a>
<img alt="" src="/day05/img05/5.jpg"><a href="/day05/ProductServlet?id=5">手表</a>
<img alt="" src="/day05/img05/6.jpg"><a href="/day05/ProductServlet?id=6">笔记本</a>
<h1>访问记录</h1>
<%
    Cookie[] cookies = request.getCookies();
    Cookie cookie = CookieUtil.getCookieByName(cookies, "product");
    if(cookie!= null){
    String[] ids = cookie.getValue().split("#");
    	for(String id: ids){
    		%>
    		<img alt=""src="/day05/img05/<%=id%>.jpg">
    		<%
    		}
    		}
    		%>
</body>
</html>