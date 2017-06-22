package view;

import java.awt.Dimension;

import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;

import javax.swing.*;

import fr.exia.showboard.BoardFrame;

//import controller
import controller.IOrderPerform;
import controller.UserOrder;

import model.IMap;
import model.element.mobile.IMobile;


public class GameFrame implements KeyListener{
	
    private int width = 10;
    private int height = 10;
	
	/** The initial frame size. */
    private static final int  defaultFrameSize = 700;
    
    private Rectangle view = new Rectangle(0, 0, width, height);
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
    	
    	final BoardFrame boardFrame = new BoardFrame("View");
        boardFrame.setDimension(new Dimension());
        boardFrame.setDisplayFrame(this.view);
        boardFrame.setSize(this.view.width * squareSize, this.view.height * squareSize);
        boardFrame.addKeyListener(this);
    	
    }
    
    public void paintMap(LevelMap map){
    	
    	
    	   
	   for(int i=0; i < map.getHeight(); i++) {
	       
		   for(int k=0; k < map.getWidth(); k++){
	        
			   char c = map.get;
			   Tile tile;
	        
	        switch (c){
	        
	        	case 'U':	tile = this.puffTile;
	        	case 'B':	tile = this.bubbleTile;
	        	case 'W':	tile = this.boulderTile;
	        	case 'M':	tile = this.diamondtile;
	        	case 'R':	tile = this.emptyTile;
	        	case 'M':	tile = this.mudTile;
	        	case '':	tile = this.rockfordTile;
	        	case 'T':	tile = this.tackTile;
	        	case '':	tile = this.wallTile;
	        	case 'P':	tile = this.pingTile;
	        	
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
    
    protected void loadTiles(){
    	
    	Tile puffTile = new Tile("Puffpuff");
    	Tile bubbleTile = new Tile("Bubble");
    	Tile boulderTile = new Tile("boulder");
    	Tile diamondtile = new Tile("diamond");
    	Tile emptyTile = new Tile("empty");
    	Tile mudTile = new Tile("Mud");
    	Tile rockfordTile = new Tile("rockfordface");
    	Tile tackTile = new Tile("TackyTacky");
    	Tile wallTile = new Tile("wall");
    	Tile pingTile = new Tile("Pingping");
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
	
	protected int getHeight(){
		return this.height;
	}
	
	protected int getWidth(){
		return this.width;
	}
	
	protected IMap getMap() {
		return this.map;
	}
	
	protected void setCharacter(final IMobile character) {
		this.character = character;
	}
	
	protected void setView(final Rectangle view) {
		this.view = view;
	}
	
	public void setOrderPerformer(final IOrderPerformer newPerformer) {
		this.orderPerformer = newPerformer;
	}

	protected IMobile getMyCharacter() {
		return this.myCharacter;
	}
	
	/**
	 * 
	 * @param newPawns
	 *            The pawn list.
	 */
	protected void setPawns(final ArrayList<IMobile> newPawns) {
		this.pawns = newPawns;
	}
	
	
	
	


}