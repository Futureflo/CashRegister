package view;

import model.DatamodelOrders;

public class TablePaneController {

	TablePane tablePane;

	DatamodelOrders datamodel;

	public void initModel(DatamodelOrders datamodel) {

		this.datamodel = datamodel;
		tablePane.setData(this.datamodel.getOrderpositionList());

	}

	public TablePane getTablePane() {
		return tablePane;
	}

	public void setTablePane(TablePane tablePane) {
		this.tablePane = tablePane;
	}

}
