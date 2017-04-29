package view;

import java.util.ArrayList;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import model.Product;

public class ProductPane extends GridPane {

	private ArrayList<Product> model;

	private ProductPaneListener listener;

	public void init() {

		for (int i = 0; i < 15; i++) {
			ProductButton button;
			if (i < model.size()) {
				button = new ProductButton(model.get(i));

				button.setOnAction(e -> listener.handle(e));
			} else {
				button = new ProductButton("");
			}
			// Button soll maximale Größe einnehmen
			button.setMaxHeight(Double.MAX_VALUE);
			button.setMaxWidth(Double.MAX_VALUE);

			// Button bekommt von GridPane die maximale Größe zur Verfügung
			// + Wachstumsrechte
			GridPane.setHgrow(button, Priority.ALWAYS);
			GridPane.setVgrow(button, Priority.ALWAYS);
			this.add(button, i % 3, i / 3);
		}
	}

	public ArrayList<Product> getModel() {
		return model;
	}

	public void setModel(ArrayList<Product> model) {
		this.model = model;
	}

	public ProductPaneListener getListener() {
		return listener;
	}

	public void setListener(ProductPaneListener listener) {
		this.listener = listener;
	}

}
