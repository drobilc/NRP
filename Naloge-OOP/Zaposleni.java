public class Zaposleni {
	private String ime, priimek;
	private int dohodek = 0;
	
	public Zaposleni(String ime, String priimek, int dohodek) {
		this.ime = ime;
		this.priimek = priimek;
		
		//Placa je ze sama po sebi enaka 0, ce je placa vecja od 0, jo samo prepisemo
		if (dohodek > 0)
			this.dohodek = dohodek;
	}
	
	public String vrniIme() {
		return this.ime;
	}
	
	public String vrniPriimek() {
		return this.priimek;
	}
	
	public int vrniDohodek() {
		return this.dohodek;
	}
	
	public void nastaviIme(String ime) {
		this.ime = ime;
	}
	
	public void nastaviPriimek(String priimek) {
		this.priimek = priimek;
	}
	
	public void nastaviDohodek(int dohodek) {
		this.dohodek = dohodek;
	}
	
	public void povecajDohodek(double odstotek) {
		this.dohodek += this.dohodek * (odstotek / 100);
	}
	
	public String toString() {
		return this.ime + " " + this.priimek + ", placa: " + this.dohodek + " eur";
	}
	
}