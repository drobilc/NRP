import java.util.*;

public class Naloga01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Stevilo zvezdic: ");
		int steviloZvezdic = in.nextInt();

		//Če je število zvezdic manjše ali enako 0, program zapremo
		//To storimo, zaradi uporabe do ... while zanke, ki se vedno najprej 1x izvede
		if (steviloZvezdic <= 0)
			System.exit(0);

		//Narišemo zvezdice z uporabo for zanke
		for (int i = steviloZvezdic; i > 0; i--) {
			for (int j = i; j > 0; j--)
				System.out.print("*");
			System.out.println();
		}

		//Uporabimo 2 while zanki
		int i = steviloZvezdic;
		int j = 0;
		while (i > 0) {
			j = i;
			while (j > 0){
				System.out.print("*");
				j--;
			}
			System.out.println();
			i--;
		}

		//Uporabimo do ... while zanki
		i = steviloZvezdic;	//Spremenljivk i in j ni potrebno še enkrat deklarirati, ker smo to storili že na vrhu
		j = 0;
		do {
			j = i;
			do {
				System.out.print("*");
				j--;
			} while (j > 0);
			System.out.println();
			i--;
		} while (i > 0);

		//Izrišemo zvezdice preslikane po y osi
		//Uporabimo spremenljvike od prejšnjega primera
		for (i = 0; i < steviloZvezdic; i++){
			//Prva zanka nariše presledke
			for (j = 0; j < i; j++)
				System.out.print(" ");
			//Druga zanka riše zvezdice
			for (; j < steviloZvezdic; j++)
				System.out.print("*");
			System.out.println();
		}

		//Uporaba while zanke
		i = 0;
		j = 0;
		while (i < steviloZvezdic) {
			j = 0;
			//Izrišemo presledke
			while (j < i){
				System.out.print(" ");
				j++;
			}
			//Izrišemo zvezdice
			while (j < steviloZvezdic){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

		//Uporaba do ... while zanke
		i = 0;
		j = 0;
		do {
			j = 0;
			do {
				//Če smo v prvi vrstici nam ni potrebno izrisati nobenega presledka
				if (i == 0)
					break;
				System.out.print(" ");
				j++;
			} while (j < i);
			do {
				System.out.print("*");
				j++;
			} while (j < steviloZvezdic);
			System.out.println();
			i++;
		} while (i < steviloZvezdic);

	}

}
