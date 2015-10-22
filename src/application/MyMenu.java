package application;

import java.awt.CheckboxMenuItem;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.media.MediaPlayer.Status;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyMenu extends MenuBar{
	
	private Menu menuFile;
	private Menu menuView;
	private Menu menuHelp;
	
	private MenuItem menuOpen;
	private MenuItem menuSubtitles;
	private MenuItem menuExit;
	
	private MenuItem menuFont;
	private MenuItem menuAbout;
	MyMenu() {
		menuFile = new Menu("File");
		menuView = new Menu("View");
		menuHelp = new Menu("Help");

		menuOpen = new MenuItem("Open...");
		menuSubtitles = new MenuItem("Load Subtitles");
		menuExit = new MenuItem("Exit");
		
		menuFont = new MenuItem("Font");
		menuAbout = new MenuItem("About");
		
		
		menuFile.getItems().addAll(menuOpen,
		        new SeparatorMenuItem(), menuExit);
		
		menuView.getItems().addAll(menuSubtitles,menuFont);
		menuHelp.getItems().add(menuAbout);
		
		this.getMenus().addAll(menuFile, menuView, menuHelp);
		
		menuAbout.setOnAction(new EventHandler<ActionEvent>() {
		     public void handle(ActionEvent e) {
		    	StageHelp helpStage = new StageHelp();
		     }
		});
	}
	
}
