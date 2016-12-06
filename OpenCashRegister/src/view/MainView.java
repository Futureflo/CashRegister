package view;

import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;

public class MainView extends BorderPane {

	MenuBar menuBarTop;
	CenterPaneSeparated centerPaneSeparated;

	public void init() {
		this.setTop(menuBarTop);
		this.setCenter(centerPaneSeparated);
	}

	public MenuBar getMenuBarTop() {
		return menuBarTop;
	}

	public void setMenuBarTop(MenuBar menuBarTop) {
		this.menuBarTop = menuBarTop;
	}

	public CenterPaneSeparated getCenterPaneSeparated() {
		return centerPaneSeparated;
	}

	public void setCenterPaneSeparated(CenterPaneSeparated centerPaneSeparated) {
		this.centerPaneSeparated = centerPaneSeparated;
	}

}
