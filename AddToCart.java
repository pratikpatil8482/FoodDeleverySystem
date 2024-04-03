package cart;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import food.Food;
import food.FoodCrud;

@WebServlet("/addtocart")
public class AddToCart extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CartCrud crud=new CartCrud();
		Cart cart=new Cart();
		//int qnt = Integer.parseInt(req.getParameter("qnt"));
		String name=req.getParameter("name");
		double price=Double.parseDouble(req.getParameter("price"));
		int qnt=1;
		cart.setName(name);
		cart.setQnt(qnt);
		cart.setPrice(price*qnt);
		crud.addToCart(cart);

	}
}
