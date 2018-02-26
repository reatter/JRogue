/**
 * 
 */
package entities.creatures;

import entities.abstracts.Creature;

/**
 * A mere mortal.
 */
public class Human extends Creature {

    public Human(long id) {
	super(id);
	setName("Just human.");
	setDescription("A mere mortal man, goallessly gallivanting in deep dungeons.");
    }

}
