Definition Factory Pattern oder Factory Method-Muster

Das Factory Method-Muster definiert eine 
Schnttstelle zur Erstellung eines Objekts,
laesst aber die die Unterklassen entscheiden, 
welche Klassen instantiiert werden. 

Factory Method ermoeglicht einer Klasse,
die Instatiierung in Unterklassen zu verlagern.
-> Die Implementierung des Produkts wird von seiner Verwendung 
entkoppelt. 
-> Produkte koennen variiert werden.

Die abstrakte Herstellerklasse bietet eine Schnittstelle
mit einer Methode zum Erstellen von Objekten:

abstract Produkt fabrikmethode( optionale parameter)

Hier:

abstract Pizza createPizza(String item)

Die optionalen Parameter kann man typsicherer machen (zB Enum) als hier
gezeigt.



Alle anderen Methoden in der abstrakten Klasse nutzen dann
dieses erzeugte Objekt.

Hier:

public Pizza orderPizza(String type) {...}

---

Das Factory Pattern erfuellt das Entwurfsprinzip "Dependency Inversion
Principle" -> auf Abstraktionen und nicht auf konkrete Klassen stuetzen!

Hier: sowohl PizzaStore (hochstufige Komponente), als auch konkrete Pizzaklassen 
(niedrigstufige Komponenten) sind von der abstrakten Pizza abhaengig.

Richtlinien zur Befolgung des Musters:

* kein new verwenden (keine Variable soll Referenz auf konkrete Klasse haben)
hier: PizzaStore nutzt kein new
gerade diese wird aber irgendwann verletzt, hier in NYPizzaStore

* nur von Interfaces oder abstrakten Klassen ableiten (sonst von konkreter Klasse
abhaengig)
hier: abstrakte Pizza/NYStyleVeggiePizza

* eine implementierte Methode einer Basisklasse nicht ueberschreiben (dann ist die 
Basisklasse keine Abstraktion) 
hier: NYPizzaStore sollte orderPizza() nicht ueberschreiben

