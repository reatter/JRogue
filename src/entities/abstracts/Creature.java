package entities.abstracts;

import entities.menues.Inventory;

/**
 * Superclass for all <code>Creature</code>-types
 * 
 *
 */
public abstract class Creature extends GameEntity {

    public Creature(long id) {
	super(id);
    }

    private int hp;

    private Inventory inventory;

    public int getHp() {
	return hp;
    }

    public void setHp(int hp) {
	this.hp = hp;
    }

    public Inventory getInventory() {
	return inventory;
    }

    public void setInventory(Inventory inventory) {
	this.inventory = inventory;
    }

}
