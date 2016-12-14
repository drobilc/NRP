public class Naloga03 {

	enum Dan {PONEDELJEK, TOREK, SREDA, CETRTEK, PETEK, SOBOTA, NEDELJA};
	private Dan dan;

	public Naloga03 (Dan d) {
		this.dan = d;
	}

	public void vzdusje() {
		switch (this.dan) {
			case PONEDELJEK:
				System.out.println("Ponedeljki mi niso vsec.");
				return;
			case PETEK:
				System.out.println("Petki so vredu.");
				return;
			case SOBOTA:
			case NEDELJA:
				System.out.println("Vikendi so najboljsi.");
				return;
			default:
				System.out.println("Med tednom je tako-tako.");
				return;
		}
	}

	public static void main(String[] args) {

		//Izpišemo vse dneve v enumu Dan
		for (Dan d : Dan.values())
			System.out.println(d);

		//Izpišemo vsa vzdušja dnevov v tednu
		for (Dan d : Dan.values())
			(new Naloga03(d)).vzdusje();
	}

}
