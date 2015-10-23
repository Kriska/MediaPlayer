package application;

import java.io.File;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.media.MediaPlayer;
import javafx.stage.FileChooser;

public class MyMenu extends MenuBar{
	
	private Menu menuFile;
	private Menu menuView;
	private Menu menuHelp;
	
	private MenuItem menuOpen;
	private MenuItem menuSubtitles;
	private MenuItem menuExit;
	
	private MenuItem menuFont;
	private MenuItem menuAbout;
	private File fileToPlay;
	private FileChooser fileChooser;
	
	
	
	public FileChooser getFileChooser() {
		return fileChooser;
	}


	public void setFileChooser(FileChooser fileChooser) {
		this.fileChooser = fileChooser;
	}


	public File getFileToPlay() {
		return fileToPlay;
	}


	public void setFileToPlay(File fileToPlay) {
		this.fileToPlay = fileToPlay;
	}


	public Menu getMenuFile() {
		return menuFile;
	}


	public void setMenuFile(Menu menuFile) {
		this.menuFile = menuFile;
	}


	public Menu getMenuView() {
		return menuView;
	}


	public void setMenuView(Menu menuView) {
		this.menuView = menuView;
	}


	public Menu getMenuHelp() {
		return menuHelp;
	}


	public void setMenuHelp(Menu menuHelp) {
		this.menuHelp = menuHelp;
	}


	public MenuItem getMenuOpen() {
		return menuOpen;
	}


	public void setMenuOpen(MenuItem menuOpen) {
		this.menuOpen = menuOpen;
	}


	public MenuItem getMenuSubtitles() {
		return menuSubtitles;
	}


	public void setMenuSubtitles(MenuItem menuSubtitles) {
		this.menuSubtitles = menuSubtitles;
	}


	public MenuItem getMenuExit() {
		return menuExit;
	}


	public void setMenuExit(MenuItem menuExit) {
		this.menuExit = menuExit;
	}


	public MenuItem getMenuFont() {
		return menuFont;
	}


	public void setMenuFont(MenuItem menuFont) {
		this.menuFont = menuFont;
	}


	public MenuItem getMenuAbout() {
		return menuAbout;
	}


	public void setMenuAbout(MenuItem menuAbout) {
		this.menuAbout = menuAbout;
	}


	MyMenu() {
		menuFile = new Menu("File");
		menuView = new Menu("View");
		menuHelp = new Menu("Help");

		menuOpen = new MenuItem("Open...");
		menuSubtitles = new MenuItem("Load Subtitles");
		menuExit = new MenuItem("Exit");
		
		menuFont = new MenuItem("Font");
		menuAbout = new MenuItem("About");
		 
		fileToPlay= new File("start.png");
		
		
		menuFile.getItems().addAll(menuOpen,
		        new SeparatorMenuItem(), menuExit);
		
		menuView.getItems().addAll(menuSubtitles,menuFont);
		menuHelp.getItems().add(menuAbout);
		
		this.getMenus().addAll(menuFile, menuView, menuHelp);
		//Open action
		menuOpen.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				 fileChooser = new FileChooser();
			     FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Media files (*.mp3)", "*.mp4");
			     fileChooser.getExtensionFilters().add(extFilter);
			     setFileToPlay(fileChooser.showOpenDialog(null));
			    MyMediaPlayer myMediaPlayer = new MyMediaPlayer(getFileToPlay());
			}
		});
		
		//Exit action
		menuExit.setOnAction(new EventHandler<ActionEvent>() {
		      public void handle(ActionEvent e) {
		        Platform.exit();
		      }
		    });
		//About action
		menuAbout.setOnAction(new EventHandler<ActionEvent>() {
		     public void handle(ActionEvent e) {
		    	StageHelp helpStage = new StageHelp();
		     }
		});
	}
}
