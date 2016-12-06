package model;

public class OrderpositionTable {

	private String name;

	private int count;

	private float price;

	public OrderpositionTable(Product product) {
		this.name = product.getName();
		this.price = product.getPrice();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
