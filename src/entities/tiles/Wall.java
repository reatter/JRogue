package entities.tiles;

/**
 * Functional interface for walls
 */
@FunctionalInterface
public interface Wall {

    /**
     * 
     * @return boolean if you can or cannot pass through
     */
    Boolean youShallOrShallNotPass();
}
