# Naloge iz objektno orientiranega programiranja

## 1. Naloga
Napiši program, ki izpiše tvoje ime, tako da upoštevaš OO pristop.

Namig: izdelaj razred `Ime` in nato testni razred kjer uporabi razred Ime.

## 2. Naloga
Izdelaj razred `Racun` katerega lahko trgovina s strojno opremo uporabi za izdajo računa pri prodaji artikla v trgovini.
Račun naj bo sestavljen iz štirih delov: *šifra izdelka*, *ime izdelka*, *število kupljenih izdelkov* in *cena izdelkov*.
Razred naj vsebuje konstruktor, ki nastavi vse predhodno naštete atribute.
Izdelaj tudi metodo `znesekRacuna`, ki naj vrne znesek na računu, ki je rezultat produkta (`število artiklov * cena`).
Če število kosov ni pozitivno potem naj metoda vrne vrednost 0 in prav tako, če je cena enaka 0.
V testnem razredu izdelaj dva objekta tipa Račun in izpiši vse njihove podrobnosti.

## 3. Naloga
Izdelaj razred Zaposleni, ki vsebuje tri atribute: ime, priimek in letni osebni dohodek.
Razred naj vsebuje konstruktor, ki nastavi vrednosti navedenih atributov.
Izdelaj metode tipa »getter« in »setter« za vse atribute.
Če letni osebni dohodek ni pozitiven, ga nastavi na 0.
V testnem razredu izdelaj dva objekta tipa Zaposleni ter izpiši vse njuna letna osebna dohodka, nato vsakemu zaposlenemu povečaj osebni dohodek za 10% in zopet izpiši letni osebni dohodek.

## 4. Naloga
Izdelaj razred Datum, ki vsebuje tri atribute: mesec, dan in leto.
Razred naj vsebuje konstruktor, ki vse te atribute nastavi (predpostavimo, da so vnosi pravilni).
Izdelaj metode tipa »getter« in »setter« za vse atribute.
Poleg teh izdelaj tudi metodo prikaži Datum, ki izpiše dan, mesec in leto ločeno s poševnico (/).
Izdelaj testni razred, kjer uporabi vse funkcionalnosti/zmogljivosti razreda Datum.

## 5. Naloga
Izdelaj razred varčevalni Račun.
Uporabi statično spremenljivko letna_obrestna_mera za shranjevanje letne obrestne mere za vse imetnike računov.
Vsak objekt razreda naj vsebuje atribut (private) prihranek, ki označuje znesek na komitentovem varčevalnem računu.
Izdelaj metodo izračun mesečnih obresti, ki vrne znesek mesečnih obresti za posameznega komitenta.
Ob tem naj se prihranki povečajo za znesek mesečnih obresti.
Izdelaj statično metodo spremeni obrestno mero, ki nastavi letno obrestno mero na novo vrednost.
Izdelaj testni razred, kjer testiraš razred varčevalni račun. Deklariraj dva objekta varcevalec1 in varcevalec2, varcevalec1 naj ima privarčevano 2000EUR, varcevalec2 pa 3000EUR.
* Nastavi letno obrestno mero na 4%, izračunaj znesek mesečnih obresti za oba varčevalca in izpiši prihranke za oba varčevalca.
* Nastavi letno obrestno mero na 5%, izračunaj znesek mesečnih obresti za oba varčevalca in izpiši prihranke za oba varčevalca.

## 6. Naloga
Izdelaj razred Knjiga, ki predstavlja knjigo.
Razred Knjiga naj vsebuje 4 atribute, ki opisujejo knjigo in sicer ime knjige, ISBN številko, ime avtorja in ime založnika.
Razred naj vsebuje dva konstruktorja.
Prvi, ki je brez parametrov naj nastavi atributom "prazne vrednosti", drugi pa naj nastavi vrednosti omenjenih atributov na podlagi parametrov konstruktorja.
Za vse atribute izdelaj metode tipa "setter" in "getter".
Poleg teh metod izdelaj še metodo vrniKnjigaInfo, ki vrne opis knjige; opis naj vsebuje vse informacije o knjigi.
Izdelaj testni razred TestKnjiga kjer kreiraš tabelo 30ih objektov tipa Knjiga.
Napolni tabelo s petimi knjigami in nato vsebino tabele izpiši.

## 7. Naloga
Izdelaj nadrejeni razred Avto. Razred avto ima sledeče atribute in metode 
```java
int hitrost;
double cena;
String barva;
double vrniProdajnoCeno();
```
Izdelaj podrejeni razred Kamion, ki je podrejen razredu Avto. Razred Kamion naj vsebuje naslednje atribute in metode
```java
int teza;
double vrniProdajnoCeno(); //if teza>2000,10% popusta v nasprotnem primeru 20%
```

Izdelaj podrejeni razred Ford, ki je podrejen razredu Avto. Razred Ford naj vsebuje naslednje atribute in metode
```java
int letnica;
int izdelovalcevPopust;
double vrniProdajnoCeno(); //Prodajni ceni iz razreda Avto odštej izdelovalčev popust.
```

Izdelaj podrejeni razred Sedan, ki je podrejen razredu Avto. Razred Sedan naj vsebuje naslednje atribute in metode
```java
int dolzina;
double vrniProdajnoCeno(); //if dolzina>8m potem 5% popusta v nasprotnem primeru 10%
```

Izdelaj Razred MojAvtoSalon, ki vsebuje metodo main(). Metoda main naj vsebuje
Objekt tipa Sedan in inicializiraj vse atribute tega razreda. V konstruktorju uporabi metodo super(...) za inicializacijo atributov nadrejenega razreda.
Izdelaj dva objekta tipa Ford in inicializiraj vse atribute tega razreda. V konstruktorju uporabi metodo super(...) za inicializacijo atributov nadrejenega razreda.
Izdelaj objekt tipa Avto in inicializiraj vse atribute tega razreda.
Izdelaj objekt tipa Kamion in inicializiraj vse atribute tega razreda.
Izpiši prodajno ceno za vsak objekt
