import java.util.Scanner;

public class SoruCozum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi >= 0 && sayi <= 9) {
            System.out.println("Sayı polindrom sayıdır");
            return;  // Tek basamaklı sayılar için devam etmemize gerek yok
        }

        if (sayi < 0) {
            System.out.println("Sayı polindrom sayı değildir");
            return; // Nrgatif sayılar polindrom olmaz
        }

        int asilsayi = sayi; // sayı ile işlem yapıcağımız için sayının kendisini hafızada tutmalıyız
        int terssayi = 0;    

        while (sayi != 0) {
            int kalan = sayi % 10;
            terssayi = terssayi * 10 + kalan;  // Tersi sayıyı oluşturuyoruz
            sayi = sayi / 10;  // Sayının kalanını alıyoruz
        }

        if (asilsayi == terssayi) { // en sonda kontrol ediyoruz
            System.out.println(asilsayi+" Sayısı polindrom sayıdır");
        } else {
            System.out.println(asilsayi+" Sayısı polindrom sayı değildir");
        }
    }
}
