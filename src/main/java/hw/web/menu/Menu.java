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
		
		// 2. 응답처리 - jsp에 위임
		RequestDispatcher reqDispacher = request.getRequestDispatcher("/servlet/menuOrder.jsp");
		reqDispacher.forward(request, response);
	}
}
