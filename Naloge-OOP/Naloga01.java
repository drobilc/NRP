public class Naloga01 {
	
	public static void main(String[] args) {
		
		//Ustvarimo 2 objekta tipa Ime
		Ime mojeIme = new Ime("Niki");
		Ime niMojeIme = new Ime("Borut");
		
		//Izpisemo obe imeni (klicemo metodo vrniIme() nad razredom Ime)
		System.out.println("Moje ime je " + mojeIme.vrniIme() + ".");
		System.out.print("Raje kot to, bi se imenoval " + niMojeIme.vrniIme() + ", ");
		
		niMojeIme.nastaviIme("Robert");
		System.out.println("ali celo " + niMojeIme.vrniIme() + ".");
		
		System.out.println("Amen!");
		
	}
}