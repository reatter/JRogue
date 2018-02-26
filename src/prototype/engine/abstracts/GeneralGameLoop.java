/**
 * 
 */
package prototype.engine.abstracts;

import prototype.engine.implementation.GameState;

/**
 * 
 * General GameLoop for GameEnginge.
 * 
 * 
 * 
 *
 */
@FunctionalInterface
public interface GeneralGameLoop {
	
	/**
	 * Runs the GameLoop.
	 */
	public abstract void run(GameState gameState);

}
