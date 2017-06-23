package view;

import javax.swing.*;
import java.awt.*;

// TODO: Auto-generated Javadoc
/**
 * GameView
 *
 * Specifies the game view itself.
 *
 */

public class GameView extends JPanel {
	
	/** The x. */
	private int x;
	
	/**
	 * Instantiates a new game view.
	 * The game's window where all the fun is going on
	 */
	public GameView(){
		
		
		
		this.setLayout(new GridLayout(11, 11));
		
		for(x = 0; x < 121; x++){
			this.add(new JLabel("test"));
		}
		
		this.setVisible(true);
		
	}

}
