import java.util.*;

public class Naloga15 {
	
	public static boolean jeCeloStevilo(String stevilka) {
		try {
			Integer.parseInt(stevilka);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);	
		String vnos = "";
		do {
			System.out.print("Vnesite celo stevilo: ");
			vnos = vhod.next();
			
			if (!jeCeloStevilo(vnos))
				System.out.println("Napaka, vnos ni celostevilska vrednost...");
		} while (!jeCeloStevilo(vnos));
	}
	
}