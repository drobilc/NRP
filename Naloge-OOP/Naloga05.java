public class Naloga05 {
	
	public static void main(String[] args) {
		
		//Ustvarimo 2 varcevalna racuna
		VarcevalniRacun varcevalec1 = new VarcevalniRacun(2000);
		VarcevalniRacun varcevalec2 = new VarcevalniRacun(3000);
		
		//Izpisemo podatke varcevalnih racunov
		System.out.println("Podatki na varcevalnih racunih (zacetna): ");
		System.out.println(varcevalec1);
		System.out.println(varcevalec2);
		
		//Vsakemu varcevalcu dodamo pripisemo mesecne obresti (te znasajo 2.5% / 12)
		varcevalec1.izracunMesecnihObresti();
		varcevalec2.izracunMesecnihObresti();
		
		//Izpisemo podatke varcevalnih racunov
		System.out.println("\nPodatki na varcevalnih racunih (po pripisu mesecnih obresti): ");
		System.out.println(varcevalec1);
		System.out.println(varcevalec2);
		
		//Spremenimo letno obrestno mero (ker je staticna, se spremeni obema varcevalcema)
		VarcevalniRacun.spremeniObrestnoMero(4);
		
		//Vsakemu varcevalcu dodamo pripisemo mesecne obresti
		varcevalec1.izracunMesecnihObresti();
		varcevalec2.izracunMesecnihObresti();
		
		//Izpisemo podatke varcevalnih racunov
		System.out.println("\nPodatki na varcevalnih racunih (po pripisu spremenjenih (4%) mesecnih obresti): ");
		System.out.println(varcevalec1);
		System.out.println(varcevalec2);
		
		//Spremenimo letno obrestno mero (ker je staticna, se spremeni obema varcevalcema)
		VarcevalniRacun.spremeniObrestnoMero(5);
		
		//Vsakemu varcevalcu dodamo pripisemo mesecne obresti
		varcevalec1.izracunMesecnihObresti();
		varcevalec2.izracunMesecnihObresti();
		
		//Izpisemo podatke varcevalnih racunov
		System.out.println("\nPodatki na varcevalnih racunih (po pripisu spremenjenih (5%) mesecnih obresti): ");
		System.out.println(varcevalec1);
		System.out.println(varcevalec2);
		
	}
	
}
