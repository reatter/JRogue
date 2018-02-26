/**
 * 
 */
package entities.creatures;

import entities.abstracts.Creature;

/**
 * A mere mortal.
 */
public class Human extends Creature {

    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = -3767344699961536763L;

    public Human(long id) {
	super(id);
	setName("Just human.");
	setDescription("A mere mortal man, goallessly gallivanting in deep dungeons.");
    }

}
