import java.util.ArrayList;
import java.util.Scanner;

public class SayınınAsalBölenleri {
	public static boolean Asalmi(int a) { // asal mı diye kontrol eden fonksiyon
		if (a <= 1) {
			return false;
		}
		for (int i = 2;i < ( (a*0.5) + 1);i++) {
			if (a % i == 0) {
				return false;
			}
			}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("asal bölenlerini bulmak istediğiniz sayıyı yazınız: ");
		int sayi = scanner.nextInt(); //kullanıcıdan sayıyı al
		
		ArrayList<Integer> asalbölenler = new ArrayList<>();
		
		for(int i = 2;i <= ((sayi*0.5)+1);i++) {
			if(sayi % i == 0 && Asalmi(i)) {   // sayının bölenlerini bul 
				asalbölenler.add(i);
			}
		}
		if (asalbölenler.isEmpty()) {
			System.out.println("girilen sayı asaldır");
		}
		else {
		System.out.println("Sayının asal bölenleri = "+asalbölenler);
		}
	}

}
