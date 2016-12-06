package view;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class ProductPane extends GridPane {

	public void init() {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				Button button = new Button("text");

				// Button soll maximale Größe einnehmen
				button.setMaxHeight(Double.MAX_VALUE);
				button.setMaxWidth(Double.MAX_VALUE);

				// Button bekommt von GridPane die maximale Größe zur Verfügung
				// + Wachstumsrechte
				GridPane.setHgrow(button, Priority.ALWAYS);
				GridPane.setVgrow(button, Priority.ALWAYS);
				this.add(button, i, j);
			}
		}
	}

}
