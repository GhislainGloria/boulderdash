package view;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import controller.IOrderPerform;
import controller.UserOrder;
import fr.exia.showboard.BoardFrame;
import fr.exia.showboard.IPawn;
import model.element.ILevelMap;
import model.element.LevelMap;
import model.element.mobile.IMobile;
import model.element.mobile.Mobile;


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
    
    private IOrderPerform  orderPerform;
    
    /**  The map. */
    private ILevelMap map;
    
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
    public GameFrame(final ILevelMap map, final IMobile character, final ArrayList<IMobile> monsters){
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
        
        
        
        boardFrame.addPawn((IPawn) this.getCharacter());
		for (IMobile monster : this.monsters) {
			boardFrame.addPawn((IPawn) monster);
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
    	   
    	for(int i=0; i < map.getDimension().getHeight(); i++) {
	       
		   for(int k=0; k < map.getDimension().getWidth(); k++){
	        
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
	        	case 'B':	tile = this.emptyTile;	
	        				monster = this.bubble;		
        		break;
	        	case 'P':	tile = this.emptyTile;
        					monster = this.pingPing;		
	        	break;
	        	case 'U':	tile = this.emptyTile;
	    					monster = this.puffPuff;		
	        	break;
	        	case 'T':	tile = this.emptyTile;
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
     * @param <UserOrder>
     *
     * @param keyCode
     *            the key code
     * @return the user order
     */
    protected UserOrder keyCodeToUserOrder(final int keyCode) {
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
	protected ILevelMap getMap() {
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
	public void setOrderPerformer(final IOrderPerform performer) {
		this.orderPerformer = performer;
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