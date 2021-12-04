package main.factory_presentation.version1.pizza;

public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        name = "Veggie Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Sliced tomato");
        toppings.add("Sliced zucchini");
        toppings.add("Diced onion");
        toppings.add("Sliced red pepper");
    }
}
