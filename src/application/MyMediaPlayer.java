package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class MyMediaPlayer extends Application {

	private static final String MEDIA_URL =
			 "http://download.oracle.com/otndocs/products/javafx/oow2010-2.flv";
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Embedded Media Player");
        Group root = new Group();
       
        Scene scene = new Scene(root, 860, 640);

        Media media = new Media(MEDIA_URL);
      MediaPlayer mediaPlayer = new MediaPlayer(media);
       
        mediaPlayer.setAutoPlay(true);
        MediaControl mediaControl = new MediaControl(mediaPlayer);

        BorderPane border = new BorderPane();
        MyMenu myMenu = new MyMenu();
        

        border.setTop(myMenu);
        border.setCenter(mediaControl);
       
       
        scene.setRoot(border);
        primaryStage.setScene(scene);
        
        //fullScreen EventHandler
        mediaControl.getMediaView().setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				if(e.getButton().equals(MouseButton.PRIMARY)){
				
		            if(e.getClickCount() == 2) {
		            	if(!(mediaControl.isFullScreen())) { //
		            		mediaControl.setFullScreen(true);
		            		primaryStage.setFullScreen(mediaControl.isFullScreen());
		            		border.setTop(null);
		            	}
		            	else {
		            		mediaControl.setFullScreen(false);
		                    primaryStage.setFullScreen(mediaControl.isFullScreen());
		                    border.setTop(myMenu);
		            	}
		            }
				}
			}
        });
        primaryStage.show();
	}
		
}