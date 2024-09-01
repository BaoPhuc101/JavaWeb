package vn.iotstar.controllers;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet{
	private static final long serialVersionUID = 1311043L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String site = new String("login.jsp");
		resp.sendRedirect(site);
		RequestDispatcher rd = req.getRequestDispatcher(site);
		rd.include(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String name = req.getParameter("uname");
		String pass = req.getParameter("psw");
		
		req.setAttribute("username", name);
		req.setAttribute("password", pass);
		
		RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
		rd.forward(req, resp);
	}
}
