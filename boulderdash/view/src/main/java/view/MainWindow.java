package view;

import javax.swing.*;

public class MainWindow extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private GameFrame gameFrame;

	public MainWindow(){
		
		this.setTitle("BoulderDash");
		this.setSize(500, 500);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setVisible(true);
	    this.setResizable(false);
	    
	    this.run();
	    
	    


	}
	
	public void run(){
		
		this.gameFrame = new GameFrame();
		this.setVisible(false);
	}
	
	

}
