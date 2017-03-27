public class Ime {

	private String ime;
	
	public Ime() {
		//Prazen konstruktor
	}
	
	public Ime(String ime) {
		this.ime = ime;
	}
	
	public void nastaviIme(String ime) {
		this.ime = ime;
	}
	
	public String vrniIme() {
		return this.ime;
	}
	
	public String toString() {
		return this.ime;
	}
	
}