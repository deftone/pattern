package main.factory_presentation.version3.zutaten_abstract_factory.fabriken;

import main.factory_presentation.version3.zutaten_abstract_factory.produkt_familie.Cheese;
import main.factory_presentation.version3.zutaten_abstract_factory.produkt_familie.Dough;
import main.factory_presentation.version3.zutaten_abstract_factory.produkt_familie.Sauce;
import main.factory_presentation.version3.zutaten_abstract_factory.produkt_familie.Veggies;

// dieses Interface ist die Schnittstelle, die definiert, wie man eine Familie verwandter Produkte erstellt
// hier: alles was wir brauchen um eine Pizza zu erstellen
public interface PizzaIngredientFactory {
 
	Dough createDough();
	Sauce createSauce();
	Cheese createCheese();
	Veggies[] createVeggies();

}
