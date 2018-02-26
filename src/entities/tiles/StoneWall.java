package entities.tiles;

import entities.abstracts.GameTile;

public class StoneWall extends GameTile implements Passable {

    public StoneWall(long id, int x, int y, int depth) {
	super(id, x, y, depth);
	// TODO Auto-generated constructor stub
    }

    @Override
    public Boolean isPassable() {
	// there be phasing logic and dragons here!
	return false;
    }

}
