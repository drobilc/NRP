# Naloge za preverjanje znanja

## [1. Naloga](https://github.com/drobilc/NRP/blob/master/Naloge-za-ponavljanje/Naloga01.java)
Napiši programe, ki izpišejo na zaslon zvezdice 
```
*****   
****    
***     
**      
*
```
* s stavkom *for* 
* s stavkom *while* 
* s stavkom *do ... while*

```
*****
 ****
  ***
   **
    *   
```
* s stavkom *for* 
* s stavkom *while* 
* s stavkom *do ... while*


## [2. Naloga](https://github.com/drobilc/NRP/blob/master/Naloge-za-ponavljanje/Naloga02.java)
Deklariraj dvodimenzijsko celoštevilčno tabelo dimenzij `10x10`
* Izdelaj metodo, ki napolni tabelo z naključnimi števili iz intervala od 100 do 200 
* Izdelaj metodo, ki izračuna povprečno vrednost elementov v tabeli 
* Izpiše število sodih elementov 


## [3. Naloga](https://github.com/drobilc/NRP/blob/master/Naloge-za-ponavljanje/Naloga03.java)
Napiši  program,  ki  bo  izpisal  dvodimenzionalno  tabelo  celih  števil  (dimenziji  in elemente izbere uporabnik programa), poiskal njen največji element ter izračunal, za koliko se največji element razlikuje od povprečne vrednosti vseh elementov.

Sestavi metode `vnos`, `izpis`, `max` in `povprecje`. 


## [4. Naloga](https://github.com/drobilc/NRP/blob/master/Naloge-za-ponavljanje/Naloga04.java)
Napišite program, ki poišče in izpiše vsa praštevila iz določenega območja ter izračuna njihovo vsoto. Meje območja naj bodo določene s konstantama `spMeja` in `zgMeja` v programski kodi.

Primer:
Če je spodnja meja območja *10* in zgornja *30* naj bo izpis naslednji:
```
Praštevila med 10 in 30 : 11 13 17 19 23 29
Vsota praštevil : 112
```

## 5. Naloga
Izdelaj metodo, ki nize v tabeli združi v en niz. Metodo uporabi na lastnem primeru.
Glava metode `arrayToString` naj ima naslednjo obliko:
`public static String arrayToString(String[] a, String separator)`

## 6. Naloga
Na tekmi za svetovni pokal v smučarskih skokih nastopa 50 skakalcev, ki jih ocenjuje 5 sodnikov. Ocene po prvi seriji so zbrane v dvodimenzionalni tabeli `ocene`, v kateri vsaka vrstica ustreza enemu skakalcu, vsak stolpec pa enemu sodniku. Napišite metodo `najboljeOcenjeni`, ki izpiše startne številke tistih tekmovalcev, ki so dobili vsaj eno oceno 20 (to je najvišja možna ocena). Če je nekdo dobil več dvajsetic, se njegova startna številka izpiše le enkrat. Pri tem upoštevajte, da je startna številka vsakega skakalca za 1 večja od indeksa njegove vrstice v tabeli `ocene`. Če noben skakalec ni dobil ocene 20, naj metoda izpiše sporočilo `"Noben skakalec ni dobil ocene 20."`.

Metodo `najboljeOcenjeni` uporabi v glavni metodi, kjer za polnjenje vsebine tabele uporabiš generator naključnih števil. Za kontrolo delovanja programa predhodno izpiši tudi vrednosti tabele.

Glava metode `najboljeOcenjeni` naj ima naslednjo obliko:
`public static void najboljeOcenjeni(double[][] ocene)`

## 7. Naloga
Charles Babbage je pokazal, da z uporabo formule **x<sup>2</sup> + x + 41** dobimo nenavadno veliko praštevil (npr. za `x = 0`, dobimo praštevilo `41`, za `x = 1` dobimo praštevilo `43`, za `x = 2` dobimo praštevilo `47` itd.). Napišite program, ki za vse vrednosti x od 0 do 100 izpiše, ali je vrednost **x<sup>2</sup> + x + 41** praštevilo.

Prvih 5 vrstic izpisa naj bo:
```
41 je prastevilo
43 je prastevilo
47 je prastevilo
53 je prastevilo
61 je prastevilo
```

Namig: najprej izdelaj metodo `jePrastevilo,` ki za argument *n* vrne vrednost true (če je n praštevilo) ali false (če n ni praštevilo). To metodo nato kliči v zanki za vse vrednosti x od 0 do 100.


## 8. Naloga
Dan je niz *n*, ki je sestavljen iz več besed, med katerimi je natanko en presledek.
Napišite metodo `obrniBesede`, ki kot rezultat vrne niz tipa `StringBuffer`, v katerem so vse besede niza n "obrnjene". Metodo testiraj v glavni metodi.

Primer: Za niz `"To je prvotni niz"` mora metoda vrniti `"oT ej intovrp zin"`.

Glava metode obrniBesede naj ima naslednjo obliko:
`public static StringBuffer obrniBesede(String n)`


## 9. Naloga
Napiši metodo, ki vsebino tekstovne datoteke »prenese« v enodimenzijsko tabelo, nato pa vrne zadnji znak prvega in zadnjega elementa tabele. Ne pozabi, da se inicialke piše z velikimi črkami. To sta naključni inicialki tvojega idola. Metodo uporabi v glavni metodi.

Vsebina datoteke:
```
Jure
Tone
Pia
Marjana 
Gregor
Peter
Marko
Elvira
Sandra
Miran
```
Rezultat zgornjega primera: `E. N.` 