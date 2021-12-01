package main.factory_presentation.version2.hersteller_klassen;

import main.factory_presentation.version2.model_produkt_klassen.Pizza;

// Klasse abstract machen ..
public abstract class PizzaStore {

	// .. wegen dieser methode, die in Unterklassen die konkreten Pizzen erstellt
	// das ist die fabrikmethode: abstract Produkt fabrikmethode( optinale parameter)
	abstract Pizza createPizza(String item);

	// hier wird jetzt diese abstracte methode benutzt, statt einer einfachen Fabrik (Idiom)
	// d.h. die Superklasse weiss nicht welche Art von Pizza es sich handelt
	// sondern die Unterklasse kuemmert sich um die Objektinstanziierung
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
