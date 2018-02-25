package prototype.engine.abstracts;

/**
 * Abstract class with the general abstract methods that a game engine should provide:
 * <br>
 * 1) <code>GeneralEngine#update()</code>
 * <br>
 * 2) <code>GeneralEngine#draw()</code>
 * <br>
 * 3) <code>GeneralEngine#handlePlayerInput()</code>
 * <p>
 * Also contains the GeneralGameState and the GeneralGameLoop as a field.
 *  
 * @author Michael Lannert
 * 
 *
 */
public abstract class GeneralEngine {
	
	GeneralGameState gameState;
	
	GeneralGameLoop gameLoop;
	
	/**
	 * Updates the <code> GeneralGameState </code>.
	 */
	public abstract void update();
	
	/**
	 * Draws the <code> GeneralGameState </code>.
	 */
	public abstract void draw();
	
	/**
	 * Handles all player input.
	 */
	public abstract void handlePlayerInput();
	
	

}
