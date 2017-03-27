public class Racun {
	
	//šifra izdelka, ime izdelka, število kupljenih izdelkov in cena izdelkov
	private int sifraIzdelka;
	private String imeIzdelka;
	private int steviloKupljenihIzelkov;
	private double cenaIzdelka;
	
	public Racun() {
		//Prazen konstruktor
	}
	
	public Racun(int sifraIzdelka, String imeIzdelka, int steviloKupljenihIzelkov, double cenaIzdelka) {
		this.sifraIzdelka = sifraIzdelka;
		this.imeIzdelka = imeIzdelka;
		this.steviloKupljenihIzelkov = steviloKupljenihIzelkov;
		this.cenaIzdelka = cenaIzdelka;
	}
	
	public double znesekRacuna() {
		if (steviloKupljenihIzelkov <= 0 || this.cenaIzdelka <= 0)
			return 0.0;
		
		return this.steviloKupljenihIzelkov * this.cenaIzdelka;
	}
	
	public String toString() {
		return "Izdelek: #" + sifraIzdelka + " - " + imeIzdelka + ", Kolicina: " + steviloKupljenihIzelkov + ", Cena: " + cenaIzdelka;
	}
	
}