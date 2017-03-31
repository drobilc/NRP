public class Kamion extends Avto {
	
	private int teza;
	
	public Kamion(int hitrost, double cena, String barva, int teza) {
		super(hitrost, cena, barva);
		this.teza = teza;
	}
	
	public double vrniProdajnoCeno() {
		if (this.teza > 2000)
			return super.vrniProdajnoCeno() * 0.9;
		else
			return super.vrniProdajnoCeno() * 0.8;
	}
	
}