/**
 * 
 */
package entities.creatures;

import entities.abstracts.Creature;

/**
 * A dirty goblin.
 */
public class Goblin extends Creature {

    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 5231227978130473246L;

    public Goblin(long id) {
	super(id);
	setName("A dirty goblin.");
	setDescription("It is ugly and it reeks.");
    }

}
