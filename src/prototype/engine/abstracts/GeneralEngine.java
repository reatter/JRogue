package prototype.engine.abstracts;

/**
 * Abstract class with the general abstract methods that a game engine should provide:
 * <br>
 * 1) Engine#update()
 * <br>
 * 2) Engine#draw()
 * <br>
 * 3) Engine#playerInput()
 * 
 * Also contains the GeneralGameState as a field.
 *  
 * @author Michael Lannert
 * 
 *
 */
public abstract class GeneralEngine {
	
	GeneralGameState gameState;
	
	public abstract void update();
	
	public abstract void draw();
	
	public abstract void playerInput();
	
	

}
