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


## 10. Naloga
Z uporabo rekurzije napiši metodo za ugotavljanje palindroma.

Namig: Niz je palindrom, če je prva črka enaka zadnji in je srednji niz (to je niz brez prve in zadnje črke) palindrom.

Glava metode jePalindrom naj ima naslednjo obliko:
`public static boolean jePalindrom(String niz)`

Metodo uporabi pri preverjanje imen v datoteki `palindromi.txt`.

Vsebina datoteke `palindromi.txt`
```
aba
banana
ninanana
juhubanda
pericarezeracirep
bob
metla
```


## 11. Naloga
Napiši program za izbiro najljubšega hišnega ljubljenčka. Deklariraj naštevni tip *HisniLjubljencki*. Program naj najprej izpiše vse hišne ljubljenčke, ki so na izbiro, nato pa uporabnik izmed naštetih izbere (napiše) poljubnega. Upoštevaj to, da lahko uporabnik piše z malimi in velikimi črkami, program naj upošteva tudi nepravilno uporabo (nepravilen vnos).

Na voljo imate sledeče hišne ljubljenčke: *macek*, *papiga*, *hrcek*, *kaca*, *kuza*, *tiger*.


## 12. Naloga
Napiši program `Dnevi`, ki vsebuje naštevni tip z vsemi dnevi v tednu, poleg tega izdelaj metodo `vzdusje`, ki za ponedeljek izpiše `"Ponedeljki mi niso vsec."`, za petek `"Petki so vredu."`, za soboto in nedeljo `"Vikendi so najboljsi."`, za ostale dneve pa `"Med tednom je tako-tako."`. Napiši tudi konstruktor s parametrom `dan`, ki nastavi vrednost spremenljivke dan (ime konstruktorja je enako imenu razreda). V glavni metodi uporabi izdelan konstruktor in metodo *vzdusje*. 


## 13. Naloga
Izdelaj razred `Dijak`, ki vsebuje naslednje parametre:
```java
private String ime, priimek, predmet;
private int ocena;
```

Izdelaj metode za dostop do imena, priimka, predmeta in ocene.
```java
String vrniIme()
String vrniPriimek()
int vrniOceno()
```

Izdelaj konstruktor, ki za parameter vzame ime, priimek, predmet in oceno in naredi razred s temi parametri.
```java
Dijak(String i, String p, String pre, int o);
```
Izdelaj metodo: `public String toString()`, ki vrne niz, v katerem so napisani ime, priimek in ocena dijaka.

Izdelaj razred **TestDijak**, ki naredi tabelo petih objektov tipa dijak, vnese ime, priimek in oceno za vsakega. Bodi pozoren na to, da je potrebno najprej z operatorjem new izdelati tabelo objektov tipa dijak, potem pa za vsak indeks narediti nov objekt tipa dijak. Dodaj razredu TestDijak naslednje metode `public static double povprecnaOcena(Dijaki[] dijaki)`, ki kot parameter vzame tabelo dijakov in vrne povprečno oceno dijakov.

## 14. Naloga
Izdelaj razred `Dijak`, ki vsebuje naslednje parametre:
```java
private String ime, priimek, predmet;
private int ocena;
```

Izdelaj metode za dostop do imena, priimka, predmeta in ocene.
```java
String vrniIme()
String vrniPriimek()
int vrniOceno()
```

Izdelaj konstruktor, ki za parameter vzame ime, priimek, predmet in oceno in naredi razred s temi parametri.
```java
Dijak(String i, String p, String pre, int o);
```
Izdelaj metodo: `public String toString()`, ki vrne niz, v katerem so napisani ime, priimek in ocena dijaka.

Izdelaj razred **TestDijak**, ki naredi tabelo petih objektov tipa dijak, vnese ime, priimek in oceno za vsakega. Bodi pozoren na to, da je potrebno najprej z operatorjem new izdelati tabelo objektov tipa dijak, potem pa za vsak indeks narediti nov objekt tipa dijak. Dodaj razredu TestDijak naslednje metode `public static double povprecnaOcena(Dijaki[] dijaki)`, ki kot parameter vzame tabelo dijakov in vrne povprečno oceno dijakov.

Izdelaj razred **TestDijak**, ki naredi tabelo desetih objektov tipa dijak. Podatke o dijakih preberi iz datoteke in vsebino vpiši v tabelo. V datoteki naj bodo podatki za 10 dijakov. Podatki o dijaku naj bodo ločeni z vejico.

Struktura datoteke:
```
Marko,Petek,APJ,4
Miha,Sobota,MAT,4
Janez,Rutar,SLO,2
...
```


## 15. Naloga
Napiši metodo, ki prebere celo število. V primeru, da uporabnik ne vnese celega števila naj bo opozorjen, da ni vnesel celega števila in naj le to vnese. Program naj se izvaja toliko časa dokler uporabnik ne vnese celega števila. Upoštevaj lovljenje izjem.


## 16. Naloga
Napiši program, ki bere vsebino datoteke in izpisuje vsebino vrstico po vrstico na zaslon. Upoštevaj dve uporabniki napaki in sicer:
* Uporabnik ne poda imena datoteke (argument pri klicu)
* Uporabnik poda ime datoteke vendar le ta ne obstaja.

V programu naj se vedno izvede blok v katerem se izpiše vsebina `"Ta program vsebuje lovljenje izjem!"` 


## 18. Naloga
Napišite program, ki bo omogočal vnos poljubnega števila moških imen.
Za hranjenje moških imen uporabi razred *ArrayList*. Na 3. mesto vnesi moško ime **Dani**. Na podlagi zadnjih črk vnesenih imen sestavi žensko ime in jo vstavi v drugi ArrayList. Generiraj naključno število s katerim izbereš moškega iz prvega Arraylista. Izpiši ime naključnega "moža" in "žene". Za ime žene uporabi sestavljeno ime na podlagi zadnjih črk vnesenih imen. Izpiši tudi število vseh moških in dolžino ženskega imena.

Primer izpisa:
```
Ime moža je Tone ime žene pa Anica.
Število vseh moških v ArrayList-u je 5, dolžina imena Anica pa je prav tako 5. 
```
