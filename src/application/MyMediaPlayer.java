package application;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class MyMediaPlayer extends Application {

	private static final String MEDIA_URL =
			 "D:/krissy/k.mp3";
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Embedded Media Player");
        Group root = new Group();
        Scene scene = new Scene(root, 540, 241);

        Media media = new Media(new File(MEDIA_URL).toURI().toURL().toExternalForm());
      MediaPlayer mediaPlayer = new MediaPlayer(media);
       
        mediaPlayer.setAutoPlay(true);
        MediaControl mediaControl = new MediaControl(mediaPlayer);

        BorderPane border = new BorderPane();
        MyMenu myMenu = new MyMenu();
        
        border.setTop(myMenu);
        border.setCenter(mediaControl);
       // root.getChildren().add(border);
        scene.setRoot(border);
        primaryStage.setScene(scene);
        primaryStage.show();
	}
		
}