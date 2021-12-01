package main.strategy;

public class QuitschEnte extends Ente {

    public QuitschEnte(){
        // nicht ideal im konstruktor new aufzurufen
        quakVerhalten = new Quitschen();
    }
}
