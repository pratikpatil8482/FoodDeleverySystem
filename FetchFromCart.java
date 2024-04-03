package cart;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fetchfromcart")
public class FetchFromCart extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		CartCrud crud = new CartCrud();
		List<Cart>list=crud.fetchCart();
		
		if (!(list.isEmpty())) {
			//resp.getWriter().write(list.toString());
			req.setAttribute("product", list);
			req.getRequestDispatcher("FetchFromCart.jsp").include(req, resp);;
			System.out.println(list);
		} else {
			System.err.println("Cart is Empty");
		}

	}
}
