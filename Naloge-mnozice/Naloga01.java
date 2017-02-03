import java.util.*;

public class Naloga01 {
	
	public static void main(String[] args) {
		//Ustvarimo 6 mnozic tipa HashSet(elementi ne bodo urejeni)
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		Set<String> set3 = new HashSet<String>();
		Set<String> unija = new HashSet<String>();
		Set<String> presek = new HashSet<String>();
		Set<String> razlika = new HashSet<String>();
		
		//V prvi set dodamo nize "a", "b" in "c"
		set1.add("a");
		set1.add("b");
		set1.add("c");
		
		//V drugi set dodamo nize "10", "11", "13"
		set2.add("10");
		set2.add("11");
		set2.add("13");
		
		//V tretji set dodamo nize "15", "20", "13"
		set3.add("15");
		set3.add("20");
		set3.add("13");
		
		//Izpisemo vse elemente prvih treh mnozic (ostale so prazne)
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		
		//Naredimo unijo 2 mnozic (vsi elementi iz obeh)
		unija.addAll(set2);
		unija.addAll(set3);
		System.out.println(unija);
		
		//Naredimo presek 2 mnozic (le skupni elementi)
		presek.addAll(set2);
		presek.retainAll(set3);
		System.out.println(presek);
		
		//Izpisemo razliko mnozic (set2 - set3)
		razlika.addAll(set2);
		razlika.removeAll(set3);
		System.out.println(razlika);
		
		//Ker je mnozica razlika ze napolnjena najprej izbrisemo vse elemente
		razlika.clear();
		
		//Izpisemo razliko mnozic (set3 - set2)
		razlika.addAll(set3);
		razlika.removeAll(set2);
		System.out.println(razlika);
		
		//Izbrisemo vse elemente iz mnozice set2 in set3
		set2.clear();
		set3.clear();
		
		//Odstranimo element iz mnozice set1
		set1.remove("c");
		
		//Izpisemo stevilo elementov mnozice set1
		System.out.println(set1.size());
		
		//V mnozico set1 dodamo (se en) "a"
		set1.add("a");
		//Stevilo elementov se ne spremeni (ni podvojitev)
		System.out.println(set1.size());
		
		//Izpisemo ali mnozica vsebuje elementa "a" in "c"
		System.out.println(set1.contains("a"));
		System.out.println(set1.contains("c"));
		
		//Izpisemo mnozico set1
		System.out.println(set1);
		
	}
	
}
