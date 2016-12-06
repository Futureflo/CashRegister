package view;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class NumberPane extends GridPane {

	public void init() {
		Button button00 = new Button("00");
		Button button0 = new Button("0");
		Button buttonComma = new Button(",");
		Button button1 = new Button("1");
		Button button2 = new Button("2");
		Button button3 = new Button("3");
		Button button4 = new Button("4");
		Button button5 = new Button("5");
		Button button6 = new Button("6");
		Button button7 = new Button("7");
		Button button8 = new Button("8");
		Button button9 = new Button("9");

		List<Button> buttonList = new ArrayList<Button>();
		buttonList.add(button7);
		buttonList.add(button8);
		buttonList.add(button9);
		buttonList.add(button4);
		buttonList.add(button5);
		buttonList.add(button6);
		buttonList.add(button1);
		buttonList.add(button2);
		buttonList.add(button3);
		buttonList.add(buttonComma);
		buttonList.add(button0);
		buttonList.add(button00);

		int i = 0;

		for (Button button : buttonList) {
			this.add(button, i % 3, i / 3);

			GridPane.setHgrow(button, Priority.ALWAYS);
			GridPane.setVgrow(button, Priority.ALWAYS);

			button.setMaxHeight(Double.MAX_VALUE);
			button.setMaxWidth(Double.MAX_VALUE);

			i++;
		}
	}
}
