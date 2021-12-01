package test.factory;

import main.factory.factory_method.hersteller_klassen.KoelnPizzaria;
import main.factory.factory_method.hersteller_klassen.Pizzaria;
import main.factory.factory_method.produkt_klassen.Pizza;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PizzaTest {

    @Test
    void xxx(){
        //zuerst brauchen wir die pizzaria, damit wir bestellen koennen
        Pizzaria koelnPizzaria = new KoelnPizzaria();
        //die bestell methode der pizzaria erstellt die pizza und kuemmert sich um alles
        Pizza pizza = koelnPizzaria.bestellePizza("veggi");
        Assertions.assertEquals("koelsche veggi vorbereiten", pizza.getIsVorbereitet());
        Assertions.assertEquals("pizza backen", pizza.getIsGebacken());
        Assertions.assertEquals("pizza verpacken", pizza.getIsVerpackt());
        Assertions.assertEquals("pizza schneiden", pizza.getIsGeschnitten());
    }

}
