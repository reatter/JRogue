package prototype.engine.implementation.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import prototype.engine.implementation.GameState;

class GameStateTest {

	@Test
	void test_GetGameStateInstance_returns_nonNull_GameState_object() {
		
		GameState gameStateInstance = GameState.getGameStateInstance();
		
		assertNotNull(gameStateInstance);
	}

}
