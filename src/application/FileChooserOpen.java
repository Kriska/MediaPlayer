package application;


import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FileChooserOpen extends Stage{
	private FileChooser fileChooser;
	

	FileChooserOpen(File fileToPlay) {
		 FileChooser fileChooser = new FileChooser();
	     FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Media files (*.mp3)", "*.mp4");
	     fileChooser.getExtensionFilters().add(extFilter);
	     fileToPlay = fileChooser.showOpenDialog(this);
	}
}
