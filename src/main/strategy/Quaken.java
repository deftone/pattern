package main.strategy;

public class Quaken implements QuakVerhalten {

    // kann von allen konkreten entenklassen benutzt werden, wo es passt oder auch bei einer froschklasse
    @Override
    public String quak() {
        return "quak";
    }
}
