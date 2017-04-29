
package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Orderposition;
import model.Product;

public class TablePane extends TableView<Orderposition> {

	private ObservableList<Orderposition> data = FXCollections.observableArrayList();

	public void init() {

		this.setEditable(true);
		//
		// TableColumn<Product, String> productCol = new TableColumn<Product,
		// String>("Produkt");
		// productCol.setCellValueFactory(new PropertyValueFactory<Product,
		// String>("name"));

		TableColumn<Orderposition, Product> productCol = new TableColumn<Orderposition, Product>("Produkt");
		// productCol.setCellValueFactory(c -> new SimpleStringProperty("" +
		// orderposition.getProduct().getName()));
		productCol.setCellValueFactory(new PropertyValueFactory<Orderposition, Product>("name"));

		// productCol
		// .setCellFactory(new Callback<TableColumn<Orderposition, Product>,
		// TableCell<Orderposition, Product>>() {
		//
		// public TableCell<Orderposition, Product>
		// call(TableColumn<Orderposition, Product> param) {
		//
		// TableCell<Orderposition, Product> productCell = new
		// TableCell<Orderposition, Product>() {
		//
		// protected void updateItem(Product item, boolean empty) {
		// if (item != null) {
		// Label productLabel = new Label("Test");
		// setGraphic(productLabel);
		// }
		// }
		// };
		// return productCell;
		// }
		// });

		TableColumn countCol = new TableColumn("Anzahl");
		countCol.setCellValueFactory(new PropertyValueFactory<>("count"));
		TableColumn priceCol = new TableColumn("Preis");
		priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));
		// priceCol.setCellValueFactory(
		// c -> new SimpleStringProperty("" +
		// data.get(index).getProduct().getPrice() * orderposition.getCount()));

		this.getColumns().addAll(productCol, countCol, priceCol);
		// this.setItems(data);
	}

	public ObservableList<Orderposition> getData() {
		return data;
	}

	public void setData(ObservableList<Orderposition> data) {
		this.data = data;
		this.setItems(data);
		this.refresh();
	}

}
