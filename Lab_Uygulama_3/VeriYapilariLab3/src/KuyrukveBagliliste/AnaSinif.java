package KuyrukveBagliliste;


public class AnaSinif {
	
	public static void main(String[] args) {
		
		Eleman kisi1 = new Eleman ("E","A",535353,1111);	
		Eleman kisi2 = new Eleman ("M","Ö",464646,2222);
		Eleman kisi3 = new Eleman ("U","S",121212,3333);
		Eleman kisi4 = new Eleman ("K","Y",787878,8888);
		Eleman kisi5 = new Eleman ("P","Ç",363636,9999);
		
		BaglilisteKuyruk kuyruk = new BaglilisteKuyruk();
		
		kuyruk.kuyrugaEkle(kisi1);
		kuyruk.kuyrugaEkle(kisi2);
		kuyruk.kuyrukYazdirma();
		kuyruk.kuyruktanÇekme();
		kuyruk.kuyrukYazdirma();
		
		
		
		
	}
}
