public class Datum {
	
	private int dan, mesec, leto;
	
	public Datum(int dan, int mesec, int leto) {
		this.dan = dan;
		this.mesec = mesec;
		this.leto = leto;
	}
	
	public String zdruzi(String locilo) {
		return this.dan + locilo + this.mesec + locilo + this.leto;
	}
	
	public String toString() {
		//Nad objektom samim klicemo metodo zdruzi
		return this.zdruzi("/");
	}
	
}