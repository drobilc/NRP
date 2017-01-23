public class Naloga04 {
	
	/**
	 * Metoda zamenja dve števili v tabeli tabela na indeksih a in b
	 */
	public static void zamenjaj(byte[] tabela, int a, int b){
		byte zacasna = tabela[a];
		tabela[a] = tabela[b];
		tabela[b] = zacasna;
	}
	
	/**
	 * Metoda sortira tabelo z uporabo algoritma z izbiranjem naraščajoče
	 */
	public static void sortirajIzbiranjeNarascajoce(byte[] tabela) {
		for (int i = 0; i < tabela.length; i++) {
			int indeksNajmanjsega = i;
			for (int j = i + 1; j < tabela.length; j++) {
				if (tabela[j] < tabela[indeksNajmanjsega]) {
					indeksNajmanjsega = j;
				}
			}
			zamenjaj(tabela, i, indeksNajmanjsega);
		}
	}

	/**
	 * Metoda sortira tabelo z uporabo algoritma z vstavljanjem naraščajoče
	 */
	public static void sortirajVstavljanjeNarascajoce(byte[] tabela) {
		for (int i = 1; i < tabela.length; i++) {
			for (int j = i; j > 0; j--) {
				if (tabela[j] < tabela[j-1]) {
					zamenjaj(tabela, j, j-1);
				}
				else {
					break;
				}
			}
		}
	}

	/**
	 * Metoda sortira tabelo z uporabo mehurčnega algoritma naraščajoče
	 */
	public static void sortirajMehurcnoNarascajoce(byte[] tabela) {
		for (int i = tabela.length - 1; i >= 0; i--) {
			for (int j = tabela.length - 1; j > tabela.length - i - 1; j--) {
				if (tabela[j] < tabela[j - 1]) {
					zamenjaj(tabela, j, j - 1);
				}
			}
		}
	}
	
	/**
	 * Metoda sortira tabelo z uporabo algoritma z izbiranjem padajoče
	 */
	public static void sortirajIzbiranjePadajoce(byte[] tabela) {
		for (int i = 0; i < tabela.length; i++) {
			int indeksNajmanjsega = i;
			for (int j = i + 1; j < tabela.length; j++) {
				if (tabela[j] > tabela[indeksNajmanjsega]) {
					indeksNajmanjsega = j;
				}
			}
			zamenjaj(tabela, i, indeksNajmanjsega);
		}
	}

	/**
	 * Metoda sortira tabelo z uporabo algoritma z vstavljanjem padajoče
	 */
	public static void sortirajVstavljanjePadajoce(byte[] tabela) {
		for (int i = 1; i < tabela.length; i++) {
			for (int j = i; j > 0; j--) {
				if (tabela[j] > tabela[j-1]) {
					zamenjaj(tabela, j, j-1);
				}
				else {
					break;
				}
			}
		}
	}

	/**
	 * Metoda sortira tabelo z uporabo mehurčnega algoritma padajoče
	 */
	public static void sortirajMehurcnoPadajoce(byte[] tabela) {
		for (int i = tabela.length - 1; i >= 0; i--) {
			for (int j = tabela.length - 1; j > tabela.length - i - 1; j--) {
				if (tabela[j] > tabela[j - 1]) {
					zamenjaj(tabela, j, j - 1);
				}
			}
		}
	}
	
	public static String pretroviCas(/* It's been a */ long time /* without you my friend */) {
		long millis = (long)(time / 1000000);
		return millis + "ms";
	}
	
	public static void main(String[] args) {
		byte[] tabela = new byte[10000];
		for (int i = 0; i < tabela.length; i++) {
			tabela[i] = (byte)(Math.random() * 200 + 1);
		}
		
		System.out.println("\nUrejanje nakljucno generirane tabele:");
		
		System.out.println(" * UREJANJE Z IZBIRANJEM");
		
		byte[] zacasnaTabela = tabela.clone();
		long zacetek = System.nanoTime();
		sortirajIzbiranjeNarascajoce(zacasnaTabela);
		long konec = System.nanoTime();
		System.out.println("    * narascajoce: " + pretroviCas(konec - zacetek));
		
		zacasnaTabela = tabela.clone();
		zacetek = System.nanoTime();
		sortirajIzbiranjePadajoce(zacasnaTabela);
		konec = System.nanoTime();
		System.out.println("    * padajoce:    " + pretroviCas(konec - zacetek));
		
		System.out.println(" * UREJANJE Z VSTAVLJANJEM");
		
		zacasnaTabela = tabela.clone();
		zacetek = System.nanoTime();
		sortirajVstavljanjeNarascajoce(zacasnaTabela);
		konec = System.nanoTime();
		System.out.println("    * narascajoce: " + pretroviCas(konec - zacetek));
		
		zacasnaTabela = tabela.clone();
		zacetek = System.nanoTime();
		sortirajVstavljanjePadajoce(zacasnaTabela);
		konec = System.nanoTime();
		System.out.println("    * padajoce:    " + pretroviCas(konec - zacetek));
		
		System.out.println(" * MEHURCNO UREJANJE");
		
		zacasnaTabela = tabela.clone();
		zacetek = System.nanoTime();
		sortirajMehurcnoNarascajoce(zacasnaTabela);
		konec = System.nanoTime();
		System.out.println("    * narascajoce: " + pretroviCas(konec - zacetek));
		
		zacasnaTabela = tabela.clone();
		zacetek = System.nanoTime();
		sortirajMehurcnoPadajoce(zacasnaTabela);
		konec = System.nanoTime();
		System.out.println("    * padajoce:    " + pretroviCas(konec - zacetek));
		
		//Uredili bomo narascajoce urejeno tabelo
		sortirajMehurcnoNarascajoce(tabela);
		
		System.out.println("\nNarascajoce urejeni podatki:");
		
		System.out.println(" * UREJANJE Z IZBIRANJEM");
		
		zacasnaTabela = tabela.clone();
		zacetek = System.nanoTime();
		sortirajIzbiranjeNarascajoce(zacasnaTabela);
		konec = System.nanoTime();
		System.out.println("    * narascajoce: " + pretroviCas(konec - zacetek));
		
		zacasnaTabela = tabela.clone();
		zacetek = System.nanoTime();
		sortirajIzbiranjePadajoce(zacasnaTabela);
		konec = System.nanoTime();
		System.out.println("    * padajoce:    " + pretroviCas(konec - zacetek));
		
		System.out.println(" * UREJANJE Z VSTAVLJANJEM");
		
		zacasnaTabela = tabela.clone();
		zacetek = System.nanoTime();
		sortirajVstavljanjeNarascajoce(zacasnaTabela);
		konec = System.nanoTime();
		System.out.println("    * narascajoce: " + pretroviCas(konec - zacetek));
		
		zacasnaTabela = tabela.clone();
		zacetek = System.nanoTime();
		sortirajVstavljanjePadajoce(zacasnaTabela);
		konec = System.nanoTime();
		System.out.println("    * padajoce:    " + pretroviCas(konec - zacetek));
		
		System.out.println(" * MEHURCNO UREJANJE");
		
		zacasnaTabela = tabela.clone();
		zacetek = System.nanoTime();
		sortirajMehurcnoNarascajoce(zacasnaTabela);
		konec = System.nanoTime();
		System.out.println("    * narascajoce: " + pretroviCas(konec - zacetek));
		
		zacasnaTabela = tabela.clone();
		zacetek = System.nanoTime();
		sortirajMehurcnoPadajoce(zacasnaTabela);
		konec = System.nanoTime();
		System.out.println("    * padajoce:    " + pretroviCas(konec - zacetek));
		
		//Uredili bomo se padajoce urejeno tabelo
		sortirajMehurcnoPadajoce(tabela);
		
		System.out.println("\nPadajoce urejeni podatki:");
		
		System.out.println(" * UREJANJE Z IZBIRANJEM");
		
		zacasnaTabela = tabela.clone();
		zacetek = System.nanoTime();
		sortirajIzbiranjeNarascajoce(zacasnaTabela);
		konec = System.nanoTime();
		System.out.println("    * narascajoce: " + pretroviCas(konec - zacetek));
		
		zacasnaTabela = tabela.clone();
		zacetek = System.nanoTime();
		sortirajIzbiranjePadajoce(zacasnaTabela);
		konec = System.nanoTime();
		System.out.println("    * padajoce:    " + pretroviCas(konec - zacetek));
		
		System.out.println(" * UREJANJE Z VSTAVLJANJEM");
		
		zacasnaTabela = tabela.clone();
		zacetek = System.nanoTime();
		sortirajVstavljanjeNarascajoce(zacasnaTabela);
		konec = System.nanoTime();
		System.out.println("    * narascajoce: " + pretroviCas(konec - zacetek));
		
		zacasnaTabela = tabela.clone();
		zacetek = System.nanoTime();
		sortirajVstavljanjePadajoce(zacasnaTabela);
		konec = System.nanoTime();
		System.out.println("    * padajoce:    " + pretroviCas(konec - zacetek));
		
		System.out.println(" * MEHURCNO UREJANJE");
		
		zacasnaTabela = tabela.clone();
		zacetek = System.nanoTime();
		sortirajMehurcnoNarascajoce(zacasnaTabela);
		konec = System.nanoTime();
		System.out.println("    * narascajoce: " + pretroviCas(konec - zacetek));
		
		zacasnaTabela = tabela.clone();
		zacetek = System.nanoTime();
		sortirajMehurcnoPadajoce(zacasnaTabela);
		konec = System.nanoTime();
		System.out.println("    * padajoce:    " + pretroviCas(konec - zacetek));
		
	}
	
}