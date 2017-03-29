public class VarcevalniRacun {
	
	//Letna obrestna mera vseh imetnikov racunov je 2.5%
	public static double letnaObrestnaMera = 2.5;
	
	private int prihranek;
	
	public VarcevalniRacun(int prihranek) {
		this.prihranek = prihranek;
	}
	
	public int vrniPrihranek() {
		return this.prihranek;
	}
	
	public int izracunMesecnihObresti() {
		int novPrihranek = (int)(((double) this.prihranek * (letnaObrestnaMera / 100)) / 12);
		this.prihranek += novPrihranek;
		return novPrihranek;
	}
	
	public static void spremeniObrestnoMero(double lom) {
		letnaObrestnaMera = lom;
	}
	
	public String toString() {
		return "Na varcevalnem racunu je " + this.prihranek + " eur. Letna obrestna mera znasa " + this.letnaObrestnaMera + "%";
	}
	
}