package orders;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cart.Cart;
import cart.CartCrud;

@WebServlet("/fetchfromorders")
public class FetchOders extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	OrdersCrud crud = new OrdersCrud();
		List<Orders>list=crud.fetchOrder();
		
		if (!(list.isEmpty())) {
			//resp.getWriter().write(list.toString());
			//System.out.println(list);
			req.setAttribute("order", list);
			req.getRequestDispatcher("fetchorder.jsp").include(req, resp);
		} else {
			System.err.println("Cart is Emty");
		}

	}
}
