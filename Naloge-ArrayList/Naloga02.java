import java.util.*;

public class Naloga02 {
	
	public static void main (String[] args) {
		
		ArrayList<Sola> sole = new ArrayList<>();
		sole.add( new Sola("TSC_NG", "Tigri") );
		sole.add( new Sola("Gimnazija_NG", "Kanarcki") );
		sole.add( new Sola("Ekonomska_NG", "Medvedi") );
		sole.add( new Sola("TSC_KR", "Carovniki") );
		sole.add( new Sola("Gimnazija_Siska", "RdeceSence") );
		
		//Na tretje mesto vstavimo novo šolo
		sole.add(2, new Sola("Vegova", "Rusilci") );
		
		//Izpišemo vse šole s pomočjo for-each stavka
		for (Sola trenutnaSola: sole) {
			System.out.println(trenutnaSola);
		}
		
		System.out.println();
		
		//Razvrstimo šole v padajočem vrstnem redu
		Collections.sort(sole, new Comparator(){
			public int compare(Object o1, Object o2) {
				Sola p1 = (Sola) o1;
				Sola p2 = (Sola) o2;
				return p1.getSola().compareToIgnoreCase(p2.getSola());
			}
		});
		
		//Izpišemo jih v obratnem vrstnem redu
		int i = sole.size() - 1;
		while (i >= 0){
			System.out.println(sole.get(i));
			i--;
		}
		
		System.out.println();
		
		//Izbrišemo šolo, ki je na drugem mestu
		sole.remove(1);
		
		//Izpišemo šole s pomočjo zanke for
		for (i = 0; i < sole.size(); i++) {
			System.out.println(sole.get(i));
		}
		
	}
	
}