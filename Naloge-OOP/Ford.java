public class Ford extends Avto {
	
	private int letnica;
	private int izdelovalcevPopust;
	
	public Ford(int hitrost, double cena, String barva, int letnica, int izdelovalcevPopust) {
		super(hitrost, cena, barva);
		this.letnica = letnica;
		this.izdelovalcevPopust = izdelovalcevPopust;
	}
	
	public double vrniProdajnoCeno() {
		return super.vrniProdajnoCeno() - this.izdelovalcevPopust;
	}
	
}