class Pacient {
	
	public String ime, priimek;
	private String krvnaSkupina;
	
	public Pacient() {
		this.ime = "NI PODATKOV";
		this.priimek = "NI PODATKOV";
		this.krvnaSkupina = "NI PODATKOV";
	}
	
	public Pacient(String ime, String priimek, String krvnaSkupina) {
		this.ime = ime;
		this.priimek = priimek;
		this.krvnaSkupina = krvnaSkupina;
	}
	
	public String toString(){
		String popravljenoIme = this.ime.substring(0, 1).toUpperCase() + this.ime.substring(1).toLowerCase();
		String popravljenPriimek = this.priimek.substring(0, 1).toUpperCase() + this.priimek.substring(1).toLowerCase();
		return popravljenoIme + " " + popravljenPriimek + " -> " + this.krvnaSkupina;
	}
	
}