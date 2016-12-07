package view;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class SumPane extends GridPane {

	public void init() {

		Label labelSum = new Label("Endsumme:");
		TextField txtSum = new TextField();

		Label labelTax = new Label("MwSt:");
		TextField txtTax = new TextField();

		this.add(labelTax, 0, 0);
		this.add(txtTax, 0, 1);

		this.add(labelSum, 1, 0);
		this.add(txtSum, 1, 1);
	}

}
