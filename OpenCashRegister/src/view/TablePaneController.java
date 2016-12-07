package view;

import model.DatamodelOrders;

public class TablePaneController {

	TablePane tablePane;

	DatamodelOrders datamodel;

	public void initModel(DatamodelOrders datamodel) {

		if (this.datamodel != null) {
			throw new IllegalStateException("Model can only be initialized once");
		}
		this.datamodel = datamodel;

	}

	public TablePane getTablePane() {
		return tablePane;
	}

	public void setTablePane(TablePane tablePane) {
		this.tablePane = tablePane;
	}

}
