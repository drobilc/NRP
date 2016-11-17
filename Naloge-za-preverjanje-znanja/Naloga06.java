public class Naloga06 {
	
	public static void najboljeOcenjeni(double[][] ocene) {
		int steviloIzvrstnih = 0;
		for (int i = 0; i < ocene.length; i++) {
			for (int j = 0; j < ocene[i].length; j++) {
				if (ocene[i][j] == 20.0) {
					System.out.println("Skakalec s startno stevilko " + (i+1) + " je dobil dvajsetico!");
					steviloIzvrstnih++;
					break;
				}
			}
		}
		if (steviloIzvrstnih == 0)
			System.out.println("Noben skakalec ni dobil ocene 20.");
	}
	
	public static void main(String[] args) {
		
		double[][] ocene = new double[50][5];
		
		//Napolnimo tabelo z naključnimi vrednostmi med 0 in 20.
		for (int i = 0; i < ocene.length; i++) {
			for (int j = 0; j < ocene[i].length; j++) {
				ocene[i][j] = (int)(Math.random() * 201) / 10.0;
			}
		}
		
		//Izpišemo tabelo
		for (int i = 0; i < ocene.length; i++) {
			for (int j = 0; j < ocene[i].length; j++) {
				System.out.printf("%6.1f", ocene[i][j]);
			}
			System.out.println();
		}
		
		najboljeOcenjeni(ocene);
		
	}
	
}