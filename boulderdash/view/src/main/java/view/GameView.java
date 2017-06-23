package view;

import javax.swing.*;
import java.awt.*;

/**
 * GameView
 *
 * Specifies the game view itself.
 *
 */

public class GameView extends JPanel {
	
	private int x;
	
	public GameView(){
		
		
		
		this.setLayout(new GridLayout(11, 11));
		
		for(x = 0; x < 121; x++){
			this.add(new JLabel("test"));
		}
		
		this.setVisible(true);
		
	}

}
