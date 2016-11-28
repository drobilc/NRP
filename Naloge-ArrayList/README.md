# Naloge ArrayList

## 1. Naloga
Napišite program, ki bo omogočal vnos poljubnega števila moških imen. Za hranjenje moških imen uporabi razred **ArrayList**. Na 3. mesto vnesi moško ime `Gregor`. Na podlagi zadnjih črk vnesenih imen sestavi žensko ime in jo vstavi v drugi ArrayList. Generiraj naključno število s katerim izbereš moškega iz prvega Arraylista. Izpiši ime naključnega »moža« in »žene«. Za ime žene uporabi sestavljeno ime na podlagi zadnjih črk vnesenih imen. Izpiši tudi število vseh moških in dolžino ženskega imena.

## 2. Naloga
Podan imamo razred *Sola*. Izdelaj razred *ArrayListDemo*, kjer v ArrayList, velikosti 20 vstaviš sledeče podatke:
```
TSC_NG, Tigri
Gimnazija_NG, Kanarcki
Ekonomska_NG, Medvedi
TSC_KR, Carovniki
Gimnazija_Siska, RdeceSence
```

* Na tretje mesto v ArrayList-u vstavi podatke o Srednji šoli za elektrotehniko in računalništvo v Ljubljani
`Vegova, Rusilci`
* Vse podatke v ArrayList-u izpiši s pomočjo »for each« stavka.
* Uredi podatke v padajočem vrstnem redu po imenu šol in jih izpiši v nasprotnem vrstnem redu s pomočjo *while zanke*.
* Pobriši šolo, ki se nahaja na 2 mestu v ArrayList-u in izpiši vse podatke s pomočjo *for stavka*. 

```java
class Sola{
  private String sola;
  private String ekipa;

  public Sola() {
  }

  public Sola(String sola, String ekipa) {
    this.sola = sola;
    this.ekipa = ekipa;
  }

  public String getSola() {
    return sola;
  }

  public void setSola(String sola) {
    this.sola = sola;
  }

  public String getEkipa() {
    return ekipa;
  }
 
  public void setEkipa(String ekipa) {
    this.ekipa = ekipa;
  }

  public String toString() {
    return "## sola : "+this.sola+", ekipa : "+this.ekipa;
  }
}
```
