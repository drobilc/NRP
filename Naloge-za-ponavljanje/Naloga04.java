import java.util.*;

public class Naloga04 {
	
	public static boolean jePrastevilo(int stevilo) {
		for (int i = 2; i <= Math.sqrt(stevilo); i++) {
			if (stevilo % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner vhod = new Scanner(System.in);
		
		System.out.print("Spodnja meja: ");
		int spodnjaMeja = vhod.nextInt();
		System.out.print("Zgornja meja: ");
		int zgornjaMeja = vhod.nextInt();
		
		System.out.print("Prastevila med " + spodnjaMeja + " in " + zgornjaMeja + " : ");
		
		//Za vsako število preverimo ali je praštevilo
		int vsota = 0;
		for (int i = spodnjaMeja; i <= zgornjaMeja; i++)
			if (jePrastevilo(i)) {
				System.out.print(i + " ");
				vsota += i;
			}
		
		System.out.println("\nVsota prastevil : " + vsota);
		
	}
	
}