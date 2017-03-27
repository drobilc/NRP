public class Naloga02 {

	public static void main(String[] args) {
		
		//Ustvarimo 4 objekte Racun
		Racun prviRacun = new Racun(1, "Alpsko mleko 3.5% mm", 5, 0.88);
		Racun drugiRacun = new Racun(2, "Twix extra 75g", 2, 0.69);
		Racun tretjiRacun = new Racun(3, "Jajca M Mercator Hlevska reja", 1, 1.19);
		Racun cetrtiRacun = new Racun(4, "Voda Za Life 0.5l", 4, 0.43);
		
		//Izpisemo vsak racun posebej (samodejno se klice metoda .toString())
		System.out.println(prviRacun);
		System.out.println("Znesek racuna: " + prviRacun.znesekRacuna() + " eur\n");
		
		System.out.println(drugiRacun);
		System.out.println("Znesek racuna: " + drugiRacun.znesekRacuna() + " eur\n");
		
		System.out.println(tretjiRacun);
		System.out.println("Znesek racuna: " + tretjiRacun.znesekRacuna() + " eur\n");
		
		System.out.println(cetrtiRacun);
		System.out.println("Znesek racuna: " + cetrtiRacun.znesekRacuna() + " eur\n");
		
	}

}