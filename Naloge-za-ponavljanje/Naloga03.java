import java.util.*;

public class Naloga03 {
	
	public static double povprecnaVrednostElementov(int[][] tabela) {
		double vsota = 0;
		for (int y = 0; y < tabela.length; y++)
			for (int x = 0; x < tabela[y].length; x++)
				vsota += tabela[y][x];
		return vsota / (tabela.length * tabela[0].length);
	}
	
	public static int[][] vnos() {
		Scanner vhod = new Scanner(System.in);
		
		//Preberemo podatke od uporabnika
		System.out.print("Velikost tabele (x):");
		int velikostX = vhod.nextInt();
		
		System.out.print("Velikost tabele (y):");
		int velikostY = vhod.nextInt();
		
		//Deklariramo in inicializiramo tabelo
		int[][] tabela = new int[velikostY][velikostX];
		
		//Preberemo elemente tabele in jih vpišemo v tabelo
		for (int y = 0; y < tabela.length; y++) {
			for (int x = 0; x < tabela[y].length; x++) {
				System.out.print("tabela[" + y + ", " + x + "] = ");
				tabela[y][x] = vhod.nextInt();
			}
		}
		
		return tabela;
	}
	
	public static void izpis(int[][] tabela) {
		for (int y = 0; y < tabela.length; y++) {
			for (int x = 0; x < tabela[y].length; x++) {
				System.out.print(tabela[y][x]);
				if (x < tabela[y].length - 1)
					System.out.print(", ");
			}
			System.out.println();
		}
	}
	
	public static int max(int[][] tabela) {
		int najvecji = tabela[0][0];
		for (int y = 0; y < tabela.length; y++)
			for (int x = 0; x < tabela[y].length; x++)
				if (tabela[y][x] > najvecji)
					najvecji = tabela[y][x];
		return najvecji;
	}
	
	public static double povprecje(int[][] tabela) {
		double vsota = 0;
		for (int y = 0; y < tabela.length; y++)
			for (int x = 0; x < tabela[y].length; x++)
				vsota += tabela[y][x];
		return vsota / (tabela.length * tabela[0].length);
	}
	
	public static void main(String[] args) {
		int[][] tabela = vnos();	//Preberemo podatke
		int najvecjeStevilo = max(tabela);	//Najdemo največje število v tabeli
		double povprecjeElementov = povprecje(tabela);	//Izračunamo povprečje elementov v tabeli
		
		System.out.println("---------------------------------");
		izpis(tabela);
		System.out.println("---------------------------------");
		
		System.out.println("Najvecje stevilo v tabeli je " + najvecjeStevilo + ".");
		System.out.println("Povprecje stevil v tabeli je " + povprecjeElementov + ".");
		System.out.println("Najvecje stevilo se od povprecja razlikuje za " + (najvecjeStevilo - povprecjeElementov) + ".");
	}
	
}