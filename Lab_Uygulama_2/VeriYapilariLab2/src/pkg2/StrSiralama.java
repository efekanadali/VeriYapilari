package pkg2;

public class StrSiralama {
	
	static void secmeliSiralama(String[] dizi){
		int n = dizi.length;
		for(int i = 0;i < n;i++) {
			int min_index = i; // ilk elemanın min olduğunu varsay
			for(int j = i + 1;j < n;j++) {
				if(dizi[j].compareTo(dizi[i])<0){
					min_index = j; // asıl min eleman
				}
			}
			if(min_index != i) { // min eleman değişmişse onu başa al baştakini onun yerine
				String temp = dizi[i];
				dizi[i] = dizi[min_index];
				dizi[min_index] = temp;
			}
		}
	}
	public static void main(String[] args) {
		String[] dizi = {"kadir","kadi","ayşe","zeynep","mehmet"};
		secmeliSiralama(dizi);
		for(int i = 0;i < dizi.length; i++ ){
			System.out.println(dizi[i]);
		}
	}
}