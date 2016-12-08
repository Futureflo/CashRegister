package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;
import model.Orderposition;
import model.Product;

public class TablePane extends TableView<Orderposition> {

	private ObservableList<Orderposition> data = FXCollections.observableArrayList();

	public void init() {

		this.setEditable(true);

		// Product product = new Product();
		// product.setName("Test");
		// product.setPrice(2f);
		//
		// Orderposition order = new Orderposition();
		// order.setProduct(product);
		// order.setCount(2);
		// data.add(order);
		TableColumn<Orderposition, Product> productCol = new TableColumn<Orderposition, Product>("Produkt");
		// productCol.setCellValueFactory(c -> new SimpleStringProperty("" +
		// orderposition.getProduct().getName()));
		productCol.setCellValueFactory(new PropertyValueFactory<Orderposition, Product>("name"));

		productCol
				.setCellFactory(new Callback<TableColumn<Orderposition, Product>, TableCell<Orderposition, Product>>() {

					@Override
					public TableCell<Orderposition, Product> call(TableColumn<Orderposition, Product> param) {

						TableCell<Orderposition, Product> productCell = new TableCell<Orderposition, Product>() {

							protected void updateItem(Product item, boolean empty) {
								if (item != null) {
								}
							}
						};

						return productCell;
					}

				});

		TableColumn countCol = new TableColumn("Anzahl");
		countCol.setCellValueFactory(new PropertyValueFactory<>("count"));
		TableColumn priceCol = new TableColumn("Preis");
		// priceCol.setCellValueFactory(
		// c -> new SimpleStringProperty("" +
		// orderposition.getProduct().getPrice() * orderposition.getCount()));

		this.getColumns().addAll(productCol, countCol, priceCol);
		// this.setItems(data);
	}

	public ObservableList<Orderposition> getData() {
		return data;
	}

	public void setData(ObservableList<Orderposition> data) {
		this.data = data;
		this.setItems(data);
	}

}
