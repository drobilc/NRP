public class Naloga01 {
	
	public static void main(String[] args){
		
		Dijak[] dijaki = new Dijak[100];
		
		for (int i = 0; i < dijaki.length; i++) {
			dijaki[i] = new Dijak();
			dijaki[i].nastaviVpisnoStevilko(i + 1);
			dijaki[i].nastaviIme(nakljucnoIme());
			dijaki[i].nastaviPriimek(nakljucenPriimek());
			dijaki[i].nastaviNaslov(nakljucenNaslov());
			dijaki[i].nastaviEmail(sestaviEmail(dijaki[i].vrniIme(), dijaki[i].vrniPriimek()));
			dijaki[i].nastaviTelefonskoStevilko(nakljucnaTelefonskaStevilka());
			
			System.out.println(dijaki[i].toString());
		}
		
	}
	
	public static String nakljucnoIme() {
		String[] imena = {"Adelina", "Adian", "Adna", "Adin", "Adriana", "Adnan", "Aisa", "Adrijan", "Ajna", "Ajdin", "Ajsa", "Alan", "Aleksandra", "Aldin", "Alenka", "Aleksa", "Alisa", "Aleksandar", "Amadeja", "Alem", "Amalija", "Ales", "Amelie", "Ales", "Amna", "Alexander", "Amra", "Ali", "Ana", "Aljosa", "Ana Marija", "Amin", "Anabela", "Andrej", "Anaja", "Anel", "Anamarija", "Anes", "Anastasia", "Anis", "Anastazija", "Anton", "Angelina", "Arian", "Anita", "Armin", "Anja", "Aron", "Anna", "Bojan", "Ariana", "Borut", "Aurora", "Bostjan", "Barbara", "Damjan", "Barbara", "Dan", "Blazka", "Daniel", "Danaja", "Danijel", "Deja", "Dario", "Dijana", "Daris", "Dora", "Davor", "Doroteja", "Dejan", "Dunja", "Dino", "Eli", "Drejc", "Elisa", "Edi", "Eliza", "Eldin", "Elizabeta", "Eman", "Emili", "Emil", "Emilija", "Enis", "Eneja", "Ervin", "Enja", "Florjan", "Erin", "Fran", "Eva", "Franc", "Evelin", "Gabrijel", "Evelina", "Gaj", "Evelyn", "Grega", "Evita", "Gregor", "Franciska"};
		return imena[(int)(Math.random() * imena.length)];
	}
	
	public static String nakljucenPriimek() {
		String[] priimki = {"Novak", "Horvat", "Krajnc", "Kovacic", "Zupancic", "Kovac", "Potocnik", "Mlakar", "Vidmar", "Golob", "Kos", "Bozic", "Turk", "Kralj", "Korosec", "Zupan", "Bizjak", "Hribar", "Kotnik", "Rozman", "Kavcic", "Petek", "Kolar", "Hocevar", "Kastelic", "Zagar", "Oblak", "Koren", "Kosir", "Klemencic", "Zajc", "Medved", "Knez", "Zupanc", "Pirc", "Hrovat", "Pavlic", "Petric", "Kuhar", "Lah", "Zorko", "Ursic", "Sever", "Babic", "Majcen", "Tomazic", "Jerman", "Erjavec", "Jereb", "Kranjc", "Pusnik", "Rupnik", "Lesjak", "Breznik", "Pecnik", "Perko", "Vidic", "Dolenc", "Pavlin", "Furlan", "Mocnik", "Tomsic", "Janezic", "Ribic", "Jenko", "Logar", "Znidarsic", "Macek", "Cerne", "Lesnik", "Zadravec", "Fras", "Gregoric", "Jelen", "Marolt", "Blatnik", "Mihelic", "Pintar", "Bezjak", "Kokalj", "Hren", "Jug", "Ceh", "Leban", "Vidovic", "Cerar", "Rus", "Primozic", "Kocjancic", "Kobal", "Kolenc", "Nemec", "Dolinar", "Lazar", "Kolaric", "Kosi", "Lavric", "Kodric", "Bogataj", "Mrak"};
		return priimki[(int)(Math.random() * priimki.length)];
	}
	
	public static String nakljucenNaslov() {
		String[] prostor = {"Cesta", "Ulica", "Drevored", "Trg"};
		return prostor[(int)(Math.random() * prostor.length)] + " " + nakljucnoIme() + "a " + nakljucenPriimek() + "a " + ((int)(Math.random()*100+1));
	}

	public static String sestaviEmail(String ime, String priimek) {
		return (ime + "." + priimek + "@email.si").toLowerCase();
	}
	
	public static String nakljucnaTelefonskaStevilka() {
		String[] predpone = {"030", "031", "040", "041", "051", "070", "068"};
		String telefonskaStevilka = predpone[(int)(Math.random() * predpone.length)];
		while (telefonskaStevilka.length() < 9)
			telefonskaStevilka += (int)(Math.random() * 10);
		return telefonskaStevilka;
	}
	
}





































