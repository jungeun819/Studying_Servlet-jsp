package hw.web.menu;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Menu extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 0. 요청데이터 인코딩설정 (POST)
		request.setCharacterEncoding("utf-8");
		
		// 1. 사용자입력값 확인
		String mainMenu = request.getParameter("mainMenu");
		String sideMenu = request.getParameter("sideMenu");
		String drinkMenu = request.getParameter("drinkMenu");
		
		// 2. 업무로직
		int price = 0;
		switch (mainMenu) {
		case "한우버거": price = 5000; break;
		case "밥버거": price = 4500; break;
		case "치즈버거": price = 4000; break;
		}
		
		switch(sideMenu) {
		case "감자튀김" : price += 1500; break;
		case "어니언링" : price += 1700; break;
		}
		
		switch(drinkMenu) {
		case "콜라" : 
		case "사이다" : price += 1000; break;
		case "커피" : price += 1500; break;
		case "밀크쉐이크" : price += 2500; break;
		}
		System.out.println("price = " + price);
		
		// jsp에 값전달
		request.setAttribute("price", price);
		
		// 3. 응답처리 - jsp에 위임
		RequestDispatcher reqDispacher = request.getRequestDispatcher("/servlet/menuOrder.jsp");
		reqDispacher.forward(request, response);
	}
}
