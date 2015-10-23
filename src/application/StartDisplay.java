package application;

import java.io.File;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StartDisplay extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Embedded Media Player");
		primaryStage.setResizable(false);
        Group root = new Group();
        BorderPane grid = new BorderPane();
		
        Scene scene = new Scene(grid, 805, 640);
		Text sceneTitle = new Text("This is Kriska's Media PLayer. \n Thanks for using.\n#2015\n Click File/Open to load file.");
		sceneTitle.setFont(Font.font("Comic Sans MS", FontWeight.NORMAL, 18));
		
		final ImageView imageView = new ImageView();
        final Image image = new Image(getClass().getResourceAsStream("start.png"));
        imageView.setImage(image);
		MyMenu menu = new MyMenu();
		grid.setTop(menu);
		grid.setCenter(sceneTitle);
		grid.setBottom(imageView);
		
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
}
