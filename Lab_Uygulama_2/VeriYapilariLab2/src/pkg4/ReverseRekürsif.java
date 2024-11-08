package pkg4;

public class ReverseRekürsif {
	static void reverse(char[] x,int i) {
		
		if(i < 0) {
			return;
		}
		System.out.println(x[i]);
		reverse(x,i-1);
		
		
	}
	public static void main(String []args) {
		char[] kelime = {'h','e','l','l','o'};
		reverse(kelime,kelime.length-1);
	}
}
