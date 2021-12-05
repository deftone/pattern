Definition Abstrac Factory Pattern 

Das Abstract Factory Pattern bietet eine Schnittstelle zum Erstellen von 
von Familien von verwandter oder zusammenhaengender Objekte an, ohne
konkrete Klassen anzugeben.

Es stuetzt sich auf Objekt Komposition.
D.h. die Objekterstellung ist in Methoden implementiert 
hier: NYPizzaIngredientFactory
die in der Fabrik-Schnittstelle
hier: PizzaIngredientFactory
vorgegeben ist.


Zum Vergleich: Factory Pattern stuetzt sich auf Vererbung: die Objekterstellung wird
an Unterklassen deligiert, die die Fabrikmethode implementiert, welche in 
der Fabrik-Schnittstelle vorgegeben wird.
Und hier gibt es nur EIN Produkt.

Der Zweck der Abstract Factory ist es, Familien verwandter Objekte zu 
erstellen, ohne dabei von den konkreten Klassen abhaengig zu sein.

Beide Pattern foerdern lockere Bindung (reduzieren Abnaengigkeit von 
konkreten Klassen).

