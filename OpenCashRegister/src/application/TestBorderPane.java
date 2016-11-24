package application;

import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class TestBorderPane extends BorderPane {

	String name;
	TextField testTextfeld;

	public TextField getTestTextfeld() {
		return testTextfeld;
	}

	public void setTestTextfeld(TextField testTextfeld) {
		this.testTextfeld = testTextfeld;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
