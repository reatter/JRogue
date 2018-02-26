package entities.abstracts;

import java.awt.Point;

/**
 * Abstract superclass for all <code>GameTiles</code>. All
 * <code>GameTiles</code> have a field <code>Point location (x,y)</code> and a
 * <code>int depth</code>.
 */
public class GameTile extends GameEntity {

    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = -8170169483487216213L;

    private Point location;

    private int depth;

    public Point getLocation() {
	return this.location;
    }

    public void setLocation(Point location) {
	this.location = location;
    }

    public int getDepth() {
	return this.depth;
    }

    public void setDepth(int depth) {
	this.depth = depth;
    }

    public GameTile(long id, int x, int y, int depth) {
	super(id);
	location.setLocation(x, y);
	this.setDepth(depth);
    }

}
