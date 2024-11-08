
public class RekürsifFotokopi {
	public static int tam25(int n)  {
		int a = 0;
		while(n-25>=0) {
			a +=1;
			n -=25;
		}
		return a; 
	}
	public static int tam12(int n)  {
		int b = 0;
		while(n-12>=0) {
			b +=1;
			n -=12;
		}
		return b; 
	}
	public static int tam1(int n)  {
		int c = 0;
		while(n-1>=0) {
			c +=1;
			n -=1;
		}
		return c; 
	}
	public static void hesaplayıcı(int sayfa) {
		int birTL = tam25(sayfa);
		int ellikuruş= tam12(sayfa % 25);
		int beşkuruş = tam1(sayfa % 12);
		System.out.println("tutar = "+(( birTL * 1)+( ellikuruş * 0.5 )+(beşkuruş*0.05)));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hesaplayıcı(45);
	}

}
