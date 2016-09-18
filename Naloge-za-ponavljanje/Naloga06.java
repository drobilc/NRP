import java.util.*;

public class Naloga06 {
	
	public static void main(String[] args) {
		
		Scanner vhod = new Scanner(System.in);
		int izbor = 0;
		
		do {
			
			System.out.print("\n1. Sestevanje\n2. Odstevanje\n3. Mnozenje\n4. Deljenje\n5. Izhod\n");
			izbor = vhod.nextInt();
			
			//Zanko prekinemo, če uporabnik vnese 5
			if (izbor == 5)
				break;
			
			//Če je vneseno število izven območja, zanko ponovimo, ne izvedemo nič
			if (izbor <= 0 || izbor > 5)
				continue;
			
			System.out.print("Vnesite prvo stevilo: ");
			int a = vhod.nextInt();
		
			System.out.print("Vnesite drugo stevilo: ");
			int b = vhod.nextInt();
			
			switch (izbor) {
				case 1:
					System.out.println(a + " + " + b + " = " + (a + b));
					break;
				case 2:
					System.out.println(a + " - " + b + " = " + (a - b));
					break;
				case 3:
					System.out.println(a + " * " + b + " = " + (a * b));
					break;
				case 4:
					System.out.println(a + " / " + b + " = " + (a / b));
					break;
			}
			
		} while (true);
		
	}
	
}