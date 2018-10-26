<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-3.0.0.js"></script>
</head>
<body>

    ${doctor.doctorName} 欢迎您
	<form>
		选择药品<select id="se">
			<!-- <option value="1">阿莫西宁---111</option>
			<option value="2">快克---22</option>
			<option value="3">神仙水---33</option> -->
		</select> 输入数量<input type="text" id="num" /> <input type="button" value="确认数量"
			id="in" />
		<hr />

		<input type="button" value="确认提交" id="su" />
	</form>

	<table>
		<tr id="th">

			<th>药品id</th>
			<th>药品数量</th>
		</tr>

		<tbody>


		</tbody>
	</table>
	<script>
		/* 页面加载的时候执行 */
		$(function() {
			$.ajax({
				type : 'get',
				url : '/drug/DrugServlet',
				dataType : 'json',
				success : function(result) {
						console.log(result);
					$.each(result.data,function(i,obj){
						$option=$("<option>");
						$option.val(obj.id);
						$option.text(obj.drugName+"===="+obj.drugNum);
						$option.appendTo($("#se"));
					})	
				},
				error : function() {
					alert("查询药品失败");
				}

			})

			$("#in").click(function() {
				var did = $("#se").val();
				var dnum = $("#num").val();
				var $tr = $("<tr>");
				var $td = $("<td>");
				var $td1 = $("<td>");
				$td.text(did);
				$td1.text(dnum);
				$tr.append($td).append($td1).appendTo($("table"));

			})

			$("#su").click(function() {

				var $trs = $("#th").siblings();
				var drugDes = [];
				$.each($trs, function(index, e) {
					var $tds = $(e).children();
					var drugDe = {};
					drugDe.drugId = Number($tds[0].innerHTML);
					drugDe.drugNum = Number($tds[1].innerHTML);
					drugDes[index] = drugDe;
				})
				console.info(drugDes);
				addAdvice(drugDes)
			})
		})

		function addAdvice(drugDes) {
			$.ajax({
				type : 'get',
				url : '/drug/AdviceServlet',
				dataType : 'json',
				data:{json:JSON.stringify(drugDes)}, 
				success : function(result) {
					console.log(result);
					if(result.status==200){
						alert("添加成功");
					}
					if(result.status==400){
						alert(result.msg);
					}

				},
				error : function() {
					alert("添加医嘱失败");
				}
			})

		}
	</script>
</body>
</html>
