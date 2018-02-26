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
