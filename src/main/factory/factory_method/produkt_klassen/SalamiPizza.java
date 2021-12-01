package main.factory.factory_method.produkt_klassen;

import main.factory.abstrac_factory.zutaten_klassen.hersteller_klassen.PizzaZutatenFabrik;

//achtung: hier mischt schon das abstrakte factory muster rein!
//ohne muessen hier viele klassen gedoppelt werden, koelnerSalami, achenerSalami etc


//wir brauchen durch die zutaten fabrik nur noch eine klasse fuer salami pizza,
// da die unterschiede ja nur in den zutaten sind, die jetzt in die zutaten fabrik ausgelagert wurden
// daher keine regionalen salami pizza klassen mehr
public class SalamiPizza extends Pizza {

    PizzaZutatenFabrik zutatenFabrik;

    public SalamiPizza(PizzaZutatenFabrik zutatenFabrik){
        this.zutatenFabrik = zutatenFabrik;
    }

    @Override
    public void vorbereiten() {
        //in den konkreten pizza klassen werden die vorbereitungsschritte ausgefuehrt
        //die sind fuer salami immer gleich
        //die entsprechende fabrik sorgt aber dann fuer den regional richtigen teig etc
        //der pizzaklasse ist das aber egal, welche regionale art salami auf die salami pizza kommt
        teig = zutatenFabrik.erstelleTeig();
        kaese = zutatenFabrik.erstelleKaese();
        salami = zutatenFabrik.erstelleSalami();
        isVorbereitet = name + " vorbereiten";
    }
}
