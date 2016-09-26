public class Naloga01 {
	
	public static String reverse(String str, int index) {
		return index >= str.length() ? "" : reverse(str, index + 1) + str.charAt(index);		
	}
	
	public static void main(String[] args) {
		
		String niz = "Danes je lep dan.";
		System.out.println(reverse(niz, 0));
		
	}
	
}
