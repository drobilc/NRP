public class Naloga03 {
	
	/**
	 * Metoda izpi�e tabelo �tevil tabela
	 */
	public static void izpisi(int[] tabela) {
		for (int i = 0; i < tabela.length; i++) {
			System.out.print(tabela[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * Metoda izpi�e tabelo znakov tabela
	 */
	public static void izpisi(char[] tabela) {
		for (int i = 0; i < tabela.length; i++) {
			System.out.print(tabela[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * Metoda zamenja dve �tevili v tabeli tabela na indeksih a in b
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
	 * Metoda sortira tabelo znakov z uporabo mehur�nega algoritma
	 */
	public static void sortirajMehurcno(char[] tabela) {
		izpisi(tabela);
		for (int i = tabela.length - 1; i >= 0; i--) {
			for (int j = tabela.length - 1; j > tabela.length - i - 1; j--) {
				if (tabela[j] < tabela[j - 1]) {
					zamenjaj(tabela, j, j - 1);
				}
			}
			izpisi(tabela);
		}
	}
	
	/**
	 * Metoda sortira tabelo �tevil z uporabo mehur�nega algoritma
	 */
	public static void sortirajMehurcno(int[] tabela) {
		izpisi(tabela);
		for (int i = tabela.length - 1; i >= 0; i--) {
			for (int j = tabela.length - 1; j > tabela.length - i - 1; j--) {
				if (tabela[j] < tabela[j - 1]) {
					zamenjaj(tabela, j, j - 1);
				}
			}
			izpisi(tabela);
		}
	}
	
	public static void main(String[] args) {
		//Najprej sortiramo tabelo celih �tevil
		int[] prvaTabela = {8,3,5,9,0,1,4,7,2,6};
		sortirajMehurcno(prvaTabela);
		
		System.out.println();
		
		//Sortiramo �e tabelo znakov
		char[] drugaTabela = {'b', 'i', 'h', 'd', 'f', 'j', 'a', 'c', 'e', 'g'};
		sortirajMehurcno(drugaTabela);
	}
	
}