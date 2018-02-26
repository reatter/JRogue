package entities.tiles;

/**
 * Functional interface for walls
 */
@FunctionalInterface
public interface Passable {

    /**
     * 
     * @return boolean if you can or cannot pass through
     */
    Boolean isPassable();
}
