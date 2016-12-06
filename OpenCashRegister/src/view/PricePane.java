package view;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class PricePane extends GridPane {

	TablePane tablePane;

	NumberPane numberPane;

	public void init() {
		this.add(numberPane, 0, 1);

		GridPane.setHgrow(numberPane, Priority.ALWAYS);
		GridPane.setVgrow(numberPane, Priority.ALWAYS);

		numberPane.setMaxHeight(Double.MAX_VALUE);
		numberPane.setMaxWidth(Double.MAX_VALUE);

		this.add(tablePane, 0, 0);
	}

	public NumberPane getNumberPane() {
		return numberPane;
	}

	public void setNumberPane(NumberPane numerPane) {
		this.numberPane = numerPane;
	}

	public TablePane getTablePane() {
		return tablePane;
	}

	public void setTablePane(TablePane tablePane) {
		this.tablePane = tablePane;
	}

}
