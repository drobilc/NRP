import java.util.*;

public class Naloga05 {
	
	public static void main(String[] args) {
		
		Scanner vhod = new Scanner(System.in);
		
		int izbor = 0;
		
		do {
			System.out.print("\n1. Izpisi pozdrav\n2. Izpisi vizitko\n3. Izhod\nvnos: ");
			izbor = vhod.nextInt();
			switch (izbor) {
				case 1:
					System.out.println("Zdravo!");
					break;
				case 2:
					System.out.println("Niki Bizak\nbizjak.niki@gmail.com");
					break;
				case 3:
					System.exit(0);
					break;
			}
		} while (izbor != 3);
		
	}
	
}