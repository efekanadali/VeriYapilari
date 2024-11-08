import java.util.Scanner;

public class AsalBul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı giriniz:");
        int sayi = scanner.nextInt();
        
        if (sayi <= 1) {
            System.out.println("Sayı asal değil.");
        } else {
            boolean asalMi = true;
            
            for (int i = 2; i <= Math.sqrt(sayi); i++) {
                if (sayi % i == 0) {
                    asalMi = false;  
                    break; 
                }
            }
            
    
            if (asalMi) {
                System.out.println("Sayı asal.");
                

                System.out.println("2'den " + sayi + " kadar olan asal sayılar:");
                for (int i = 2; i <= sayi; i++) {
                    if (asalMi(i)) {
                        System.out.println(i);
                    }
                }
            } else {
                System.out.println("Sayı asal değil.");
            }
        }
    }

    
    public static boolean asalMi(int num) {
        if (num <= 1) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }
}