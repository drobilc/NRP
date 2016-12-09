import java.util.*;

public class Naloga01 {
	
	public enum Avtomobil {FERRARI, LAMBORGHINI, TOYOTA, SUBARU, HONDA, NISSAN};
	
	public static void izpisVsi() {
		System.out.println("Izpis vseh avtomobilov: ");
		
		//Uporaba for-each zanke
		for (Avtomobil avto: Avtomobil.values())
			System.out.println(avto);
		
		System.out.println();
		
		//Uporaba for zanke
		for (int i = 0; i < Avtomobil.values().length; i++)
			System.out.println(Avtomobil.values()[i]);
		
		System.out.println();
	}
	
	public static void izpisOrd(Avtomobil avto) {
		//Uporaba metode .ordinal()
		System.out.println("Avtomobil z imenom " + avto + " ima ordinalno vrednost " + avto.ordinal() + ".");
	}
	
	public static void izpisNT(int ordinalnaVrednost) {
		//Izpišemo vrednost iz tabele Avtomobil.values()
		System.out.println("Avtomobil z ordinalno vrednostjo " + ordinalnaVrednost + " je " + Avtomobil.values()[ordinalnaVrednost] + ".");
	}
	
	public static void priredi(String p) {
		//Uporaba metode valueOf
		Avtomobil spremenljivka = Avtomobil.valueOf(p);
	}
	
	public static void main(String[] args) {
		//Izpišemo vse avtomobile v naštevnem tipu Avtomobil
		izpisVsi();
		
		//Izpišemo ordinalno vrednost (indeks)
		izpisOrd(Avtomobil.SUBARU);
		
		//Izpišemo ime naštevnega tipa, ki je na indeksu 1
		izpisNT(1);
		
		//Od uporabnika preberemo ime avtomobila
		Scanner vhod = new Scanner(System.in);
		System.out.println("Vnesite znamko avtomobila (FERRARI, LAMBORGHINI, TOYOTA, SUBARU, HONDA, NISSAN)");
		String vnos = vhod.next();
		
		//Klièemo metodo priredi, vse èrke v vnosu spremenimo v velike tiskane
		priredi(vnos.toUpperCase());
	}
	
}