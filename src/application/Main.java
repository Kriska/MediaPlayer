package application;
	
import javafx.application.Application;


public class Main {
	public static void main(String[] args) {
		//Application.launch(MyMediaPlayer.class, args);
		Application.launch(StartDisplay.class,args);
	}
}


//TODO: close one file after open another ne s konstruktor a s seter v myMediaPlayer
//TODO: subtitles
//TODO: font display
//TODO: error if filechooser just closed


//da pazq vsi4ki plei-nati failove vav nqkav masiv i vseki pat da pravq media[i] = noviq fail. 
//pri puskane na nov fail i++ ...mazalo... 
//menuItem History shte pokazva s padashto menu vsi4kite failove deto sa bili v media*