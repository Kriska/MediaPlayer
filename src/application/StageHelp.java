package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StageHelp extends Stage {

	StageHelp() {
		setTitle("JavaFX Welcome");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		Scene scene = new Scene(grid, 300,275);
		setScene(scene);
		Text sceneTitle = new Text("This is Kriska's Media PLayer. \n Thanks for using.\n#2015");
		sceneTitle.setFont(Font.font("Comic Sans MS", FontWeight.NORMAL, 18));
		grid.add(sceneTitle, 0,0,2,1);
		show();
	}
 
}