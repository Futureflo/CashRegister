package model;

import java.util.List;

public class Order {

	List<Product> products;
	int id;

	public boolean addProduct(Product myProduct) {
		if (myProduct != null) {
			products.add(myProduct);
			return true;
		} else {
			return false;
		}

	}

	public boolean removeProduct(Product myProduct) {
		if (myProduct != null) {
			products.remove(myProduct);
			return true;
		} else {
			return false;
		}
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
