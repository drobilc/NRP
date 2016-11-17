public class Naloga05 {
	
	public static String arrayToString(String[] a, String separator) {
		if (a.length < 1)
			return "";
		
		String rezultat = "";
		for (int i = 0; i < a.length - 1; i++)
			rezultat += a[i] + separator;
		
		rezultat += a[a.length-1];
		
		return rezultat;
	}
	
	public static void main(String[] args) {
		String[] nizi = {"Simon Peter", "Jakob Veliki", "Janez", "Andrej", "Filip", "Bartolomej", "Matej", "Tomaz", "Jakob Mlajsi", "Juda Tadej", "Simon", "Juda Iskarijot"};
		
		System.out.println(arrayToString(nizi, ","));
		System.out.println(arrayToString(nizi, " "));
		System.out.println(arrayToString(nizi, "#"));
		System.out.println(arrayToString(nizi, "..."));
		System.out.println(arrayToString(nizi, "\n"));
		
	}
	
}