package vn.iotstar.controllers;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vn.iotstar.models.UserModel;
import vn.iotstar.services.IUserService;
import vn.iotstar.services.impl.UserService;
import vn.iotstar.utils.Constant;

@WebServlet(urlPatterns = { "/login" })
public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1311L;

	// Lấy toàn bộ hàm trong services
	IUserService service = new UserService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		// Lấy tham số từ views
		String username = req.getParameter("uname");
		String password = req.getParameter("psw");
		boolean isRememberMe = false;
		String remember = req.getParameter("remember");
		
		// Kiểm tra tham số
		if ("on".equals(remember)) {
			isRememberMe = true;
		}
		String alertMsg = "";

		if (username.isEmpty() || password.isEmpty()) {
			alertMsg = "Tài khoản hoặc mật khẩu không được rỗng";
			req.setAttribute("alert", alertMsg);
			req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
			return;
		}
		
		// Xử lý bài toán
		UserModel user = service.login(username, password);
		if(user!=null){
			HttpSession session = req.getSession(true);
			session.setAttribute("account", user);
			if(isRememberMe){
				saveRememberMe(resp, username);
			}
		 resp.sendRedirect(req.getContextPath() + "/waiting");
		 }else{
			 alertMsg = "Tài khoản hoặc mật khẩu không đúng";
			 req.setAttribute("alert", alertMsg);
			 req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
		 }
	}
		
	private void saveRememberMe(HttpServletResponse response, String username){
		Cookie cookie = new Cookie(Constant.COOKIE_REMEMBER, username);
		cookie.setMaxAge(30*60);
		response.addCookie(cookie);
	}
}
