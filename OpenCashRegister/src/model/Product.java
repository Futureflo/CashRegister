package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Product {

	private StringProperty name;

	private float price;

	public String getName() {
		return nameProperty().get();
	}

	public void setName(String value) {
		nameProperty().set(value);
	}

	public StringProperty nameProperty() {
		if (name == null) {
			name = new SimpleStringProperty();
		}
		return name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
