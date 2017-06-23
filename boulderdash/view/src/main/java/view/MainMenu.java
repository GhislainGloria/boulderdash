package view;

import javax.swing.*;
import java.awt.BorderLayout;
import java.io.File;
import java.io.IOException;


// TODO: Auto-generated Javadoc
/**
 * The Class MainMenu.
 * The window showing the main menu, where you can select 
 *   the level, or have a pop-up "help" with the commands
 */
public class MainMenu extends JFrame{
	
	/** The menu image. */
	private MenuImage menuImage;
	
	/** The option panel. */
	private JPanel optionPanel;
	
	/**
	 * Instantiates a new main menu.
	 */
	public MainMenu(){
		
		this.initializeView();
		this.createLayout();
	}
	
	
	/**
	 * Initialize view.
	 */
	private void initializeView() {
        this.setVisible(true);
        this.setResizable(false);

        // UI parameters
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 200, 100);
        this.setSize(700, 700);

        // App parameters
        this.setTitle("Boulder Dash");
    }
	
    /**
     * Creates the layout.
     */
    private void createLayout() {

        this.menuImage = new MenuImage();
    	this.optionPanel = new JPanel();
    	
        // Add some buttons on the actionPanel
        this.createButton("game", "Game");
        this.createButton("quit", "Quit");

//        this.add(this.menuImage, BorderLayout.CENTER);
        this.add(this.optionPanel, BorderLayout.SOUTH);
        
    }
    
    /**
     * Creates the button.
     *
     * @param id the id
     * @param name the name
     * @return the j button
     */
    private JButton createButton(String id, String name){
    	
		JButton button = new JButton(name);

		this.optionPanel.add(button);
		
		return button;

    }
}
