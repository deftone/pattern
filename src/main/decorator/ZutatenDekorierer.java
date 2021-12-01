package main.decorator;

// weil die zutaten das getraenk austauschen muessen muss Getraenk erweitert werden
public abstract class ZutatenDekorierer extends Getraenk{

    @Override
    public abstract String getBeschreibung();
}
