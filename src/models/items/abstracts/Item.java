/**
 * 
 */
package models.items.abstracts;

/**
 * @author Michael Lannert
 *
 */
public abstract class Item {
	
	private String Name;
	
	private String Description;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
	
	
	

}
