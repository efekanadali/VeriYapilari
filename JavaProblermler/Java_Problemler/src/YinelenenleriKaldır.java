import java.util.ArrayList;

public class YinelenenleriKaldır {
    public static void main(String[] args) {
        int[] liste = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3};
        ArrayList<Integer> sonuc = new ArrayList<>();
        int silineneleman = 0;

        for (int i = 0; i < liste.length; i++) {
            // Son eleman kontrolü ve ekleme
            if (i == 0 || liste[i] != liste[i - 1]) {
                sonuc.add(liste[i]);
            } else {
                silineneleman++; // Yinelenen eleman sayısını artır
            }
        }

        System.out.println("Aynı olan eleman sayısı: " + silineneleman);
        System.out.println("Düzenlenmiş liste: " + sonuc);
    }	
}
