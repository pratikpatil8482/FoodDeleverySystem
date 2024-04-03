package custemer;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.Admin;
import admin.AdminCrud;

@WebServlet("/custmerregister")
public class CustmerRegister extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Custemer custemer = new Custemer();
		custemer.setNo(Long.parseLong(req.getParameter("mo")));
		custemer.setPass(req.getParameter("pass"));

		CustemerCrud crud = new CustemerCrud();
		try {
			crud.saveAdmin(custemer);
			req.getRequestDispatcher("Clogin.jsp").forward(req, resp);;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
