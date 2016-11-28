public class Naloga13 {
	
	public static double povprecnaOcena(Dijak[] dijaki) {
		double vsota = 0;
		for (int i = 0; i < dijaki.length; i++) {
			vsota += dijaki[i].vrniOceno();
		}
		return (vsota / dijaki.length);
	}
	
	public static void main(String[] args) {
		
		Dijak[] tabelaDijakov = new Dijak[5];
		
		tabelaDijakov[0] = new Dijak("Robert", "Tanko", "SLO", 4);
		tabelaDijakov[1] = new Dijak("Sanja", "Jakin", "MAT", 5);
		tabelaDijakov[2] = new Dijak("Nana", "Kolofon", "NUP", 2);
		tabelaDijakov[3] = new Dijak("Nejc", "Kravos", "NEM", 1);
		tabelaDijakov[4] = new Dijak("Tilen", "Zlomek", "NUS", 4);
		
		//Izpišemo vse dijake
		for (int i = 0; i < tabelaDijakov.length; i++) {
			System.out.println(tabelaDijakov[i]);
		}
		
		//Izračunamo povprečno oceno in jo izpišemo
		double p = povprecnaOcena(tabelaDijakov);
		
		//Oceno zaokrožimo na 2 decimalki natančno
		p = Math.floor(p * 100) / 100;
		
		System.out.println("Povprecna ocena dijakov je " + p);
		
	}
	
}