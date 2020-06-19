package com.kh.test.fruit.model.vo;

public class Fruit implements java.io.Serializable{
	private String name;
	private String flavor;
	
	public Fruit() {}

	public Fruit(String name, String flavor) {
		this.name = name;
		this.flavor = flavor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public boolean equals(Fruit fruit) {
		if (this.name.equals(fruit.name) && this.flavor.equals(fruit.flavor)) {
			return true;
		}
		else return false;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", flavor=" + flavor + "]";
	}
	
}
