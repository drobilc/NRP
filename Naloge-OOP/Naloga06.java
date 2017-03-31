public class Naloga06 {
	
	public static void main(String[] args) {
		
		//Ustvarimo tabelo knjig
		Knjiga[] tabelaKnjig = new Knjiga[30];
		
		//Dodamo 5 knjig (kar na prvih 5 mest v tabeli)
		tabelaKnjig[0] = new Knjiga("978-961-00-0627-5", "Izvor magije", "Terry Pratchett", "Ucila International");
		tabelaKnjig[1] = new Knjiga("978-961-01-1838-1", "Harry Potter. Kamen modrosti", "J. K. Rowling", "Mladinska knjiga");
		tabelaKnjig[2] = new Knjiga("86-365-0570-4", "Stoparski vodnik po Galaksiji", "Douglas Adams", "Dnevnikova knjiznica");
		tabelaKnjig[3] = new Knjiga("978-961-93554-1-1", "Zate, Monika", "Iza Kranjc", "Osnovna sola Danila Lokarja");
		tabelaKnjig[4] = new Knjiga("978-961-00-2742-3", "Dekle z vsemi darovi", "M. R. Carey", "Ucila International");
		
		try {
			for (int i = 0; i < tabelaKnjig.length; i++) {
				System.out.println(tabelaKnjig[i].vrniKnjigaInfo());
			}
		} catch (NullPointerException e) {
			//Ker je tabela velikosti 30 in smo napolnili le prvih 5 mest, nam po 5 izpisih Java vrne NullPointerException
		}
		
		
	}
	
}