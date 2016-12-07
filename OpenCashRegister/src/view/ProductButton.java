package view;

import javafx.scene.control.Button;
import model.Product;

public class ProductButton extends Button {

	private Product product;

	public ProductButton(Product product) {
		this.product = product;
		this.setText(this.product.getName());
	}

	public ProductButton(String text) {
		super(text);
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
