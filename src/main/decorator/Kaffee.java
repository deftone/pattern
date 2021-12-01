package main.decorator;

public class Kaffee extends Getraenk {

    public Kaffee(){
        beschreibung = "Kaffee";
    }

    @Override
    public double getPreis() {
        return 2.99;
    }
}
