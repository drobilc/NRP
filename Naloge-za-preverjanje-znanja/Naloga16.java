import java.io.*;

public class Naloga16 {
	
	public static void main(String[] args) {
		
		BufferedReader vhod = null;
		
		try {
			
			vhod = new BufferedReader(new FileReader(args[0]));
			
			while (vhod.ready()) {
				System.out.println(vhod.readLine());
			}
			
			vhod.close();
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Napaka, niste vnesli imena datoteke.");
		} catch (FileNotFoundException e) {
			System.out.println("Napaka, datoteka ne obstaja.");
		} catch (IOException e) {
			System.out.println("Napaka, zgodilo se je nekaj groznega.");
		} finally {
			System.out.println("Ta program vsebuje lovljenje izjem!");
		}
		
	}
	
}