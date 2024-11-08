import java.util.Scanner;

public class fotokopisorusu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("fotokopi sayısını giriniz: ");
		int N = scanner.nextInt();
		int tam25 = 0;
		int tam12 = 0;
		int tam1 = 0;
		
		if (N >= 25) {
	
			 while ( N >= 25) {
				 tam25+=1;
				 N -=25;
			 }
		}
		if (N >=12) {
		
			while ( N >= 12);{
				tam12 +=1;
				N -=12;
			}
		}
		if ( N > 0 ) {

			while (N > 0) {
				tam1 +=1;
				N -=1; 
			}
		}
		double tutar = (tam25 * 1) + (tam12 * 0.5) + (tam1 * 0.05);
		System.out.println(tutar+" TL değerinde");
	}
}