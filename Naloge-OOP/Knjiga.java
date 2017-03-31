public class Knjiga {
	
	private String ISBN, naslov, avtor, zaloznik;
	
	public Knjiga() {
		//Prazen konstruktor
		this.ISBN = "";
		this.naslov = "";
		this.avtor = "";
		this.zaloznik = "";
	}
	
	public Knjiga(String ISBN, String naslov, String avtor, String zaloznik) {
		this.ISBN = ISBN;
		this.naslov = naslov;
		this.avtor = avtor;
		this.zaloznik = zaloznik;
	}
	
	public String vrniISBN() {
		return this.ISBN;
	}
	
	public String vrninaslov() {
		return this.naslov;
	}
	
	public String vrniAvtorja() {
		return this.avtor;
	}
	
	public String vrniZaloznika() {
		return this.zaloznik;
	}
	
	public void nastaviISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	public void nastavinaslov(String naslov) {
		this.naslov = naslov;
	}
	
	public void nastaviAvtorja(String avtor) {
		this.avtor = avtor;
	}
	
	public void nastaviZaloznika(String zaloznik) {
		this.zaloznik = zaloznik;
	}
	
	public String vrniKnjigaInfo() {
		return "[ " + this.ISBN + " ] " + this.avtor + " " + this.naslov + ", " + this.zaloznik;
	}
	
	public String toString() {
		return this.vrniKnjigaInfo();
	}

}