package main.strategy;

public class StandardEnte extends Ente {

    public StandardEnte(){
        // nicht ideal im konstruktor new aufzurufen
        quakVerhalten = new Quaken();
    }
}
