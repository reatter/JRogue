/**
 * 
 */
package entities.creatures;

import entities.abstracts.Creature;

/**
 * A dirty goblin.
 */
public class Goblin extends Creature {

    public Goblin(long id) {
	super(id);
	setName("A dirty goblin.");
	setDescription("It is ugly and it reeks.");
    }

}
