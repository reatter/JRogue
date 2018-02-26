package entities.tiles;

import entities.abstracts.GameTile;

public class StoneWall extends GameTile implements Wall {

    public StoneWall(long id, int x, int y, int depth) {
	super(id, x, y, depth);
	// TODO Auto-generated constructor stub
    }

    @Override
    public Boolean youShallOrShallNotPass() {
	// there be phasing logic and dragons here!
	return false;
    }

}
