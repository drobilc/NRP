import java.io.*;

public class Naloga14 {
	
	public static Dijak pretvoriVDijaka(String vrstica){
		String[] podatki = vrstica.split(",");
		if (podatki.length == 4) {
			int ocena = Integer.parseInt(podatki[podatki.length - 1]);
			return new Dijak(podatki[0], podatki[1], podatki[2], ocena);
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		Dijak[] tabelaDijakov = new Dijak[10];
		
		try {
			BufferedReader vhod = new BufferedReader(new FileReader("naloga.txt"));
			String vrstica;
			for (int i = 0; i < 10; i++) {
				
				if (!vhod.ready())
					break;
				
				vrstica = vhod.readLine();
				tabelaDijakov[i] = pretvoriVDijaka(vrstica);
			}
			vhod.close();
		} catch(FileNotFoundException e) {
			System.out.println("Datoteka ne obstaja.");
		} catch (IOException e) {
			System.out.println("Napaka pri branju datoteke.");
		}
		
		for (int i = 0; i < tabelaDijakov.length; i++) {
			System.out.println(tabelaDijakov[i]);
		}
		
	}
	
}