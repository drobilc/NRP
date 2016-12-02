import java.util.*;

public class Naloga18 {
	
	public static void main (String[] args) {
		
		Scanner vhod = new Scanner(System.in);
		
		ArrayList<String> moski = new ArrayList<String>();
		
		String vnos = "";
		do {
			
			System.out.print("Vnesite mosko ime: ");
			vnos = vhod.nextLine();
			
			if (vnos.length() > 0) {
				//V ArrayList moski dodamo ime (pri tem pazimo da je prva črka velika začetnica, vse ostalo pa je zapisano z malimi)
				moski.add( vnos.substring(0, 1).toUpperCase() + vnos.substring(1).toLowerCase() );
			}
			
		} while (!vnos.isEmpty());
		
		//Če uporabnik vnese manj kot 3 ljudi nam program brez tega vrne napako
		if (moski.size() >= 2)
			moski.add(2, "Dani");
		
		//Iz zadnjih črk sestavimo žensko ime
		ArrayList<String> zenske = new ArrayList<String>();
		String zenskoIme = "";
		for (int i = 0; i < moski.size(); i++)
			zenskoIme += moski.get(i).substring(moski.get(i).length() - 1);
		
		zenske.add(zenskoIme);
		
		//Ženskemu imenu naredimo veliko začetnico
		zenskoIme = zenskoIme.substring(0, 1).toUpperCase() + zenskoIme.substring(1).toLowerCase();
		
		//Iz ArrayLista vzamemo nakljucno ime
		String nakljucniMoski = moski.get( (int)(Math.random() * moski.size()) );
		
		//Izpišemo podatke
		System.out.println("Ime moza je " + nakljucniMoski + " ime zene pa " + zenskoIme + ".");
		System.out.println("Stevilo vseh moskih v ArrayList-u je " + moski.size() + ", dolzina imena Anica pa je prav tako " + moski.size() + ".");
		
	}
	
}