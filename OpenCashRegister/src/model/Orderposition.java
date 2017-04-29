package model;

public class Orderposition {

	Product product;

	int count;

	float price;

	String name;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getName() {
		return product.getName();
	}

	public float getPrice() {
		return product.getPrice() * count;
	}

}
