public class Naloga04 {
	
	public static void main(String[] args) {
		
		//Ustvarimo nov objekt Datum
		Datum mojRojstniDatum = new Datum(19, 4, 1998);
		
		//Izpisemo datum locen s pikami
		System.out.println(mojRojstniDatum.zdruzi("."));
		
		//Izpisemo datum locen s pomisljajem
		String datumSPomisljajem = mojRojstniDatum.zdruzi("-");
		System.out.println(datumSPomisljajem);
		
		//Ce izpisemo samo objekt, nam java dejansko nad objektom klice funkcijo toString
		System.out.println(mojRojstniDatum);
		
	}
	
}