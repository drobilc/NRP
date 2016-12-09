/*Napi�i program za izbiro najljub�ega OS. Deklariraj na�tevni tip OperacijskiSistemi.
Program naj najprej izpi�e vse operacijske sisteme, ki so na izbiro, nato pa uporabnik
izmed na�tetih izbere(napi�e) poljubnega. Upo�tevaj to, da lahko uporabnik pi�e z
malimi in velikimi �rkami. Program naj upo�teva tudi nepravilno uporabo (nepravilen
vnos). */

import java.util.*;

public class Naloga02 {
	
	public enum OperacijskiSistem {WINDOWS, LINUX, UNIX, IOS, MSDOS, ANDROID};
	
	
	public static void main(String[] args) {
		
		//Izpi�emo vse mo�ne OS iz na�tevnega podatkovnega tipa OperacijskiSistem
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