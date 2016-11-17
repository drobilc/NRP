public class Naloga08 {
	
	public static StringBuffer obrniBesede(String n) {
		StringBuffer sb = new StringBuffer(n + " ");
		
		//Premikamo se od leve proti desni in obračamo besede dokler ne dobimo presledka.
		//Ko dobimo presledek vse črke med prejšnjim in trenutnim presledkom zamenjamo z obrnjeno besedo.
		
		//Preprosteje bi bilo morebiti narediti tabelo vseh besed z uporabo metode split, vsako besedo obrniti in združiti nazaj v niz
		String trenutnaBeseda = "";
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) != ' ')
				trenutnaBeseda = sb.charAt(i) + trenutnaBeseda;
			else {
				sb.replace(i - trenutnaBeseda.length(), i, trenutnaBeseda);
				trenutnaBeseda = "";
			}
		}
		
		return sb;
	}
	
	public static void main(String[] args) {		
		System.out.println( obrniBesede("To je prvotni niz").toString() );
	}
	
}