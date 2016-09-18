import java.util.*;

public class Naloga08 {
	
	public static String zdruziTabeloPocasna(String[] tabelaNizov) {
		//Zdruzimo tabelo nizov na pocasen nacin (z zanko)
		String zdruzeno = "";
		for (int i = 0; i < tabelaNizov.length; i++)
			zdruzeno += tabelaNizov[i];
		return zdruzeno;
	}
	
	public static String zdruziTabeloHitra(String[] tabelaNizov) {
		//Tabelo zdruzimo z uporabo razreda StringBuffer (to naj bi bil hitrejsi nacin)
		StringBuffer zdruzeno = new StringBuffer();
		for (int i = 0; i < tabelaNizov.length; i++)
			zdruzeno.append(tabelaNizov[i]);
		return zdruzeno.toString();
	}
	
	public static void main(String[] args) {
		
		String[] tabelaNizov = {"#", "V", "Cetrtek", "Sem", "Jedel", "Pokvarjeno", "Cebulo"};
		System.out.println(zdruziTabeloPocasna(tabelaNizov));
		System.out.println(zdruziTabeloHitra(tabelaNizov));
		
	}
	
}
