package main.decorator;

public class Kakao extends Getraenk {

    public Kakao(){
        beschreibung = "Kakao";
    }

    @Override
    public double getPreis() {
        return 1.99;
    }
}
