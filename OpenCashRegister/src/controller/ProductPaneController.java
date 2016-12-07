package controller;

import loader.Loader;
import view.ProductPane;

public class ProductPaneController {

	ProductPane productPane;

	Loader txtLoader;

	public void init() {
		this.setProductPaneModel();
	}

	public void setProductPaneModel() {
		productPane.setModel(txtLoader.readProducts());
		productPane.init();
	}

	public Loader getTxtLoader() {
		return txtLoader;
	}

	public void setTxtLoader(Loader txtLoader) {
		this.txtLoader = txtLoader;
	}

	public ProductPane getProductPane() {
		return productPane;
	}

	public void setProductPane(ProductPane productPane) {
		this.productPane = productPane;
	}

}
