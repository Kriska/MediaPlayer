package application;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;

public class MyMenu extends MenuBar{
	
	private Menu menuFile;
	private Menu menuView;
	private Menu menuHelp;
	MyMenu() {
		menuFile = new Menu("File");
		menuView = new Menu("View");
		menuHelp = new Menu("Help");
		this.getMenus().addAll(menuFile, menuView, menuHelp);
	}

}
