package main.factory_presentation.version3.produkte;

import main.factory_presentation.version3.zutaten.Cheese;
import main.factory_presentation.version3.zutaten.Dough;
import main.factory_presentation.version3.zutaten.Sauce;
import main.factory_presentation.version3.zutaten.Veggies;

public abstract class Pizza {
	String name;

	Dough dough;
	Sauce sauce;
	Veggies[] veggies;
	Cheese cheese;

	abstract public void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
