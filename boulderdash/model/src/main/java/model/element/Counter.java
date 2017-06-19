package model.element;

/**
 * <h1>The class Counter count the number of diamond, life and pts.</h1>
 *
 * @author Ghislain Gloria
 * @version 1.0
 */

public class Counter {
	private int diamond = 0;
	private int life = 0;
	private int score = 0;
	
	public Counter(){
		
	}
	
	public int getDiamond() {
		return diamond;
	}
	
	public void setDiamond(int diamond) {
		this.diamond = diamond;
	}
	
	public int getLife() {
		return life;
	}
	
	public void setLife(int life) {
		this.life = life;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
}
