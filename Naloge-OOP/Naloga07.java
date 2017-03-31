public class Naloga07 {
	
	public static void main(String[] args) {
		
		Sedan avto1 = new Sedan(190, 60200, "modra", 7);
		Ford avto2 = new Ford(160, 100000, "srebrna", 1994, 6000);
		Avto avto3 = new Avto(200, 40000, "bela");
		Kamion avto4 = new Kamion(100, 200500, "crna", 2004);
		
		System.out.println(avto1.vrniProdajnoCeno());
		System.out.println(avto2.vrniProdajnoCeno());
		System.out.println(avto3.vrniProdajnoCeno());
		System.out.println(avto4.vrniProdajnoCeno());
		
	}
	
}