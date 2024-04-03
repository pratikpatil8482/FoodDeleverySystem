package admin;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Ragister extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Admin admin = new Admin();
		admin.setNo(Long.parseLong(req.getParameter("mo")));
		admin.setPass(req.getParameter("pass"));
		
		AdminCrud adminCrud = new AdminCrud();
		try {
			adminCrud.saveAdmin(admin);
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
