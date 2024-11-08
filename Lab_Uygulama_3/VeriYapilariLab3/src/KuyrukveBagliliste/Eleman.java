package KuyrukveBagliliste;

public class Eleman {
	String isim;
	String soyisim;
	int telno;
	int dt;
	Eleman Sonraki;
	
	
	Eleman(String isim, String soyisim, int telno, int dt){
		this.isim=isim;
		this.soyisim=soyisim;
		this.telno=telno;
		this.dt=dt;
	}
}
