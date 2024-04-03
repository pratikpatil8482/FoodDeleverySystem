package food;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addfood")
public class AddFood extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FoodCrud crud = new FoodCrud();

		String name = req.getParameter("foodname");
		long price = Long.parseLong(req.getParameter("foodprice"));
		
		Food food = new Food();
		
		food.setName(name);
		food.setPrice(price);
		
		FoodCrud foodCrud=new FoodCrud();
		foodCrud.saveFood(food);

	}
}
