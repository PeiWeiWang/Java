<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<button onclick="run()">运行</button>

	<span id="s"></span>

	<script type="text/javascript">
		function run() {
			var xhr = createXMLHttpRequest();
			/* 与服务器创建连接  true默认代表异步请求 */
			xhr.open("GET", "/day08/AjaxServletDemo1?username=zhangsan", true);
			/* 发送请求   post请求提交的参数*/
			xhr.send(null);
			/* 监听状态 */
			/* 
			        readyState状态码：
					0：未初始化
					1：正在加载
					2：加载完成
					3：请求进行中
					4：请求完成
			 */

			xhr.onreadystatechange = function() {
				if (xhr.readyState == 0) {
					alert("未初始化")
				}

				if (xhr.readyState == 1) {
					alert("正在加载")
				}

				if (xhr.readyState == 2) {
					alert("加载完成")
				}

				if (xhr.readyState == 3) {
					alert("请求进行中")
				}

				if (xhr.readyState == 4 && xhr.status == 200) {
					alert("请求完成");
					var text = xhr.responseText;
					alert(text);
					document.getElementById("s").innerHTML = text;

				}

			}

		}

		/* 获取XMLHttpRequest对象 */
		function createXMLHttpRequest() {

			try {
				/* 非IE内核 */
				return new XMLHttpRequest();
			} catch (e) {
				/* IE内核 */
				/* ie6.0及以上 */
				try {
					return new ActiveXOject("Msxml2.XMLHTTP");

				} catch (e) {
					/* ie6.0以下 */
					try {

						return new ActiveXOject("Microsoft.XMLHTTP");
					} catch (e) {
						throw e

					}

				}

			}

		}
	</script>
</body>
</html>