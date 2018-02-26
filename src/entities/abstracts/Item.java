/**
 * 
 */
package entities.abstracts;

/**
 *
 */
public abstract class Item extends GameEntity {

    public Item(long id) {
	super(id);
    }

    private String Name;

    private String Description;

    public String getName() {
	return this.Name;
    }

    public void setName(String name) {
	this.Name = name;
    }

    public String getDescription() {
	return this.Description;
    }

    public void setDescription(String description) {
	this.Description = description;
    }

}
