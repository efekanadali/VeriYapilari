import java.util.ArrayList;

public class Diziişlemi {
	public static void main(String[] args) {
		int[] liste = {3,3,87,56,1,87,3,2};
		
		ArrayList<Integer> sonuc = new ArrayList<>(); // boş bir sonuç listesi
		for (int i = 0;i < liste.length;i++){
			if (sonuc.contains(liste[i])) { //sonuç listesinde var mı diye kontrol et
				continue;
				}
			else { // yoksa ekle
				sonuc.add(liste[i]);
			}
		}
		System.out.println("tekrarlanan elemanlar silinmiş hali "+sonuc);
	}
}
