public class Avto {

	private int hitrost;
	private double cena;
	private String barva;
	
	public Avto(int hitrost, double cena, String barva) {
		this.hitrost = hitrost;
		this.cena = cena;
		this.barva = barva;
	}
	
	double vrniProdajnoCeno() {
		return this.cena;
	}

}