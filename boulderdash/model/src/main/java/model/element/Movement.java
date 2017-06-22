package model.element;


public class Movement implements IMovement{

	private Element element;
	
	public Movement(Element element){
		this.element = element;
	}
	
	public void moveUp(){
		
	}
	
	public void moveDown(){
		
	}
	
	public void moveRight(){
		
		int x = this.element.getPosition().getX();
		int y = this.element.getPosition().getY();
		
		this.element.getPosition().setX(x+1);
		
		this.element.getMe().getElements()[x+1][y] = this.element;
		this.element.getMe().getElements()[x][y] = null;
		
		this.element.getMe().getModel().effectiveChanged();
	}
	
	public void moveLeft(){
		
	}	
	
	public void gravity(){
		
	}
}
