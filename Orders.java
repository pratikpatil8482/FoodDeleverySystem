package orders;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orders {

	@Id 
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	
	private int qnt;


	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	private String name ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private double price ;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", qnt=" + qnt + ", name=" + name + ", price=" + price + "]";
	}
}
