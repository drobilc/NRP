public class Barve {
	
	String[] barve = {"rdeca", "zelena", "modra", "rumena", "crna", "vijolicna", "bela", "oranzna", "siva", "zlata"};
	
	public String SteviloVBarvo(int stevilo) {
		if (stevilo >= 0 && stevilo < barve.length)
			return barve[stevilo];
		return "";
	}
	
	public int BarvaVStevilo(String barva) {
		for (int i = 0; i < barve.length; i++)
			if (barve[i].toLowerCase().equals(barva.toLowerCase()))
				return i;
		return -1;
	}
}