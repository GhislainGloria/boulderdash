package view;

import java.awt.*;
import javax.swing.*;


// TODO: Auto-generated Javadoc
/**
 * The Class OptionsPanel.
 * This panel is to have some buttons while in-game, to pause or return 
 *   to the main menu.
 */
public class OptionsPanel extends JPanel{
	

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1423883146461933433L;
	
	/** The p button. */
	private JButton pButton;
	
	/** The r button. */
	private JButton rButton;
	
	/** The m button. */
	private JButton mButton;
	
	/**
	 * Instantiates a new options panel.
	 */
	public OptionsPanel(){
		
		this.pButton = new JButton("Pause");
		this.rButton = new JButton("Restart");
		this.mButton = new JButton("Menu");
		
		this.add(pButton);
		this.add(rButton);
		this.add(mButton);

	}
	


}
