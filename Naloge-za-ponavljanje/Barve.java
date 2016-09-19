public class Barve {
	
	public String SteviloVBarvo(int stevilo) {
		switch (stevilo) {
			case 1:
				return "rdeca";
			case 2:
				return "zelena";
			case 3:
				return "modra";
			case 4:
				return "rumena";
			case 5:
				return "crna";
			case 6:
				return "vijolicna";
			case 7:
				return "bela";
			case 8:
				return "siva";
			case 9:
				return "zlata";
			default:
				return "srebrna";
		}
	}
	
	public int BarvaVStevilo(String barva) {
		barva = barva.toLowerCase();
		switch (barva) {
			case "rdeca":
				return 1;
			case "zelena":
				return 2;
			case "modra":
				return 3;
			case "rumena":
				return 4;
			case "crna":
				return 5;
			case "vijolicna":
				return 6;
			case "bela":
				return 7;
			case "siva":
				return 8;
			case "zlata":
				return 9;
			default:
				return -1;
		}
	}
	
}
