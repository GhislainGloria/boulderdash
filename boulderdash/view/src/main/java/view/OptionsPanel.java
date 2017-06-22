package view;

import java.awt.*;
import javax.swing.*;


public class OptionsPanel extends JPanel{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -1423883146461933433L;
	
	private JButton pButton;
	private JButton rButton;
	private JButton mButton;
	
	public OptionsPanel(){
		
		this.pButton = new JButton("Pause");
		this.rButton = new JButton("Restart");
		this.mButton = new JButton("Menu");
		
		this.add(pButton);
		this.add(rButton);
		this.add(mButton);

	}
	


}
