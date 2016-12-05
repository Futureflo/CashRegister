package model;

import java.util.List;

public class Order {

	List<Product> products;
<<<<<<< HEAD
=======

>>>>>>> branch 'master' of https://github.com/Futureflo/CashRegister.git
	int id;

<<<<<<< HEAD
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
=======
	public List<Product> addProduct(Product product) {
		products.add(product);

>>>>>>> branch 'master' of https://github.com/Futureflo/CashRegister.git
		return products;
	}

<<<<<<< HEAD
=======
	public List<Product> removeProduct(Product product) {
		products.remove(product);

		return products;
	}

	public List<Product> getProducts() {
		return products;
	}

>>>>>>> branch 'master' of https://github.com/Futureflo/CashRegister.git
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
