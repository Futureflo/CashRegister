package model;

import java.util.List;

public class Order {

	List<Product> products;

	int id;

	public List<Product> addProduct(Product product) {
		products.add(product);

		return products;
	}

	public List<Product> removeProduct(Product product) {
		products.remove(product);

		return products;
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
