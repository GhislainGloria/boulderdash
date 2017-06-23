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
import fr.exia.showboard.ISquare;
import model.element.Element;
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
    private LevelMap map;
    
    /**  The character. */
    private IMobile character;
    
    /**  The array of monsters. */
    private ArrayList<Element> elements;
    
    /**  The BoardFrame. */
	final BoardFrame boardFrame = new BoardFrame("View");
	
    /**
     *  Load the tiles, so that each tile of the frame is just 
     *   a copy of these ones, memory saved!.
     */
	Tile boulderTile = new Tile("boulder");
	Tile diamondTile = new Tile("diamond");
	Tile emptyTile = new Tile("empty");
	Tile mudTile = new Tile("Mud");
	Tile wallTile = new Tile("wall");
    
    

    /**
     *  Constructor.
     */
    public GameFrame(){
    	this.initBoardFrame();
    	this.paintMap(map);
    }
    
   




	/**
     *  Initiates the board frame with parameters, adds a key listener.
     */
    private void initBoardFrame() throws NullPointerException{
    	
        boardFrame.setDimension(new Dimension());
        boardFrame.setDisplayFrame(this.view);
        boardFrame.setSize(this.view.width * squareSize, this.view.height * squareSize);
        boardFrame.addKeyListener(this);
        
//        boardFrame.addPawn((IPawn) map.getRockFord());
		
        for (Element monster : map.getMonsters()) {
			boardFrame.addPawn((IPawn) monster);
		}
		
		for (Element objet : map.getObjects()) {
			boardFrame.addPawn((IPawn) objet);
		}
		
//		this.getMap().getObservable().addObserver(boardFrame.getObserver());

		
    	
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
	        
			 boardFrame.addSquare((ISquare) map.getElement(i, k), i, k);
			 
		   } 

	  }
    	
    	boardFrame.setVisible(true);
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
	
	 private void setMap(LevelMap map) {
			this.map = map;
			
		}
	
	/**
	 *  Sets the Order Performer .
	 *
	 * @param newPerformer the new order performer
	 */
	public void setOrderPerformer(final IOrderPerform performer) {
		this.orderPerform = performer;
	}

	/**
	 * Gets the character.
	 *
	 * @return the character
	 */
	protected IMobile getCharacter() {
		return this.character;
	}
	

	
}