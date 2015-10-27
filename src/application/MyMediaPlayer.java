package application;

import java.io.File;
import java.net.MalformedURLException;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class MyMediaPlayer {
	
	MyMediaPlayer(File fileToPlay, Stage parsedStage) {
		
		parsedStage.setTitle(fileToPlay.getName());
        Group root = new Group();
       
        Scene scene = new Scene(root, 860, 640);
        BorderPane border = new BorderPane();
        MyMenu myMenu = new MyMenu(parsedStage);
        border.setTop(myMenu);
       scene.setRoot(border);
      parsedStage.setScene(scene);
		try {
			Media media = new Media(fileToPlay.toURI().toURL().toString());
			 MediaPlayer mediaPlayer = new MediaPlayer(media);
		        mediaPlayer.setAutoPlay(true);
		        MediaControl mediaControl = new MediaControl(mediaPlayer);

		        border.setCenter(mediaControl);
		        //fullScreen EventHandler
		        mediaControl.getMediaView().setOnMouseClicked(new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent e) {
						if(e.getButton().equals(MouseButton.PRIMARY)){
						
				            if(e.getClickCount() == 2) {
				            	if(!(mediaControl.isFullScreen())) { 
				            		mediaControl.setFullScreen(true);
				            		parsedStage.setFullScreen(mediaControl.isFullScreen());
				            		border.setTop(null);
				            	}
				            	else {
				            		mediaControl.setFullScreen(false);
				                    parsedStage.setFullScreen(mediaControl.isFullScreen());
				                    border.setTop(myMenu);
				            	}
				            }
						}
					}
		        });
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}