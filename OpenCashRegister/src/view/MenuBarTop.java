package view;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class MenuBarTop extends MenuBar {

	public void init() {
		final Menu file = new Menu("File");

		final MenuItem newOrder = new MenuItem("Neue Bestellung");
		final MenuItem showOrders = new MenuItem("Bestellungen anzeigen");

		file.getItems().addAll(newOrder, showOrders);

		this.getMenus().addAll(file);
	}

}
