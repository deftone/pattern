package main.factory_presentation.version1;

import main.factory_presentation.version1.pizza.Pizza;

public class PizzaTestDrive_2 {
 
	public static void main(String[] args) {
		System.out.println("\nTestdrive 2 mit Idiom\n");
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore_2 store = new PizzaStore_2(factory);

		Pizza pizza = store.orderPizza("pepperoni");
		System.out.println("We ordered a " + pizza.getName() + "\n");

		pizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
	}
}
