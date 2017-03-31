public class Sedan extends Avto {
	
	private int dolzina;
	
	public Sedan(int hitrost, double cena, String barva, int dolzina) {
		super(hitrost, cena, barva);
		this.dolzina = dolzina;
	}
	
	public double vrniProdajnoCeno() {
		if (dolzina > 8)
			return super.vrniProdajnoCeno() * 0.95;
		else
			return super.vrniProdajnoCeno() * 0.8;
	} //if dolzina>8m potem 5% popusta v nasprotnem primeru 10%
	
}