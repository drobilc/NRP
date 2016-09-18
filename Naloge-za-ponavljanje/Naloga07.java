public class Naloga07 {
	
	public static void main(String[] args) {
		
		Barve b = new Barve();
		int stevilkaBarve = b.BarvaVStevilo("Bela");
		System.out.println(stevilkaBarve);
		String barva = b.SteviloVBarvo( 3 );
		System.out.println( barva );
		
	}
	
}