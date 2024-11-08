package KuyrukveBagliliste;


public class BaglilisteKuyruk {
	Eleman on;
	Eleman arka;
	int elemansayisi;
	
	
	BaglilisteKuyruk(){ // hiç elemanı olmayan kuyruk
		on = null;
		arka = null;
		elemansayisi = 0;
	}
	
	void kuyrugaEkle(Eleman yeni) {
		if(on == null) { // kuytuğun boş olup olmadığını kontrol eden şart
		on = yeni;
		arka = yeni;
		elemansayisi++;
		return;
		}
		arka.Sonraki = yeni; // kuyruk boş değil ise arkaya ekleme yap
		yeni = arka;
		elemansayisi++;
		}
	void kuyruktanÇekme() {
		if(on == null) {
			System.out.println("Kuyruk boş,çekme işlemi yapılamaz");
		}
		System.out.println("Çekilen eleman: " + on.isim + " " + on.soyisim + " " + on.telno + " " + on.dt); // çekilen elemanı yaz
		on = on.Sonraki;
		elemansayisi--;
		if(on == null) {
			System.out.println("Kuyrukta eleman kalmadı");
		}
	}
	void kuyrukYazdirma(){
		Eleman tmp = on;
		while(tmp != null) {
			System.out.println(tmp.isim + " " + tmp.soyisim + " " + tmp.telno + " " + tmp.dt);
			tmp = tmp.Sonraki;
	}
		System.out.println("-------------------");		
	}
	
	void elemanSayisi() {
		System.out.println("Kuyruktaki eleman sayisi" + elemansayisi);
	}
}
