public class Dijak {
	
	private int vpisnaStevilka;
	private String ime, priimek, naslov, email, telefonskaStevilka;
	
	public Dijak() {
		
	}
	
	public Dijak(int vpisnaStevilka, String ime, String priimek, String naslov, String email, String telefonskaStevilka) {
		this.vpisnaStevilka = vpisnaStevilka;
		this.ime = ime;
		this.priimek = priimek;
		this.naslov = naslov;
		this.email = email;
		this.telefonskaStevilka = telefonskaStevilka;
	}
	
	public void nastaviVpisnoStevilko(int vpisnaStevilka) {
		this.vpisnaStevilka = vpisnaStevilka;
	}
	
	public void nastaviIme(String ime) {
		this.ime = ime;
	}
	
	public void nastaviPriimek(String priimek) {
		this.priimek = priimek;
	}
	
	public void nastaviNaslov(String naslov) {
		this.naslov = naslov;
	}
	
	public void nastaviEmail(String email) {
		this.email = email;
	}
	
	public void nastaviTelefonskoStevilko(String telefonskaStevilka) {
		this.telefonskaStevilka = telefonskaStevilka;
	}
	
	public int vrniVpisnoStevilko() {
		return this.vpisnaStevilka;
	}
	
	public String vrniIme() {
		return this.ime;
	}
	
	public String vrniPriimek() {
		return this.priimek;
	}
	
	public String vrniNaslov() {
		return this.naslov;
	}
	
	public String vrniEmail() {
		return this.email;
	}
	
	public String vrniTelefonskoStevilko() {
		return this.telefonskaStevilka;
	}
	
	public String toString() {
		String polnoIme = this.ime.substring(0, 1).toUpperCase() + this.ime.substring(1).toLowerCase() + " " +this.priimek.substring(0, 1).toUpperCase() + this.priimek.substring(1).toLowerCase();
		return polnoIme + " (" + this.vpisnaStevilka + ")" + "\nNaslov: " + this.naslov + "\nTelefonska stevilka: " + this.telefonskaStevilka + "\nE-naslov: " + this.email + "\n";
	}
	
}