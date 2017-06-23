package view;

import java.awt.Dimension;

import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import java.util.ArrayList;

import javax.swing.*;

import fr.exia.showboard.BoardFrame;
import fr.exia.showboard.IPawn;
//import controller
import controller.IOrderPerform;
import controller.UserOrder;

import model.IMap;
import model.element.mobile.IMobile;


// TODO: Auto-generated Javadoc
/**
 * The Class GameFrame.
 */
public class GameFrame implements KeyListener{
	
    /** The width. */
    private int width = 10;

    /** The height. */
    private int height = 10;
	
	/** The initial frame size. */
    private static final int  defaultFrameSize = 700;
    
    /** The view. */
    private Rectangle view = new Rectangle(0, 0, width, height);
    
    
    /** The Constant squareSize. */
    private static final int squareSize = 50;
    
//    private IOrderPerform  orderPerform;
    
    /**  The map. */
    private IMap map;
    
    /**  The character. */
    private IMobile character;
    
    /**  The array of monsters. */
    private ArrayList<IMobile> monsters;
    
    /**  The BoardFrame. */
    final BoardFrame boardFrame;
    
    

    /**
     *  Constructor.
     *
     * @param map the map
     * @param character the character
     * @param monsters the monsters
     */
    public GameFrame(final IMap map, final IMobile character, final ArrayList<IMobile> monsters){
    	this.setMap(map);
    	this.setCharacter(character);
    	this.setMonsters(monsters);
    	this.initBoardFrame();
    }
    
    /**
     *  Initiates the board frame with parameters, adds a key listener.
     */
    private void initBoardFrame(){
    	
    	boardFrame = new BoardFrame("View");
        boardFrame.setDimension(new Dimension());
        boardFrame.setDisplayFrame(this.view);
        boardFrame.setSize(this.view.width * squareSize, this.view.height * squareSize);
        boardFrame.addKeyListener(this);
        
        
        
        for (int x = 0; x < this.getMap().getWidth(); x++) {
			for (int y = 0; y < this.getMap().getHeight(); y++) {
				boardFrame.addSquare(this.map.getOnTheMapXY(x, y), x, y);
			}
		}
        
        boardFrame.addPawn(this.getCharacter());
		for (IMobile monster : this.monsters) {
			boardFrame.addPawn(monster);
		}
    	
    }
    
    /**
     *  Paint the map according to the map design
     * 	  monsters and character are generated.
     *
     * @param map the map
     * @return void
     */
    public void paintMap(LevelMap map){
    	   
    	for(int i=0; i < map.getHeight(); i++) {
	       
		   for(int k=0; k < map.getWidth(); k++){
	        
			   char c = map.getCharacter(i, k);
			   
			   Tile tile;
			   IMobile monster = null;
	        
//TO-DO changer les caracteres + monstre creuse mud? + adapter nom monstres
			   
	        switch (c){
	        
	        	case 'R':	tile = this.boulderTile;
	        		break;
	        	case 'O':	tile = this.diamondtile;
	        		break;
	        	case 'B':	tile = this.emptyTile;
	        		break;
	        	case 'M':	tile = this.mudTile;
	        		break;
	        	case 'W':	tile = this.wallTile;		
	        		break;
	        	case 'B':	tile = this.emptyTile	
	        				monster = this.bubble;		
        		break;
	        	case 'P':	tile = this.emptyTile
        					monster = this.pingPing;		
	        	break;
	        	case 'U':	tile = this.emptyTile
	    					monster = this.puffPuff;		
	        	break;
	        	case 'T':	tile = this.emptyTile
	    					monster = this.tackyTacky;		
	        	break;
        		default:	tile = this.emptyTile;	
	        	
	        }
	        
	        boardFrame.addSquare(tile, i, k);
	        
	        if(monster != null){
	        	this.monsters.add(monster);
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
    
    /**
     *  Load the tiles, so that each tile of the frame is just 
     *   a copy of these ones, memory saved!.
     */
    protected void loadTiles(){
    	
    	Tile boulderTile = new Tile("boulder");
    	Tile diamondTile = new Tile("diamond");
    	Tile emptyTile = new Tile("empty");
    	Tile mudTile = new Tile("Mud");
    	Tile wallTile = new Tile("wall");
    	
    	IMobile bubble = new IMobile()
    	

    }
    
	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 *  Get the map.
	 *
	 * @return map
	 */
	protected IMap getMap() {
		return this.map;
	}
	
	/**
	 *  Sets the character .
	 *
	 * @param character the new character
	 */
	protected void setCharacter(final IMobile character) {
		this.character = character;
	}
	
	/**
	 *  Sets the view .
	 *
	 * @param view the new view
	 */
	protected void setView(final Rectangle view) {
		this.view = view;
	}
	
	/**
	 *  Sets the Order Performer .
	 *
	 * @param newPerformer the new order performer
	 */
	public void setOrderPerformer(final IOrderPerformer newPerformer) {
		this.orderPerformer = newPerformer;
	}

	/**
	 * Gets the character.
	 *
	 * @return the character
	 */
	protected IMobile getCharacter() {
		return this.character;
	}
	
	/**
	 * Sets the monsters.
	 *
	 * @param monsters the new monsters
	 */
	protected void setMonsters(final ArrayList<IMobile> monsters) {
		this.monsters = monsters;
	}
	
}