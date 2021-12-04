package main.factory_presentation.version1;

import main.factory_presentation.version1.pizza.Pizza;

public class PizzaTestDrive_1 {
 
	public static void main(String[] args) {
		System.out.println("\nTestdrive 1 vorher\n");
		PizzaStore_1 store = new PizzaStore_1();

		Pizza pizza = store.orderPizza("pepperoni");
		System.out.println("We ordered a " + pizza.getName() + "\n");

		pizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
	}
}
