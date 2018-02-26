package entities.tiles;

import entities.abstracts.GameTile;

public class EmptyTile extends GameTile {

    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 8287824067801100310L;

    public EmptyTile(long id, int x, int y, int depth) {
	super(id, x, y, depth);
	setName("An empty tile.");
	setDescription("There is nothing here.");
    }

}
