public class Naloga19 {

	public static void main(String[] args) {
		
		Pacient[] pacienti = new Pacient[30];
		
		//Z zanko napolnimo tabelo pacientov in podatke izpišemo
		for (int i = 0; i < pacienti.length; i++) {
			pacienti[i] = new Pacient(nakljucnoIme(), nakljucenPriimek(), nakljucnaKrvnaSkupina());
			System.out.println(pacienti[i]);
		}
		
	}
	
	public static String nakljucnoIme() {
		String[] imena = {"Adelina", "Adian", "Adna", "Adin", "Adriana", "Adnan", "Aisa", "Adrijan", "Ajna", "Ajdin", "Ajsa", "Alan", "Aleksandra", "Aldin", "Alenka", "Aleksa", "Alisa", "Aleksandar", "Amadeja", "Alem", "Amalija", "Ales", "Amelie", "Ales", "Amna", "Alexander", "Amra", "Ali", "Ana", "Aljosa", "Ana Marija", "Amin", "Anabela", "Andrej", "Anaja", "Anel", "Anamarija", "Anes", "Anastasia", "Anis", "Anastazija", "Anton", "Angelina", "Arian", "Anita", "Armin", "Anja", "Aron", "Anna", "Bojan", "Ariana", "Borut", "Aurora", "Bostjan", "Barbara", "Damjan", "Barbara", "Dan", "Blazka", "Daniel", "Danaja", "Danijel", "Deja", "Dario", "Dijana", "Daris", "Dora", "Davor", "Doroteja", "Dejan", "Dunja", "Dino", "Eli", "Drejc", "Elisa", "Edi", "Eliza", "Eldin", "Elizabeta", "Eman", "Emili", "Emil", "Emilija", "Enis", "Eneja", "Ervin", "Enja", "Florjan", "Erin", "Fran", "Eva", "Franc", "Evelin", "Gabrijel", "Evelina", "Gaj", "Evelyn", "Grega", "Evita", "Gregor", "Franciska"};
		return imena[(int)(Math.random()*imena.length)];
	}
	
	public static String nakljucenPriimek() {
		String[] priimki = {"Novak", "Horvat", "Krajnc", "Kovacic", "Zupancic", "Kovac", "Potocnik", "Mlakar", "Vidmar", "Golob", "Kos", "Bozic", "Turk", "Kralj", "Korosec", "Zupan", "Bizjak", "Hribar", "Kotnik", "Rozman", "Kavcic", "Petek", "Kolar", "Hocevar", "Kastelic", "Zagar", "Oblak", "Koren", "Kosir", "Klemencic", "Zajc", "Medved", "Knez", "Zupanc", "Pirc", "Hrovat", "Pavlic", "Petric", "Kuhar", "Lah", "Zorko", "Ursic", "Sever", "Babic", "Majcen", "Tomazic", "Jerman", "Erjavec", "Jereb", "Kranjc", "Pusnik", "Rupnik", "Lesjak", "Breznik", "Pecnik", "Perko", "Vidic", "Dolenc", "Pavlin", "Furlan", "Mocnik", "Tomsic", "Janezic", "Ribic", "Jenko", "Logar", "Znidarsic", "Macek", "Cerne", "Lesnik", "Zadravec", "Fras", "Gregoric", "Jelen", "Marolt", "Blatnik", "Mihelic", "Pintar", "Bezjak", "Kokalj", "Hren", "Jug", "Ceh", "Leban", "Vidovic", "Cerar", "Rus", "Primozic", "Kocjancic", "Kobal", "Kolenc", "Nemec", "Dolinar", "Lazar", "Kolaric", "Kosi", "Lavric", "Kodric", "Bogataj", "Mrak"};
		return priimki[(int)(Math.random()*priimki.length)];
	}
	
	public static String nakljucnaKrvnaSkupina() {
		String[] skupine = {"A", "B", "0"};
		String znak = (int)(Math.random()*2) == 0 ? "+" : "-";
		return skupine[(int)(Math.random()*skupine.length)] + znak;
	}

}