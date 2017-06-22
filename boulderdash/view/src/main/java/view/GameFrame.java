package view;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import fr.exia.showboard.BoardFrame;
//import controller



public class GameFrame implements KeyListener{
	
    private int width = 10;
    private int height = 10;
	
	/** The initial frame size. */
    private static final int  defaultFrameSize = 700;
    
    private Rectangle        fullView= new Rectangle(0, 0, width, height);
    private static final int squareSize = 50;
    
//    private IOrderPerform  orderPerform;



 
    public GameFrame(){
    	this.initBoardFrame();
    }
    
    private void initBoardFrame(){
    	
    	final BoardFrame boardFrame = new BoardFrame("Full view");
        boardFrame.setDimension(new Dimension());
        boardFrame.setDisplayFrame(this.fullView);
        boardFrame.setSize(this.fullView.width * squareSize, this.fullView.height * squareSize);
        boardFrame.setHeightLooped(true);
        boardFrame.addKeyListener(this);
        boardFrame.setFocusable(true);
        boardFrame.setFocusTraversalKeysEnabled(false);
    	
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