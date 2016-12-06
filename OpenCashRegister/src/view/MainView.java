package view;

import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;

public class MainView extends BorderPane {

	MenuBar menuBarTop;

	public void init() {
		this.setTop(menuBarTop);
	}

	public MenuBar getMenuBarTop() {
		return menuBarTop;
	}

	public void setMenuBarTop(MenuBar menuBarTop) {
		this.menuBarTop = menuBarTop;
	}

}
