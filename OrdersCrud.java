package orders;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import cart.Cart;

public class OrdersCrud {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pratik");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void addToOrder(Orders orders) {
	    try {
	        entityTransaction.begin();
	        entityManager.persist(orders);
	        entityTransaction.commit();
	    } catch (RuntimeException e) {
	        if (entityTransaction.isActive()) {
	            entityTransaction.rollback();
	        }
	        // Handle exception appropriately, e.g., log it or throw it
	    }
	}

	public void updateOrder(int id, Cart cart) {
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
	public List<Orders> fetchOrder() {
		String sql = "SELECT e FROM Orders e ";
		Query query = entityManager.createQuery(sql);
		List<Orders> list = query.getResultList();
		return list;
	}

}
