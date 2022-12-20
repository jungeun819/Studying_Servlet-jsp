<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String mainMenu = request.getParameter("mainMenu");
	String sideMenu = request.getParameter("sideMenu");
	String drinkMenu = request.getParameter("drinkMenu");
	
	System.out.println("main@jsp : " + mainMenu);
	System.out.println("side@jsp : " + sideMenu);
	System.out.println("drink@jsp : " + drinkMenu);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문 결과 페이지</title>
<style>
span#mainMenu {
    color: navy;
    font-size: 2em;
}

span#sideMenu {
    color: indigo;
    font-size: 1.5em;
}

span#drinkMenu {
    color: yellowgreen;
}

span#price {
    color: maroon;
    font-size: 2.5em;
}
</style>
</head>
<body>
    <h2>감사합니다.</h2>
    <span id="mainMenu">메인메뉴 : <%= mainMenu %></span>,
    <span id="sideMenu"><%= sideMenu %></span>,
    <span id="drinkMenu"><%= drinkMenu %></span>을/를 주문하셨습니다.
</body>
</html>