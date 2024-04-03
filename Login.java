package admin;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		long mo = Long.parseLong(req.getParameter("mo"));
		String pass = req.getParameter("pass");

		AdminCrud adminCrud = new AdminCrud();
		try {
			if (adminCrud.login(mo, pass)) {
				//Success Page 
				req.setAttribute("name", mo);
				req.getRequestDispatcher("Success.jsp").forward(req, resp);
				System.out.println("Login Success");
			} else {
				req.getRequestDispatcher("register.jsp").forward(req, resp);
				System.out.println("Login Unsucces");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
