public class Naloga02 {
	
	public static void napolniTabelo(int[][] tabela) {
		for (int y = 0; y < tabela.length; y++)
			for (int x = 0; x < tabela[y].length; x++)
				tabela[y][x] = (int)(Math.random() * 101 + 100);
	}
	
	public static double povprecnaVrednostElementov(int[][] tabela) {
		double vsota = 0;
		for (int y = 0; y < tabela.length; y++)
			for (int x = 0; x < tabela[y].length; x++)
				vsota += tabela[y][x];
		return vsota / (tabela.length * tabela[0].length);
	}
	
	public static int steviloSodihElementov(int[][] tabela) {
		int stevilo = 0;
		for (int y = 0; y < tabela.length; y++)
			for (int x = 0; x < tabela[y].length; x++)
				if (tabela[y][x] % 2 == 0)
					stevilo += 1;
		return stevilo;
	}
	
	public static void main(String[] args) {
		
		int[][] tabela = new int[10][10];
		napolniTabelo(tabela);
		
		double povprecnaVrednost = povprecnaVrednostElementov(tabela);
		int steviloSodih = steviloSodihElementov(tabela);
		
		System.out.println("Povprecna vrednost elementov v tabeli je " + povprecnaVrednost + ".");
		System.out.println("V tabeli je " + steviloSodih + " sodih stevil.");
		
	}
	
}