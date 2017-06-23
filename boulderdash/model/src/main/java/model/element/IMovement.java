/*
 * 
 */
package model.element;

/**
 * The Interface IMovement.
 */
public interface IMovement {

		/** The element. */
		Element element = null;
		
		/**
		 * Move up.
		 */
		public void moveUp();
		
		/**
		 * Move down.
		 */
		public void moveDown();
		
		/**
		 * Move right.
		 */
		public void moveRight();
		
		/**
		 * Move left.
		 */
		public void moveLeft();
		
		/**
		 * Gravity.
		 */
		public void gravity();
	

}
