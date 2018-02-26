/**
 * 
 */
package entities.items;

import entities.abstracts.Item;

/**
 * Gold.
 * 
 *
 */
public class Gold extends Item {

    public Gold(long id) {

	super(id);

	this.setName("Gold");

	this.setDescription("A piece of the shiny and valueable metal. It glitters yellow and is cold to the touch.");

    }

}
