package view;

import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Orderposition;

public class TablePane extends TableView<Orderposition> {

	private ObservableList<Orderposition> data;

	public void init() {

		this.setEditable(true);

		TableColumn productCol = new TableColumn("Produkt");
		// productCol.setCellValueFactory(c -> new SimpleStringProperty("" +
		// orderposition.getProduct().getName()));
		TableColumn countCol = new TableColumn("Anzahl");
		countCol.setCellValueFactory(new PropertyValueFactory<>("count"));
		TableColumn priceCol = new TableColumn("Preis");
		// priceCol.setCellValueFactory(
		// c -> new SimpleStringProperty("" +
		// orderposition.getProduct().getPrice() * orderposition.getCount()));

		this.getColumns().addAll(productCol, countCol, priceCol);

	}

	public ObservableList<Orderposition> getData() {
		return data;
	}

	public void setData(ObservableList<Orderposition> data) {
		this.data = data;
		this.setItems(data);
	}

}
