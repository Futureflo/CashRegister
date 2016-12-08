package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.DatamodelOrders;
import model.Product;

public class ProductPaneListener implements EventHandler<ActionEvent> {

	DatamodelOrders model;

	public void handle(ActionEvent event) {

		ProductButton productButton = (ProductButton) event.getSource();
		Product product = productButton.getProduct();

		model.addOrderposition(product);
	}

	public DatamodelOrders getModel() {
		return model;
	}

	public void setModel(DatamodelOrders model) {
		this.model = model;
	}

}
