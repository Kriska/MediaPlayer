package application;


import java.io.File;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StartDisplay extends Application {

	@Override
	public void start(final Stage primaryStage) throws Exception {
		primaryStage.setTitle("Kriska's Media Player");
		primaryStage.setResizable(false);
       BorderPane grid = new BorderPane();
		
        Scene scene = new Scene(grid, 805, 640);
		Text sceneTitle = new Text("This is Kriska's Media PLayer. \n Thanks for using.\n#2015\n Click File/Open to load file.");
		sceneTitle.setFont(Font.font("Comic Sans MS", FontWeight.NORMAL, 18));
		
		final ImageView imageView = new ImageView();
        File file = new File("src/s.png");
        Image image = new Image(file.toURI().toString());
        imageView.setImage(image);
		MyMenu menu = new MyMenu(primaryStage);
		grid.setTop(menu);
		grid.setCenter(sceneTitle);
		grid.setBottom(imageView);

        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
}