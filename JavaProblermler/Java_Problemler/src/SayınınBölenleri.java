import java.util.ArrayList;
import java.util.Scanner;

public class SayınınBölenleri {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("bölenlerini bulmak istediğiniz sayıyı giriniz: ");
		int sayi = scanner.nextInt(); //kullanıcıdan sayıyı al
		
		ArrayList<Integer> bölenler = new ArrayList<>(); //bölenlerin eklenecek olduğu listeyi oluştur
		
		for(int i = 1;i <= ((sayi*0.5)+1);i++) {
			if(sayi % i == 0) {   // sayının bölenlerini bul ve listeye ekle
				bölenler.add(i);
			}
		}
	System.out.println("Sayının bölenleri = "+bölenler);	
		
	}
}
