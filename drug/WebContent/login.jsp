<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="#" method="post" id="frm">

		用户名：<input type="text" name="doctorName"> 密码：<input
			type="text" name="password"> <input type="button" value="提交"
			onclick="login()">
	</form>

	<script type="text/javascript" src="/drug/js/jquery-3.0.0.js"></script>

	<script type="text/javascript">
		function login() {
			$.ajax({
				type : 'post',
				url : '/drug/LoginServlet',
				data : $("#frm").serialize(),
				dataType : 'json',
				success : function(result) {
					if (result.status == 200) {
						alert(result.msg);
						location.href = "/drug/demo.jsp";
					}
					if (result.status == 400) {
						alert(result.msg);
						location.href = "/drug/login.jsp";
					}

				},
				error : function() {
					alert("登录失败");
				}

			})
		}
	</script>
</body>
</html>