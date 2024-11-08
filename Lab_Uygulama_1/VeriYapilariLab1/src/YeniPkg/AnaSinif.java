package YeniPkg;

import java.util.Scanner;

public class AnaSinif {
    String ad;
    String soyad;
    int yas;

    public AnaSinif() {
        this.ad = "Efekan";
        this.soyad = "Adalı";
        this.yas = 19;
    }

    public AnaSinif(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = 18;
    }

    public static int toplama() {
        int a = 5;
        int b = 10;
        return a + b;
    }

    public IkinciSinif ikinciSinifaDegerAta(String isim, String soyisim, int okulno) {
        IkinciSinif iks = new IkinciSinif(isim, soyisim, okulno);
        return iks; // Değer atamadan sonra direkt döndür
    }

    public static void ikinciSinifDegerYazdir(IkinciSinif iks) {
        System.out.println("İsim: " + iks.getIsim());
        System.out.println("Soyisim: " + iks.getSoyisim());
        System.out.println("Okul No: " + iks.getOkulno());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IkinciSinif[] dizi = new IkinciSinif[10];

        // 10 öğrenci için bilgi alma ve dizi elemanlarını yapılandırma
        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i + 1) + ". Öğrencinin bilgilerini girin:");

            System.out.print("İsim: ");
            String isim = scanner.nextLine();

            System.out.print("Soyisim: ");
            String soyisim = scanner.nextLine();

            System.out.print("Okul No: ");
            int okulNo = scanner.nextInt();
            scanner.nextLine(); // Yeni satır karakterini temizle

            // Yeni bir IkinciSinif nesnesi oluşturuluyor ve diziye atanıyor
            dizi[i] = new IkinciSinif(isim, soyisim, okulNo);
        }

        // Dizi elemanlarının değerlerini yazdırma
        System.out.println("Öğrenci Bilgileri:");
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("Dizi Elemanı " + (i + 1) + ":");
            ikinciSinifDegerYazdir(dizi[i]);
            System.out.println("-------------------");
        }

        scanner.close(); // Scanner'ı kapat
    }
}




