public class Naloga01 {
	
	/**
	 * Metoda izpiše tabelo števil tabela
	 */
	public static void izpisi(int[] tabela) {
		for (int i = 0; i < tabela.length; i++) {
			System.out.print(tabela[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * Metoda izpiše tabelo znakov tabela
	 */
	public static void izpisi(char[] tabela) {
		for (int i = 0; i < tabela.length; i++) {
			System.out.print(tabela[i] + " ");
		}
		System.out.println();
	}

	/**
	 * Metoda zamenja dve števili v tabeli tabela na indeksih a in b
	 */
	public static void zamenjaj(int[] tabela, int a, int b){
		int zacasna = tabela[a];
		tabela[a] = tabela[b];
		tabela[b] = zacasna;
	}
	
	/**
	 * Metoda zamenja dva znaka v tabeli tabela na indeksih a in b
	 */
	public static void zamenjaj(char[] tabela, int a, int b){
		char zacasna = tabela[a];
		tabela[a] = tabela[b];
		tabela[b] = zacasna;
	}

	/**
	 * Metoda sortira tabelo celoštevilskih vrednosti z uporabo algoritma z izbiranjem
	 */
	public static void sortirajIzbiranje(int[] tabela) {
		izpisi(tabela);

		for (int i = 0; i < tabela.length; i++) {
			int indeksNajmanjsega = i;
			for (int j = i + 1; j < tabela.length; j++) {
				if (tabela[j] < tabela[indeksNajmanjsega]) {
					indeksNajmanjsega = j;
				}
			}
			zamenjaj(tabela, i, indeksNajmanjsega);
			izpisi(tabela);
		}
	}
	
	/**
	 * Metoda sortira tabelo znakov z uporabo algoritma z izbiranjem
	 */
	public static void sortirajIzbiranje(char[] tabela) {
		izpisi(tabela);

		for (int i = 0; i < tabela.length; i++) {
			int indeksNajmanjsega = i;
			for (int j = i + 1; j < tabela.length; j++) {
				if (tabela[j] < tabela[indeksNajmanjsega]) {
					indeksNajmanjsega = j;
				}
			}
			zamenjaj(tabela, i, indeksNajmanjsega);
			izpisi(tabela);
		}
	}
	
	public static void main(String[] args) {
		//Najprej sortiramo tabelo celih števil
		int[] prvaTabela = {8,3,5,9,0,1,4,7,2,6};
		sortirajIzbiranje(prvaTabela);
		
		System.out.println();
		
		//Sortiramo še tabelo znakov
		char[] drugaTabela = {'b', 'i', 'h', 'd', 'f', 'j', 'a', 'c', 'e', 'g'};
		sortirajIzbiranje(drugaTabela);
	}
	
}
