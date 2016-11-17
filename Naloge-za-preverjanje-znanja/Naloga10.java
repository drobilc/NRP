import java.io.*;

public class Naloga10 {
	
	public static boolean jePalindrom(String niz) {
		if (niz.length() < 2)
			return true;
		else if (niz.charAt(0) != niz.charAt(niz.length() - 1))
			return false;
		else
			return jePalindrom(niz.substring(1, niz.length() - 1));
	}
	
	public static void main(String[] args) {
		
		try {
			BufferedReader vhod = new BufferedReader(new FileReader("datoteka.txt"));
			String vrstica = "";
			while (vhod.ready()) {
				vrstica = vhod.readLine().trim();
				if (jePalindrom(vrstica))
					System.out.println("Beseda " + vrstica + " je palindrom.");
				else
					System.out.println("Beseda " + vrstica + " ni palindrom.");
			}
			vhod.close();
		} catch (Exception e) {
			
		}
		
	}
	
}