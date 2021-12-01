package main.factory.factory_method.produkt_klassen;

import main.factory.abstrac_factory.zutaten_klassen.produkt_klassen.Gemuese;
import main.factory.abstrac_factory.zutaten_klassen.produkt_klassen.Kaese;
import main.factory.abstrac_factory.zutaten_klassen.produkt_klassen.Salami;
import main.factory.abstrac_factory.zutaten_klassen.produkt_klassen.Teig;

import java.util.ArrayList;
import java.util.List;

// das ist die abstrakte fabrik, denn sie produziert die produkte, hier pizzen
public abstract class Pizza {

    public String name;
    List<String> belaege = new ArrayList<>();
    // die zutaten sind keine strings mehr, sondern interfaces, die durch die fabriken geliefert werden
    Teig teig;
    Salami salami;
    Kaese kaese;
    Gemuese gemuese;

    public String isVorbereitet;
    String isBelegt = "";
    String isGebacken = "";
    String isVerpackt = "";
    String isGeschnitten = "";

    //diese methode ist jetzt abstrakt
    //denn die zutaten kommen von den zutaten fabriken
    public abstract void vorbereiten();

    public void belegen() {
        StringBuilder sb = new StringBuilder("pizza belegen mit ");
        for (String belag : belaege) {
            sb.append(belag).append(" ");
        }

        isBelegt = sb.toString();
    }

    public void backen() {
        isGebacken = "pizza backen";
    }

    public void verpacken() {
        isVerpackt = "pizza verpacken";
    }

    public void scheiden() {
        isGeschnitten = "pizza schneiden";
    }


    public String getIsVorbereitet() {
        return isVorbereitet;
    }

    public String getIsBelegt() {
        return isBelegt;
    }

    public String getIsGebacken() {
        return isGebacken;
    }

    public String getIsVerpackt() {
        return isVerpackt;
    }

    public String getIsGeschnitten() {
        return isGeschnitten;
    }
}
