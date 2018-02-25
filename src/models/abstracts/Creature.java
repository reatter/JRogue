package models.abstracts;

import models.menues.Inventory;

public abstract class Creature {
	
	private int hp;
	
	private int id;
	
	private Inventory inventory;

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
	

}
