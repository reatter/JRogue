/**
 * 
 */
package prototype.engine.implementation;

/**
 * Singleton class <code>GeneralGameState</code>, which contains a list of all <code>GameEntity</code>, 
 * which have to to be updated, drawn, and later, serialized.
 * 
 *

 */
public final class GameState {
	
	/**
	 * Singleton instance of <code>GeneralGameState</code>.
	 */
	private static volatile GameState gameStateInstance = null;
	
	/**
	 * Stops <code>new GeneralGameState()</code> from being accessible.
	 */
	private GameState() {}
	
	/**
	 * getter for the <code>GeneralGameState</code>. Also initiates the <code>GeneralGameState</code>, if it was null.
	 * @return <code>GeneralGameState</code>
	 */

	public static GameState getGameStateInstance() {
		
		// double-checked locking
		if(gameStateInstance == null) {
			synchronized(GameState.class) {
				if(gameStateInstance == null) {
					gameStateInstance = new GameState();
				}
			}
		}
		return gameStateInstance;
	}
	

}
