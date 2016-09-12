# Vaje za ponavljanje 

## 1. Naloga
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

## 2. Naloga
Deklariraj dvodimenzijsko celoštevilčno tabelo dimenzij `10x10`
* Izdelaj metodo, ki napolni tabelo z naključnimi števili iz intervala od 100 do 200 
* Izdelaj metodo, ki izračuna povprečno vrednost elementov v tabeli 
* Izpiše število sodih elementov 


## 3. Naloga
Napiši  program,  ki  bo  izpisal  dvodimenzionalno  tabelo  celih  števil  (dimenziji  in elemente izbere uporabnik programa), poiskal njen največji element ter izračunal, za koliko se največji element razlikuje od povprečne vrednosti vseh elementov.

Sestavi metode `vnos`, `izpis`, `max` in `povprecje`. 


## 4. Naloga
Napišite program, ki poišče in izpiše vsa praštevila iz določenega območja ter izračuna njihovo vsoto. Meje območja naj bodo določene s konstantama `spMeja` in `zgMeja` v programski kodi.

Primer:
Če je spodnja meja območja *10* in zgornja *30* naj bo izpis naslednji:
```
Praštevila med 10 in 30 : 11 13 17 19 23 29
Vsota praštevil : 112
```

## 5. Naloga
Napiši program s preprostim menijem. 
V *do ... while* zanki naj ponavlja naslednje:
Izpiše naj tri možnosti:
```
1. Izpiši pozdrav
2. Izpiši vizitko
3. Izhod
```
Prebere naj celo število izbor, ki pomeni izbor ukaza. Glede na izbor naj s switch .. case stavkom izvede ustrezen ukaz. Če je izbor *1*, naj izpiše pozdrav. Če je izbor *2*, naj izpiše vaše ime. Ponavlja se naj, ko izbor ni enak *3*. 

Primer: 

vnos: `2`

izpis:
```
Janez Kranjski 
janez.kranjski@hotmail.com    
```

## 6. Naloga
Naredi program kalkulator.
V do .. while zanki naj ponavlja naslednje:
Izpiše naj možnosti:
```
1. Seštevanje
2. Odštevanje
3. Množenje
4. Deljenje
5. Izhod
```
Prebere naj celo število izbor, ki pomeni izbor ukaza. Glede na izbor naj s *switch ... case* stavkom izvede ustrezen ukaz. Če je izbor *1*, naj vnese dve števili `a` in `b` in izpiše njun seštevek, če je izbor *2*, naj vnese dve števili `a` in `b` in izpiše njuno razliko, itd. 

## 7. Naloga
Napiši razred, ki bo vseboval metode za pretvarjanje številčne oznake barvne lestvice (tipa int) v opisno oznako posamezne barve (String).

Na primer 1 - bela, 2 - rumena.
Za preverjanje uporabite stavek switch.

Delovanje preizkusi v testnem razredu s kodo: 
```
Barve b = new Barve();
int stevilkaBarve = b.BarvaVStevilo(»Bela«);
System.out.println( stevilkaBarve );
String barva = b.SteviloVBarvo( 3 );
System.out.println( barva );
```

## 8. Naloga
Izdelaj metodo, ki nize v tabeli združi v en niz. 
* Izdelaj preprosto in s tem počasnejšo metodo. 
* Izdelaj optimalno in s tem hitrejšo metodo. Namig: *uporabi razred StringBuffer*

## 9. Naloga
Napiši program, ki pretvarja tekst v binarni zapis.
Iz datoteke naj bere besede in na zaslon izpisuje binaren zapis besed.

Primer: 
`To je test.` -> `10010101...`
