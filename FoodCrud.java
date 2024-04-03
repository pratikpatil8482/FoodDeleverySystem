package food;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FoodCrud {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pratik");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

		public void saveFood(Food food) {
			entityTransaction.begin();
			entityManager.persist(food);
			entityTransaction.commit();
		}

		public void updateFood(int id,Food food) {
			Food fooddb=entityManager.find(Food.class,id);
			
			if(fooddb!=null) {
				entityTransaction.begin();
				food.setId(fooddb.getId());;
				entityManager.merge(food);
				entityTransaction.commit();
				System.out.println("Update Success");
			}else {
				System.out.println("No Food In db");
			}
		}

		public void deleteFood(int id) {
			Food fooddb=entityManager.find(Food.class, id);
			if(fooddb!=null) {
				entityTransaction.begin();
				entityManager.remove(fooddb);
				entityTransaction.commit();
				System.out.println("Delete Success");
			}else {
				System.out.println("Delete UnSuccess");
			}
		}

		public void fetchAll() {
			String sql="SELECT e FROM Food e ";
			Query query=entityManager.createQuery(sql);
			
			Food food=new Food();
			List<Food>list=query.getResultList();
			if(!(list.isEmpty())){
				System.out.println(list);
			}else {
				System.err.println("No Food In Db");
			}
		}

}
