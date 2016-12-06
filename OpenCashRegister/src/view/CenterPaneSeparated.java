package view;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class CenterPaneSeparated extends GridPane {

	ProductPane productPane;
	PricePane pricePane;

	public void init() {
		this.add(productPane, 0, 0);
		GridPane.setHgrow(productPane, Priority.ALWAYS);
		GridPane.setVgrow(productPane, Priority.ALWAYS);

		this.add(pricePane, 1, 0);
		GridPane.setHgrow(pricePane, Priority.ALWAYS);
		GridPane.setVgrow(pricePane, Priority.ALWAYS);

		pricePane.setMaxHeight(Double.MAX_VALUE);
		pricePane.setMaxWidth(Double.MAX_VALUE);
	}

	public ProductPane getProductPane() {
		return productPane;
	}

	public void setProductPane(ProductPane productPane) {
		this.productPane = productPane;
	}

	public PricePane getPricePane() {
		return pricePane;
	}

	public void setPricePane(PricePane pricePane) {
		this.pricePane = pricePane;
	}

}
