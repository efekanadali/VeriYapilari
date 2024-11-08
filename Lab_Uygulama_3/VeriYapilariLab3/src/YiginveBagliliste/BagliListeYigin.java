package YiginveBagliliste;

public class BagliListeYigin {

	Eleman son;
    int elemanSayisi;

    BagliListeYigin() { // BagliListeYigin den bir yiğin liste oluşturulduğunda yapıcı metot tarafından listenin boyutu kullanıcıdan alınır ve atanır
       son = null;
       elemanSayisi = 0;
    }

    public void yiginaEkleme(Eleman yeni) { // yığına eleman eklemeden önce dolu olıup olmadığını kontrol eder  
            yeni.sonraki = son;  // Yeni elemanın "sonraki" referansını mevcut "top" elemanına bağlar
            son = yeni;          // "top" elemanını "yeni" olarak güncellenir
            elemanSayisi++;      // Eleman sayısını arttırlır
    }


    public void yigindanCekme() {    // yıgından eleman çekmeden önce boş olup olmadığını kontorl eder
        if (bosMu()) {
            System.out.println("YIĞIN BOŞ"); // yığın boş ise kullanıcıya mesaj verilir
            return;
        }
        Eleman tmp = son;           // eğer dolu ise Eleman türünden bir temp referansı oluştuurlur ve bu referans top değişkenini işaret eder
        son = son.sonraki;			// top referansı kendinde sonraki düğümü gösterir 
        System.out.println("**** "+tmp.isim + " " + tmp.soyisim + " " + tmp.telno + " " + tmp.dt+" ****"); // yığından çekilen elemamlar * işareti ile ayrıştırılmıştır 
        tmp.sonraki = null; // kullanıcıya yazdırıldıktan sonra temp referansı sonraki işlemler için null ı gösterir																	//temp yardımıyla yıgından çekilen eleman kullanıcıya yazdırılır
        elemanSayisi--;
    }

    
    boolean bosMu() {
    	return elemanSayisi == 0;
    }
    
    public void yazdirYigin() {
    	System.out.println("-----------------");
        Eleman tmp = son;
        while (tmp != null) {
            System.out.println(tmp.isim + " " + tmp.soyisim + " " + tmp.telno + " " + tmp.dt);
            tmp = tmp.sonraki;
        }
        
        System.out.println("-----------------");
    }

    public int yiginElemanSayisi() {
    	System.out.println(elemanSayisi);
        return elemanSayisi;
        
    }
    
    public void sonGoster() {
    	if(bosMu()) {
    		System.out.println("YİĞİN BOŞ");
    		return;
    	}
        System.out.println("top daki eleman : "+son.isim + " " + son.soyisim + " " + son.telno + " " + son.dt);

    	
    }

}