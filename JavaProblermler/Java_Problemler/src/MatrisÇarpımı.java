import java.util.Scanner;

public class MatrisÇarpımı {

	public static void main(String[] args) {
		// matris boyutlarını sor
		Scanner sc = new Scanner(System.in);
		System.out.println("ilk matrsin, n değerini giriniz: ");
		int n = sc.nextInt();
		
		System.out.println("k değerini giriniz: ");
		int k = sc.nextInt();
		
		System.out.println("ikinci matrsin, n değerini giriniz: ");
		int l = sc.nextInt();
		
		System.out.println("k değerini giriniz: ");
		int m = sc.nextInt();
		// alınan boyutta matris oluştur
		int[][] m1 = new int[n][k];
		int[][] m2 = new int[l][m];
		
		// çarpma işlemi yapılabilir mi diye kontrol et
		if (k != l) {
			System.out.println("bu iki matris arasında çarpma işlemi yapılamaz");
		}
		//matris içindeki elemanları sor ve yerleştir
		else{
			int[][] sonucm = new int[n][m];
			for(int i = 0;i<n;i++) {
				for(int j = 0; j<k ; j++) {
					System.out.println("ilk matrisin "+i+","+j+" deki elemanını yazınız");
					m1[i][j] = sc.nextInt();
				}
			}
			for(int a = 0; a<n ;a++) {
				for(int b = 0; b<k ; b++) {
					System.out.println("ikinci matrisin "+a+","+b+" deki elemanını yazınız");
					m2[a][b] = sc.nextInt();
					}
			}
		//matris çarpma işlemi
			 for (int i = 0; i < n; i++) {
		            for (int j = 0; j < m; j++) {
		                for (int p = 0; p < k; p++) {  
		                    sonucm[i][j] += m1[i][p] * m2[p][j];
		                }
		            }
		        }
			  System.out.println("Matris çarpımının sonucu:");
		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < m; j++) {
		                System.out.print(sonucm[i][j] + " ");
		            }
		            System.out.println();//alt satır
		}

}
}
}
