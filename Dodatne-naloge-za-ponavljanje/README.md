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

## 3. Naloga
Podan imamo postopek kodiranja besed. Za predstavljen algoritem velja, da zakodira besedo, sestavljeno iz samih velikih črk, ostalih znakov na vhodu ne pričakuje in jih zato ni potrebno obravnavati.

Kodiranje pričnemo na začetku besede. Vzamemo par znakov in s prvim znakom zakodiramo drugega. Vrstni red znakov je enak kot v angleški abecedi, šteti pa začnemo z 0:
```
A = 0
B = 1
...
Z = 25
```
Kodirati začnemo vedno od začetka besede. Prvi znak v besedi ostane nespremenjen. Ostale znake zakodiramo tako, da vzamemo par znakov znakov in s prvim zakodiramo drugega tako, da njegovi zaporedni številki prištejemo zaporedno številko prvega znaka (glej primer). V kolikor je vsota zunaj obsega abecede, upoštevamo ostanek pri deljenju s številom znakov v abecedi (v našem primeru jih je 26). V naslednjem koraku vzamemo naslednji par znakov, pri čemer moramo upoštevati, da smo enega že zakodirali in takšnega tudi uporabimo. 

Dopolnite spodnji program tako, da definirate vse tri prazne metode, ki morajo ustrezati opisanemu postopku kodiranja.
```java
public class NalogaKodiranje {
  public static void main(String[] args) {
    String original = "SKRIVNOST";
    System.out.println(original);
    System.out.println(rekurzivnoKodiraj(original));
    System.out.println(iterativnoKodiraj(original));
  }

  /* Metoda kot vhod prejme dva znaka in vrne znak vhod, zakodiran z znakom kljuc */
  private static char kodiraj(char kljuc, char vhod) {
    //Vpiši kodo tukaj
  }

  /* Metoda kot vhod prejme niz in ga rekurzivno zakodira s pomočjo metode kodiraj */
  private static String rekurzivnoKodiraj(String niz) {
    //Vpiši kodo tukaj
  }

  /* Metoda kot vhod prejme niz in ga iterativno zakodira s pomočjo metode kodiraj */
  private static String iterativnoKodiraj(String niz) {
    //Vpiši kodo tukaj
  }
}
```

Primeri izpisov:

`SKRIVNOST` -> `SCTBWJXPI`

`PROGRAMIRANJE` -> `PGUARRDLCCPYC`

`ALGORITEM` -> `ALRFWEXBN`
