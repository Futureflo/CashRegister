package model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DatamodelOrders {

	private final ObservableList<Order> orderList = FXCollections.observableArrayList();

	private final ObjectProperty<Order> currentOrder = new SimpleObjectProperty<>(null);

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
}
