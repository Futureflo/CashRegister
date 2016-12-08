package model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import view.TablePaneController;

public class DatamodelOrders {

	private TablePaneController controller;

	private final ObservableList<Order> orderList = FXCollections.observableArrayList();

	private final ObjectProperty<Order> currentOrder = new SimpleObjectProperty<>(null);

	private ObservableList<Orderposition> orderpositionList = FXCollections.observableArrayList();

	public ObservableList<Orderposition> addOrderposition(Product product) {

		for (Orderposition orderposition : orderpositionList) {
			if (orderposition.getProduct() == product) {
				orderposition.setCount((orderposition.getCount() + 1));
				break;
			} else {
				Orderposition orderPosition = new Orderposition();
				orderposition.setProduct(product);
				orderposition.setCount(1);

				orderpositionList.add(orderposition);
			}
		}
		controller.initModel(this);
		return orderpositionList;

	}

	public ObservableList<Orderposition> getOrderpositionList() {
		return orderpositionList;
	}

	public void setOrderpositionList(ObservableList<Orderposition> orderpositionList) {
		this.orderpositionList = orderpositionList;
	}

	public ObjectProperty<Order> currentOrderProperty() {
		return currentOrder;
	}

	public final Order getCurrentOrder() {
		return currentOrder.get();
	}

	public final void setCurrentOrder(Order order) {
		currentOrder.set(order);
	}

	public ObservableList<Order> getOrderList() {
		return orderList;
	}

	public TablePaneController getController() {
		return controller;
	}

	public void setController(TablePaneController controller) {
		this.controller = controller;
	}

}
