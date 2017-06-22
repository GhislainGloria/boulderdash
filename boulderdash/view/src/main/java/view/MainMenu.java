package view;

import javax.swing.*;
import java.awt.BorderLayout;
import java.io.File;
import java.io.IOException;


public class MainMenu extends JFrame{
	
	private MenuImage menuImage;
	private JPanel optionPanel;
	
	public MainMenu(){
		
		this.initializeView();
		this.createLayout();
	}
	
	
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
	
    private void createLayout() {

        this.menuImage = new MenuImage();
    	this.optionPanel = new JPanel();
    	
        // Add some buttons on the actionPanel
        this.createButton("game", "Game");
        this.createButton("quit", "Quit");

//        this.add(this.menuImage, BorderLayout.CENTER);
        this.add(this.optionPanel, BorderLayout.SOUTH);
        
    }
    
    private JButton createButton(String id, String name){
    	
		JButton button = new JButton(name);

		this.optionPanel.add(button);
		
		return button;

    }
}
