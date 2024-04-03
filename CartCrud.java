package cart;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import food.Food;

public class CartCrud {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pratik");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void addToCart(Cart cart) {
		entityTransaction.begin();
		entityManager.persist(cart);
		entityTransaction.commit();
	}

	public void updateCart(int id, Cart cart) {
		Cart cartdb = entityManager.find(Cart.class, id);

		if (cartdb != null) {
			entityTransaction.begin();
			cart.setId(cartdb.getId());
			;
			entityManager.merge(cart);
			entityTransaction.commit();
			System.out.println("Update Success");
		} else {
			System.out.println("No Food In db");
		}
	}

	public void removeFromCart(int id) {
		Cart cartdb = entityManager.find(Cart.class, id);
		if (cartdb != null) {
			entityTransaction.begin();
			entityManager.remove(cartdb);
			entityTransaction.commit();
			System.out.println("Delete Success");
		} else {
			System.out.println("Delete UnSuccess");
		}
	}

	public List<Cart> fetchCart() {
		String sql = "SELECT e FROM Cart e ";
		Query query = entityManager.createQuery(sql);

		List<Cart> list = query.getResultList();
		return list;
	}

}
