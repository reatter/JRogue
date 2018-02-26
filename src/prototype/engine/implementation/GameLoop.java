/**
 * 
 */
package prototype.engine.implementation;

import prototype.engine.abstracts.GeneralGameLoop;

/**
 *
 */
public class GameLoop implements GeneralGameLoop {

    @Override
    public void run(GameState gameState) {

	gameState = GameState.getGameStateInstance();

    }

}
