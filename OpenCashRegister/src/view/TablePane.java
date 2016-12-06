package view;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Food;
import model.OrderpositionTable;
import model.Product;

public class TablePane extends TableView<OrderpositionTable> {

	public void init() {

		Food food = new Food();
		food.setName("Wurst");
		food.setPrice(2.50f);

		OrderpositionTable orderposition = new OrderpositionTable(food);
		orderposition.setCount(2);

		final ObservableList<OrderpositionTable> data = FXCollections.observableArrayList(orderposition);

		this.setEditable(true);

		TableColumn productCol = new TableColumn("Produkt");
		productCol.setCellValueFactory(new PropertyValueFactory<Product, String>("name"));
		TableColumn countCol = new TableColumn("Anzahl");
		countCol.setCellValueFactory(new PropertyValueFactory<>("count"));
		TableColumn priceCol = new TableColumn("Preis");
		priceCol.setCellValueFactory(
				c -> new SimpleStringProperty("" + orderposition.getPrice() * orderposition.getCount()));

		this.getColumns().addAll(productCol, countCol, priceCol);

		this.setItems(data);
	}

}
