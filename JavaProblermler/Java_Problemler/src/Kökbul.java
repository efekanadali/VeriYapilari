import java.util.Scanner;

public class Kökbul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Kullanıcıdan a, b, c değerlerini alalım
        System.out.println("a'yı girin: ");
        int a = scanner.nextInt();
        System.out.println("b'yi girin: ");
        int b = scanner.nextInt();
        System.out.println("c'yi girin: ");
        int c = scanner.nextInt();
        
        // Delta hesaplama
        double delta = Math.pow(b, 2) - (4 * a * c);
        
        // Delta kontrolü
        if (delta < 0) {
            System.out.println("Delta 0'dan küçük, reel kök yoktur.");
        } else if (delta > 0) {
            // 2 reel kök vardır
            double kök1 = (-b + Math.sqrt(delta)) / (2 * a);
            double kök2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Delta 0'dan büyük, 2 kök var: Kök1 = " + kök1 + ", Kök2 = " + kök2);
        } else {
            // Delta 0 ise çakışık tek kök vardır
            double kök = (-b) / (2 * a);
            System.out.println("Delta 0, tek kök var: Kök = " + kök);
        }
        
       
    }


}
