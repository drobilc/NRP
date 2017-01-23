public class Naloga02 {
	
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
	 * Metoda sortira tabelo znakov z uporabo algoritma z vstavljanjem
	 */
	public static void sortirajVstavljanje(char[] tabela) {
		izpisi(tabela);
		for (int i = 1; i < tabela.length; i++) {
			for (int j = i; j > 0; j--) {
				if (tabela[j] < tabela[j-1]) {
					zamenjaj(tabela, j, j-1);
				}
				else {
					break;
				}
			}
			izpisi(tabela);
		}
	}
	
	/**
	 * Metoda sortira tabelo števil z uporabo algoritma z vstavljanjem
	 */
	public static void sortirajVstavljanje(int[] tabela) {
		izpisi(tabela);
		for (int i = 1; i < tabela.length; i++) {
			for (int j = i; j > 0; j--) {
				if (tabela[j] < tabela[j-1]) {
					zamenjaj(tabela, j, j-1);
				}
				else {
					break;
				}
			}
			izpisi(tabela);
		}
	}
	
	public static void main(String[] args) {
		//Najprej sortiramo tabelo celih števil
		int[] prvaTabela = {8,3,5,9,0,1,4,7,2,6};
		sortirajVstavljanje(prvaTabela);
		
		System.out.println();
		
		//Sortiramo še tabelo znakov
		char[] drugaTabela = {'b', 'i', 'h', 'd', 'f', 'j', 'a', 'c', 'e', 'g'};
		sortirajVstavljanje(drugaTabela);
	}
	
}