import java.util.*;

public class Naloga02 {
	
	public enum OperacijskiSistem {WINDOWS, LINUX, UNIX, IOS, MSDOS, ANDROID};
	
	
	public static void main(String[] args) {
		
		//Izpišemo vse možne OS iz naštevnega podatkovnega tipa OperacijskiSistem
		System.out.println("Vsi mozni operacijski sistemi: ");
		for (OperacijskiSistem os : OperacijskiSistem.values()) {
			System.out.println(os);
		}
		
		System.out.println("\nProsim vpisite ime enega izmed zgornjih operacijskih sistemov");
		
		//Od uporabnika preberemo ime OS
		Scanner vhod = new Scanner(System.in);
		System.out.print("Ime operacijskega sistema: ");
		String vnos = vhod.next().toUpperCase();
		
		try {
			OperacijskiSistem os = OperacijskiSistem.valueOf(vnos);
			System.out.println("Vnesli ste " + os + ", ki ima ordinatno vrednost " + os.ordinal() + ".");
		} catch (IllegalArgumentException e) {
			System.out.println("Ta operacijski sistem ne obstaja.");
		}
		
	}
	
}
