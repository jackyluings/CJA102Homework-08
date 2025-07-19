package hw7;

import java.io.Serializable;

public abstract class Animal implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;

	public Animal() {

	}

	public Animal(String name) {
		this.setName(name);
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract void speak();
}
