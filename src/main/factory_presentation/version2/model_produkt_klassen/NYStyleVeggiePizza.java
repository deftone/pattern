package main.factory_presentation.version2.model_produkt_klassen;

public class NYStyleVeggiePizza extends Pizza {

	public NYStyleVeggiePizza() {
		name = "NY Style Veggie Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";

		toppings.add("Sliced tomato");
		toppings.add("Sliced zucchini");
		toppings.add("Sliced green pepper");
	}
}
