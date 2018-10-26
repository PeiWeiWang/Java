
<%@page import="java.util.Set"%>
<%@page import="javax.websocket.Session"%>
<%@page import="java.util.Map"%>
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
<img alt="" src="/day06/img05/1.jpg"><a href="/day06/CartServlet?id=1">手电筒</a>
<img alt="" src="/day06/img05/2.jpg"><a href="/day06/CartServlet?id=2">手机</a>
<img alt="" src="/day06/img05/3.jpg"><a href="/day06/CartServlet?id=3">电视</a>
<img alt="" src="/day06/img05/4.jpg"><a href="/day06/CartServlet?id=4">冰箱</a>
<img alt="" src="/day06/img05/5.jpg"><a href="/day06/CartServlet?id=5">手表</a>
<img alt="" src="/day06/img05/6.jpg"><a href="/day06/CartServlet?id=6">笔记本</a>
<h1>访问记录</h1>
<%
Map<String,Integer> cart = (Map<String,Integer>) session.getAttribute("cart");
 if(cart!=null) {
	Set<String> keys=cart.keySet();
	for(String key:keys){
		%>
		<h3>购买了<%=key  %><%=cart.get(key) %>件</h3>
		<% 
	}
}
    		%>
</body>
</html>