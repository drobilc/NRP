public class Naloga03 {
	
	public static void main(String[] args) {
		
		//Naredimo 2 zaposlena, prvi ima placo 50600, drugi pa 121000
		Zaposleni robert = new Zaposleni("Robert", "Tanko", 50600);
		Zaposleni nina = new Zaposleni("Nina", "Zorzut", 121000);
		
		//Izpisemo podatke obeh zaposlenih
		System.out.println(robert.toString());
		System.out.println(nina.toString());
		
		//Izpisemo placo prvega zaposlenega (Roberta)
		System.out.println("Prvi zaposleni ima placo " + robert.vrniDohodek() + " eur");
		System.out.println("Drugi zaposleni ima placo " + nina.vrniDohodek() + " eur");
		
		//Prvemu zaposlenemu rocno povecamo placo za 10%
		int prejsniDohodek = robert.vrniDohodek();
		double novDohodek = ((double)prejsniDohodek) * 1.1;
		//Mnozenje z 1.1 je enako kot pristevanje 10% trenutni vrednosti
		robert.nastaviDohodek((int)novDohodek);
		
		//Drugemo zaposlenemu nastavimo placo s pomocjo funkcije povecajDohodek
		nina.povecajDohodek(10);
		
		//Izpisemo podatke obeh zaposlenih
		System.out.println(robert.toString());
		System.out.println(nina.toString());
		
	}
	
}