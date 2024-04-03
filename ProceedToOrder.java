package orders;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cart.Cart;
import cart.CartCrud;

@WebServlet("/proceedtoorder")
public class ProceedToOrder extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Orders orders=new Orders();
		OrdersCrud ordersCrud = new OrdersCrud();
		// int id=Integer.parseInt(req.getParameter("id"));
		
		String name=req.getParameter("name");
		double price=Double.parseDouble(req.getParameter("price"));
		orders.setName(name);
		orders.setQnt(1);
		orders.setPrice(price*1);
		ordersCrud.addToOrder(orders);

	}
}
