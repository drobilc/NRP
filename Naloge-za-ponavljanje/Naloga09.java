import java.io.*;

public class Naloga09 {

	public static String pretvoriVBinarno1(int stevilo) {
		String binarno = "";
		while (stevilo > 0) {
			binarno = stevilo % 2 + binarno;
			stevilo /= 2;
		}
		
		// "00000000".substring(binarno.length()) vrne (8 - dolzinaBinarnegaNiza) nicel, ki jih nato prilepim pred originalen binarni niz
		return "00000000".substring(binarno.length()) + binarno;
	}
	
	public static String pretvoriVBinarno2(int stevilo) {
		//Ta metoda za pretvorbo uporablja vgrajeno metodo Integer.toBinaryString()
		String binarno = Integer.toBinaryString(stevilo);
		return "00000000".substring(binarno.length()) + binarno;
	}

	public static void main(String[] args) {
		FileInputStream vhod = null;
		try {
			vhod = new FileInputStream(args[0]);
			int znak;
			while (vhod.available() > 0) {
				znak = vhod.read();
				if (znak != ' ')
					System.out.print(pretvoriVBinarno1(znak));
				else
					System.out.print(" ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Uporaba: java Naloga09 <imeDatoteke>");
		} catch (FileNotFoundException e) {
			System.out.println("Datoteka ne obstaja.");
		} catch (IOException e) {
			System.out.println("Napaka pri branju datoteke.");
		} finally {
			try {
				if (vhod != null)
					vhod.close();
			} catch (IOException e) {
				System.out.println("Ne morem zapreti datoteke.");
			}
		}
	}

}