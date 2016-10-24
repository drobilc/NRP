public class Naloga03 {
	
	public static void main(String[] args) {
		
		String original = "SKRIVNOST";
		System.out.println(original);
		System.out.println(rekurzivnoKodiraj(original));
		System.out.println(iterativnoKodiraj(original));
		
	}
	
	/* Metoda kot vhod prejme dva znaka in vrne znak vhod, zakodiran z znakom kljuc */
	private static char kodiraj(char kljuc, char vhod) {
		return (char)(((int)vhod + (int)kljuc) % 26 + 65);
	}
	
	/* Metoda kot vhod prejme niz in ga rekurzivno zakodira s pomočjo metode kodiraj
	private static String rekurzivnoKodiraj(String niz) {		
		if (niz.length() <= 1)
			return niz;
		
		char prvaCrka = niz.charAt(0);
		char drugaCrka = niz.charAt(1);
		
		String vseRazenPrvihDvehCrk = niz.substring(2);
		
		return prvaCrka + rekurzivnoKodiraj(kodiraj(prvaCrka, drugaCrka) + vseRazenPrvihDvehCrk);
	} */
	private static String rekurzivnoKodiraj(String niz) {
		if (niz.length() <= 1)
			return niz;
		return niz.charAt(0) + rekurzivnoKodiraj(kodiraj(niz.charAt(0), niz.charAt(1)) + niz.substring(2));
	}
	
	/* Metoda kot vhod prejme niz in ga iterativno zakodira s pomočjo metode kodiraj */
	private static String iterativnoKodiraj(String niz) {
		String izhod = niz.charAt(0) + "";
		for (int i = 0; i < niz.length() - 1; i++)
			izhod += kodiraj(izhod.charAt(i), niz.charAt(i + 1));
		return izhod;
	}
	
}
