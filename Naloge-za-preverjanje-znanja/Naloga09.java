import java.util.*;
import java.io.*;

public class Naloga09 {
	
	public static String prenesi(String imeDatoteke) {
		try {
			ArrayList<String> vrstice = new ArrayList<String>();
			
			//Vrstice beremo in jih dodajamo v ArrayList
			BufferedReader vhod = new BufferedReader(new FileReader(imeDatoteke));
			while (vhod.ready()) {
				vrstice.add(vhod.readLine().trim());
			}
			
			vhod.close();
			
			//Dobimo prvo in zadnjo vrstico
			String prvaVrstica = vrstice.get(0);
			String zadnjaVrstica = vrstice.get(vrstice.size() - 1);
			
			//Vrnemo zadnji znak iz prve in zadnje vrstice
			return (prvaVrstica.charAt(prvaVrstica.length() - 1) + ". " + zadnjaVrstica.charAt(zadnjaVrstica.length() - 1) + ".").toUpperCase();
		} catch (IOException e) {
			return "";
		} catch (Exception e) {
			return "";
		}
	}
	
	public static void main(String[] args) {		
		System.out.println(prenesi("datoteka.txt"));
	}
	
}