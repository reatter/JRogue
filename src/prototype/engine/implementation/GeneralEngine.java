package prototype.engine.implementation;

import prototype.engine.abstracts.GeneralGameLoop;

/**
 * Abstract class with the general abstract methods that a game engine should provide:
 * <br>
 * 1) <code>GeneralEngine#update()</code>
 * <br>
 * 2) <code>GeneralEngine#draw()</code>
 * <br>
 * 3) <code>GeneralEngine#handlePlayerInput()</code>
 * <p>
 * Also contains the Singleton GameState and the Singleton GameLoop as a field.
 *  
 * @author Michael Lannert
 * 
 *
 */
public abstract class GeneralEngine {
	
	GameState gameState;
	
	GeneralGameLoop gameLoop;
	
	/**
	 * Updates the <code> GameState </code>.
	 */
	public abstract void update(GameState gameState);
	
	/**
	 * Draws the <code> GameState </code>.
	 */
	public abstract void draw(GameState gameState);
	
	/**
	 * Handles all player input.
	 */
	public abstract void handlePlayerInput(GameState gameState);
	
	

}
