package main.strategy;

public interface QuakVerhalten {
    //hier ist das veraenderliche verhalten, jede ente macht ein anderes geraeusch
    //daher ein interface, welches in den konkreten Quaken-klassen implementiert wird
    //welche wiederum die konkreten entenklassen nutzen (oder auch ganz andere klassen koennen das nutzen, zB ein frosch
    String quak();
}
