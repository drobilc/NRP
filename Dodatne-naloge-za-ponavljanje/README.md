# Dodatne naloge za ponavljanje

## 1. Naloga
Izdelajte rekurzivno metodo, ki obrne znake v poljubnem nizu.

Npr. `Danes je lep dan.` -> `.nad pel ej senaD`

Glava metode naj ima obliko: `String reverse(String str, int index)`

## 2. Naloga
Problem s Hanojskimi stolpiči je klasičen rekurzivni problem, ki temelji na preprosti igri. Imamo tri palice. Na eni je sklad plošcic z različnimi premeri.

Cilj igre: Prestaviti vse plošcice na desno palico ob upoštevanju naslednjih pravil:
 * Nobena plošcica ne sme biti nikoli na vrhu manjše plošcice.
 * Naenkrat smemo premikati le po eno plošcico.
 * Vsako plošcico moramo vedno odložiti na eno od palic, nikoli ob strani.
 * Premaknemo lahko vedno le plošcico, ki je na vrhu nekega stolpica.

Zgodba pravi, da bi za fizičen premik 64 ploščic iz ene palice na drugo potrebovali toliko časa, da bi prej bil konec sveta.

**Izdelajte rekurzivno metodo, ki bo simulirala premike ploščic.**

Na podlagi izdelane rekurzivne metode izdelajte časovno analizo za premik 3., 4., ... in 25ih ploščic. Rezultate analiza zapišite v datoteko.

Primer zapisa naj bo:

Št. ploščic | Čas[ms] | Čas[min:sec:ms]
----------- | ------- | ---------------
3 | 1 | 0:0:1
... | ... | ...
25 | 1705112 | 28:25:112
