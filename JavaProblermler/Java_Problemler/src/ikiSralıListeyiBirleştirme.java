import java.util.ArrayList;


public class ikiSralıListeyiBirleştirme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] liste1 = {1,2,4};
		int[] liste2 = {1,3,4};
		ArrayList<Integer> sonuc = new ArrayList<>();
		for (int i = 0; i < liste1.length; i++) {		
				sonuc.add(liste1[i]);
				sonuc.add(liste2[i]);
				}
		sonuc.sort(null);
		
		System.out.println("listelerin birleştirilmiş ve sıralanmış hali "+sonuc);
		}
}
	


