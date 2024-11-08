package pkg3;

public class Obeb {
    static int obebHesapla(int x, int y) {
        if (y == 0) {
            return x;
        }
        return obebHesapla(y, x%y);
    }

    public static void main(String[] args) {
        System.out.println(obebHesapla(250, 8));
    }
}
