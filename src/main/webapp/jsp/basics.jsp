<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>option</title>
<style>
	table, th, td {
       border: 1px solid black;
       border-collapse: collapse;
       padding: 10px;
    }
    th {
    	background: lightgray;
    }
</style>
</head>
<body>
	<h1>주문내역</h1>
	
<%
	String no = request.getParameter("no");
	String prod = request.getParameter("prod");
	String[] option = request.getParameterValues("option");
	
	System.out.println(no);
	System.out.println(prod);
	System.out.println(Arrays.toString(option));
%>
	<table>
		<tr>
			<th>주문번호</th>
			<td><%= no %></td>		
		</tr>
		<tr>
			<th>상품명</th>
			<td><%= prod %></td>
		</tr>
<%
	for(int i = 0; i < option.length; i++) {
%>
		<tr>
			<th>옵션<%= i + 1 %></th>
			<td><%= option[i] %></td>
		<tr>
<%			
		}
%>
	</table>

</body>
</html>