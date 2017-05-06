public class Naloga17 {

	public static void zamenjaj(byte[] tabela, int a, int b){
		byte zacasna = tabela[a];
		tabela[a] = tabela[b];
		tabela[b] = zacasna;
	}

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

	public static void sortirajMehurcnoNarascajoce(byte[] tabela) {
		for (int i = tabela.length - 1; i >= 0; i--) {
			for (int j = tabela.length - 1; j > tabela.length - i - 1; j--) {
				if (tabela[j] < tabela[j - 1]) {
					zamenjaj(tabela, j, j - 1);
				}
			}
		}
	}

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

	public static void sortirajMehurcnoPadajoce(byte[] tabela) {
		for (int i = tabela.length - 1; i >= 0; i--) {
			for (int j = tabela.length - 1; j > tabela.length - i - 1; j--) {
				if (tabela[j] > tabela[j - 1]) {
					zamenjaj(tabela, j, j - 1);
				}
			}
		}
	}

	public static void main(String[] args) {
		
		byte[] tabela = new byte[10000];
		for (int i = 0; i < tabela.length; i++) {
			tabela[i] = (byte)(Math.random() * 200 + 1);
		}

		System.out.println("\nUrejanje nakljucno generirane tabele:");

		System.out.println(" * UREJANJE Z IZBIRANJEM");

		byte[] zacasnaTabela = tabela.clone();
		Timer timer = new Timer();
		timer.start();
		sortirajIzbiranjeNarascajoce(zacasnaTabela);
		timer.stop();
		timer.diff();
		System.out.println("    * narascajoce: " + timer.toString());

		zacasnaTabela = tabela.clone();
		timer = new Timer();
		timer.start();
		sortirajIzbiranjePadajoce(zacasnaTabela);
		timer.stop();
		timer.diff();
		System.out.println("    * padajoce:    " + timer.toString());

		System.out.println(" * UREJANJE Z VSTAVLJANJEM");

		zacasnaTabela = tabela.clone();
		timer = new Timer();
		timer.start();
		sortirajVstavljanjeNarascajoce(zacasnaTabela);
		timer.stop();
		timer.diff();
		System.out.println("    * narascajoce: " + timer.toString());

		zacasnaTabela = tabela.clone();
		timer = new Timer();
		timer.start();
		sortirajVstavljanjePadajoce(zacasnaTabela);
		timer.stop();
		timer.diff();
		System.out.println("    * padajoce:    " + timer.toString());

		System.out.println(" * MEHURCNO UREJANJE");

		zacasnaTabela = tabela.clone();
		timer = new Timer();
		timer.start();
		sortirajMehurcnoNarascajoce(zacasnaTabela);
		timer.stop();
		timer.diff();
		System.out.println("    * narascajoce: " + timer.toString());

		zacasnaTabela = tabela.clone();
		timer = new Timer();
		timer.start();
		sortirajMehurcnoPadajoce(zacasnaTabela);
		timer.stop();
		timer.diff();
		System.out.println("    * padajoce:    " + timer.toString());

		//Uredili bomo narascajoce urejeno tabelo
		sortirajMehurcnoNarascajoce(tabela);

		System.out.println("\nNarascajoce urejeni podatki:");

		System.out.println(" * UREJANJE Z IZBIRANJEM");

		zacasnaTabela = tabela.clone();
		timer = new Timer();
		timer.start();
		sortirajIzbiranjeNarascajoce(zacasnaTabela);
		timer.stop();
		timer.diff();
		System.out.println("    * narascajoce: " + timer.toString());

		zacasnaTabela = tabela.clone();
		timer = new Timer();
		timer.start();
		sortirajIzbiranjePadajoce(zacasnaTabela);
		timer.stop();
		timer.diff();
		System.out.println("    * padajoce:    " + timer.toString());

		System.out.println(" * UREJANJE Z VSTAVLJANJEM");

		zacasnaTabela = tabela.clone();
		timer = new Timer();
		timer.start();
		sortirajVstavljanjeNarascajoce(zacasnaTabela);
		timer.stop();
		timer.diff();
		System.out.println("    * narascajoce: " + timer.toString());

		zacasnaTabela = tabela.clone();
		timer = new Timer();
		timer.start();
		sortirajVstavljanjePadajoce(zacasnaTabela);
		timer.stop();
		timer.diff();
		System.out.println("    * padajoce:    " + timer.toString());

		System.out.println(" * MEHURCNO UREJANJE");

		zacasnaTabela = tabela.clone();
		timer = new Timer();
		timer.start();
		sortirajMehurcnoNarascajoce(zacasnaTabela);
		timer.stop();
		timer.diff();
		System.out.println("    * narascajoce: " + timer.toString());

		zacasnaTabela = tabela.clone();
		timer = new Timer();
		timer.start();
		sortirajMehurcnoPadajoce(zacasnaTabela);
		timer.stop();
		timer.diff();
		System.out.println("    * padajoce:    " + timer.toString());

		//Uredili bomo se padajoce urejeno tabelo
		sortirajMehurcnoPadajoce(tabela);

		System.out.println("\nPadajoce urejeni podatki:");

		System.out.println(" * UREJANJE Z IZBIRANJEM");

		zacasnaTabela = tabela.clone();
		timer = new Timer();
		timer.start();
		sortirajIzbiranjeNarascajoce(zacasnaTabela);
		timer.stop();
		timer.diff();
		System.out.println("    * narascajoce: " + timer.toString());

		zacasnaTabela = tabela.clone();
		timer = new Timer();
		timer.start();
		sortirajIzbiranjePadajoce(zacasnaTabela);
		timer.stop();
		timer.diff();
		System.out.println("    * padajoce:    " + timer.toString());

		System.out.println(" * UREJANJE Z VSTAVLJANJEM");

		zacasnaTabela = tabela.clone();
		timer = new Timer();
		timer.start();
		sortirajVstavljanjeNarascajoce(zacasnaTabela);
		timer.stop();
		timer.diff();
		System.out.println("    * narascajoce: " + timer.toString());

		zacasnaTabela = tabela.clone();
		timer = new Timer();
		timer.start();
		sortirajVstavljanjePadajoce(zacasnaTabela);
		timer.stop();
		timer.diff();
		System.out.println("    * padajoce:    " + timer.toString());

		System.out.println(" * MEHURCNO UREJANJE");

		zacasnaTabela = tabela.clone();
		timer = new Timer();
		timer.start();
		sortirajMehurcnoNarascajoce(zacasnaTabela);
		timer.stop();
		timer.diff();
		System.out.println("    * narascajoce: " + timer.toString());

		zacasnaTabela = tabela.clone();
		timer = new Timer();
		timer.start();
		sortirajMehurcnoPadajoce(zacasnaTabela);
		timer.stop();
		timer.diff();
		System.out.println("    * padajoce:    " + timer.toString());

	}

}