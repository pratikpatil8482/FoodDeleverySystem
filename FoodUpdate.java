package food;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updatefood")
public class FoodUpdate extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FoodCrud crud = new FoodCrud();

		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("foodname");
		long price = Long.parseLong(req.getParameter("foodprice"));

		Food food = new Food();

		food.setName(name);
		food.setPrice(price);

		FoodCrud foodCrud = new FoodCrud();
		foodCrud.updateFood(id, food);

	}
}