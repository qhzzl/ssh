<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:if test="#request.empList == null || #request.empList.empty">
		<h1>没有员工</h1>
	</s:if>
	<s:else>
		<center>
			<table border="1">
				<tr>
					<th>员工编号<th>
					<th>员工姓名<th>
					<th>部门名称<th>
					<th>修改<th>
					<th>删除<th>
				<tr>
				<s:iterator value="#request.empList">
					<tr>
						<td><s:property value="[0].empId"/><td>
						<td><s:property value="[0].name"/><td>
						<td><s:property value="dept.deptName"/><td>
						<td><s:a href="editEmp.action?empId=%{empId}">修改</s:a><td>
						<td><s:a href="deleteEmp.action?empId=%{empId}">删除</s:a><td>
					<tr>
				</s:iterator>
			</table>
		</center>
	</s:else>
	<br>
	<center><a href="${pageContext.request.contextPath }/toAddEmp.action">添加</a></center>
	
</body>
</html>