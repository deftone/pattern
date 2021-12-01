package main.strategy;

public class Ente {

    //alles was sich aendern kann als Interface einbinden
    protected static QuakVerhalten quakVerhalten;

    public String quak() {
        // es wird auf der schnittstelle, dem interface implementiert
        return quakVerhalten.quak();
    }

    // was fuer alle gleich ist und sich nicht aendern wird als methode in superklasse
    public String getNase() {
        return "schnabel";
    }

}
