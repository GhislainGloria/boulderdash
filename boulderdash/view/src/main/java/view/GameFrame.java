package view;

import java.awt.Dimension;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
<<<<<<< HEAD
import java.util.ArrayList;

import javax.swing.*;

import fr.exia.showboard.BoardFrame;
import model.element.ILevelMap;
import model.element.mobile.IMobile;
//import controller
//import controller.IOrderPerform;
//import controller.UserOrder;


public class GameFrame implements KeyListener{
	
    private int width = 10;
    private int height = 10;
	
	/** The initial frame size. */
    private static final int  defaultFrameSize = 700;
    
    private Rectangle        fullView= new Rectangle(0, 0, width, height);
    private static final int squareSize = 50;
    
//    private IOrderPerform  orderPerform;
    
    /** The map */
    private ILevelMap map;
    
    /** The character */
    private IMobile character;
    
    /** The array of pawns*/
    private ArrayList<IMobile> pawns;
    
    

 
    public GameFrame(){
    	this.initBoardFrame();
    }
    
    private void initBoardFrame(){
    	
    	final BoardFrame boardFrame = new BoardFrame("Full view");
        boardFrame.setDimension(new Dimension());
        boardFrame.setDisplayFrame(this.fullView);
        boardFrame.setSize(this.fullView.width * squareSize, this.fullView.height * squareSize);
        boardFrame.addKeyListener(this);
    	
    }
    
    /*public void paint(LevelMap map){
    	
    	
    	   
    	   for(int i=0; i < map.getHeight(); i++) {
    	       
    		   for(int k=0; k < map.getWidth(); k++){
    	        
    			   char c = map.get;
    			   Tile tile;
    	        
    	        switch (c){
    	        
    	        	case 'O':	tile = new Tile("diamond");
    	        	case 'E':	tile = "TackyTacky.png";
    	        	case 'W':	tile = "wall.png";
    	        	case 'M':	tile = "Mud.png";
    	        	case 'R':	tile = "boulder.png";
    	        	case 'V':	tile = "empty.png";
    	        	case 'H':	tile = "rockfordface.png";
    	        	 
    	        }
    	        
    	        
    	       
    	        
    	       }
    	   

    	  }
    }
	*/
    /**
     * Key code to user order.
     *
     * @param keyCode
     *            the key code
     * @return the user order
     */
    /*
    private static UserOrder keyCodeToUserOrder(final int keyCode) {
        UserOrder userOrder;
        switch (keyCode) {
            case KeyEvent.VK_RIGHT:
                userOrder = UserOrder.RIGHT;
                break;
            case KeyEvent.VK_LEFT:
                userOrder = UserOrder.LEFT;
                break;
            default:
                userOrder = UserOrder.NOP;
                break;
        }
        return userOrder;
    }
    */
=======

import javax.swing.*;

import fr.exia.showboard.BoardFrame;
//import controller
import controller.IOrderPerform;
import controller.UserOrder;


public class GameFrame implements KeyListener{
	
    private int width = 10;
    private int height = 10;
	
	/** The initial frame size. */
    private static final int  defaultFrameSize = 700;
    
    private Rectangle        fullView= new Rectangle(0, 0, width, height);
    private static final int squareSize = 50;
    
//    private IOrderPerform  orderPerform;
    
    /** The map */
    private IMap map;
    
    /** The character */
    private IMobile character;
    
    /** The array of pawns*/
    private ArrayList<IMobile> pawns;
    
    

 
    public GameFrame(){
    	this.initBoardFrame();
    }
    
    private void initBoardFrame(){
    	
    	final BoardFrame boardFrame = new BoardFrame("Full view");
        boardFrame.setDimension(new Dimension());
        boardFrame.setDisplayFrame(this.fullView);
        boardFrame.setSize(this.fullView.width * squareSize, this.fullView.height * squareSize);
        boardFrame.addKeyListener(this);
    	
    }
    
    public void paint(LevelMap map){
    	
    	
    	   
    	   for(int i=0; i < map.getHeight(); i++) {
    	       
    		   for(int k=0; k < map.getWidth(); k++){
    	        
    			   char c = map.get;
    			   Tile tile;
    	        
    	        switch (c){
    	        
    	        	case 'O':	tile = new Tile("diamond");
    	        	case 'E':	tile = "TackyTacky.png";
    	        	case 'W':	tile = "wall.png";
    	        	case 'M':	tile = "Mud.png";
    	        	case 'R':	tile = "boulder.png";
    	        	case 'V':	tile = "empty.png";
    	        	case 'H':	tile = "rockfordface.png";
    	        	 
    	        }
    	        
    	        
    	       
    	        
    	       }
    	   

    	  }
    }

    /**
     * Key code to user order.
     *
     * @param keyCode
     *            the key code
     * @return the user order
     */
    private static UserOrder keyCodeToUserOrder(final int keyCode) {
        UserOrder userOrder;
        switch (keyCode) {
            case KeyEvent.VK_RIGHT:
                userOrder = UserOrder.RIGHT;
                break;
            case KeyEvent.VK_LEFT:
                userOrder = UserOrder.LEFT;
                break;
            default:
                userOrder = UserOrder.NOP;
                break;
        }
        return userOrder;
    }
    
>>>>>>> branch 'master' of https://github.com/GhislainGloria/boulderdash
    protected void loadImages(){
    	
    }
    
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public int getHeight(){
		return this.height;
	}
	
	public int getWidth(){
		return this.width;
	}


}