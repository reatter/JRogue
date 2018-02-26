package entities.abstracts;

import java.io.Serializable;

/**
 * Abstract base class for the serializable <code>GameEntity</code>, held by the
 * <code>GameState</code> object.
 *
 */
public abstract class GameEntity implements Serializable {

    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = -9209968818171752736L;

    private long id;

    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
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

    public GameEntity(long id) {
	setId(id);
    }

}
