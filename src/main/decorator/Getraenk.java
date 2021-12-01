package main.decorator;

public abstract class Getraenk {

    String beschreibung = "";

    public String getBeschreibung() {
        return beschreibung;
    }

    public abstract double getPreis();
}
