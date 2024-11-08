package YiginveBagliliste;

public class AnaSinif {
	
	
	public static void main(String[] args) {
	
	Eleman kisi1 = new Eleman ("E","A",535353,1111);	
	Eleman kisi2 = new Eleman ("M","Ö",464646,2222);
	Eleman kisi3 = new Eleman ("U","S",121212,3333);
	Eleman kisi4 = new Eleman ("K","Y",787878,8888);
	Eleman kisi5 = new Eleman ("P","Ç",363636,9999);
	
	BagliListeYigin Stack = new BagliListeYigin();
	
	Stack.yiginaEkleme(kisi1);
	Stack.yiginaEkleme(kisi2);
	Stack.yazdirYigin();
	
	Stack.yigindanCekme();
	Stack.yazdirYigin();

	Stack.sonGoster();
	
	}
}
