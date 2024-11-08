import java.util.Scanner;

public class yildizkoy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("kelime giriniz: ");
		String kelime = scanner.next();
		String sonkelime = "" ;          // son kelimemiz
		for (int i=0; i < kelime.length();i++ ) {   // ilk kelimeden harf sonra bir *
			sonkelime += kelime.charAt(i);
			if (i != kelime.length()-1){ //son harften sonra * atmama şartı
				sonkelime+= "*";
			}
			}
		System.out.println(sonkelime);
}
}