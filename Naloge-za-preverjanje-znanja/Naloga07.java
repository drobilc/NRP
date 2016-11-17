public class Naloga07 {
	
	public static boolean jePrastevilo(int stevilo) {
		for (int i = 2; i <= Math.sqrt(stevilo); i++) {
			if (stevilo % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int vrednost;
		for (int x = 0; x < 100; x++) {
			vrednost = (int)(Math.pow(x, 2) + x + 41);
			if (jePrastevilo(vrednost))
				System.out.println(vrednost + " je prastevilo");
			else
				System.out.println(vrednost + " ni prastevilo");
		}
		
	}
	
}