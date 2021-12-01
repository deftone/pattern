package main.factory.factory_method.hersteller_klassen;

import main.factory.factory_method.produkt_klassen.Pizza;

//abstrakte hersteller klasse
//definiert die abstrakte fabrik methode, woher das pattern den namen bekommt
public abstract class Pizzaria {


    // code basiert auf einem abstrakten produkt (hier pizza), welches in unterklassen erstellt wird
    // der hersteller erfaehrt nie, welches konkretes produkt (hier pizza) erstellt wurde
    // aber diese methode ist dann fuer alle produkte gleich und wird hier implementiert
    // es kann noch weitere methoden geben, die alle auf dem prddukt operieren, welches die fabrik methode produziert hat
    public Pizza bestellePizza(String pizzaSorte) {
        Pizza pizza = erstellePizza(pizzaSorte);
        pizza.vorbereiten();
        pizza.belegen();
        pizza.backen();
        pizza.verpacken();
        pizza.scheiden();
        return pizza;
    }

    // das ist die abstrakte fabrikmethode
    // wird in den unterklassen implementiert um das EINE produkt (hier pizza) hervorzubringen
    // muss in allen unterklassen implementiert werden
    // instanziierung wird in unterklassen verlagert
    // die unterklassen entscheiden nicht zur laufzeit, welches produkt sie implementieren
    // trotzdem sagt man, die unterklassen entscheiden, welches produkt erstellt wird - eben weil
    // diese abstrakte klasse das nicht weiss
    abstract Pizza erstellePizza(String pizza);

}
