package entities.tiles;

import entities.abstracts.GameTile;

public class StoneWall extends GameTile implements Passable {

    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = -2130438095293803021L;

    public StoneWall(long id, int x, int y, int depth) {
	super(id, x, y, depth);
	setName("The plain old Stone Wall.");
	setDescription("Impenetrable and firm wall of stone.");
    }

    @Override
    public Boolean isPassable() {
	// there be phasing logic and dragons here!
	return false;
    }

}
