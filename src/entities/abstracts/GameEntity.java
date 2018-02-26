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

    private String name = "";

    private String description = "";

    public String getName() {
	return this.name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getDescription() {
	return this.description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public GameEntity(long id) {
	setId(id);
    }

}
