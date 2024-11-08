package pkg;

public class ArrayProcess {
	//Bu metot kendine parametre olarak verilen dizinin tüm elemanlarını ekrana yazdırmalıdır
    static void diziYaz(int[] dizi) { 
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
    }
//Bu metotta array dizi boyutunun bir fazlası boyutta yeni bir dizi
// oluşturmalıdır. Bu yeni diziye array dizisi kopyalanmalı ve sonda kalan bir fazlalık elaman içine de yeni eleman
// yerleştirilmelidir. Bu yeni oluşan dizi metottan return edilmelidir.
    static int[] elemanEkle(int[] dizi, int yeni) { 
        int[] NewArray = new int[dizi.length + 1]; 
        for (int j = 0; j < dizi.length; j++) {
            NewArray[j] = dizi[j];
        }
        NewArray[NewArray.length - 1] = yeni;
        return NewArray;
    }
//Bu metotta silinecek eleman dizinin ilk elemanı olacaktır. Metotta array dizi
// boyutunun bir eksiği boyutta yeni bir dizi oluşturmalıdır. Bu yeni diziye array dizisinin ilk elemanı hariç diğer
// elemanları kopyalanmalıdır. Bu yeni oluşan dizi metottan return edilmelidir.
    static int[] elemanSil(int[] dizi) {
        if (dizi.length <= 1) {
            return new int[0];  // Dizi 1 elemanlıysa, boş bir dizi döndür
        }
        int[] NewArray = new int[dizi.length - 1];
        for (int k = 1; k < dizi.length; k++) {
            NewArray[k - 1] = dizi[k];
        }
        return NewArray;
    }
//Bu metot “dizi” içerisinde “aranan” elemanın kaç kere tekrarlandığını
//sayacak ve bu değeri döndürecektir.
    static int diziElemanSay(int[] dizi, int aranan) {
        int tekrar = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == aranan) {
                tekrar++;
            }
        }
        return tekrar;
    }
//Bu metot içerisinde aranan elemanların indeks bilgilerini
//tutmak üzere yeni bir dizi oluşturulacaktır. “dizi” içerisinde “aranan” elemanları dizi içinde arayacak ve bulduğu
//elemanların indekslerini bu yeni dizinin içine sıra ile kaydedecektir. Dizi içindeki arama bittiğinde ise index dizisini
//return edecektir.
    static int[] diziArananElemanIndeks(int[] dizi, int aranan) {
        int sayac = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == aranan) {
                sayac++;
            }
        }

        int[] Indekstut = new int[sayac]; // bulunan eleman sayısı kadar liste boyutu oluştur
        int index = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == aranan) {
                Indekstut[index++] = i;
            }
        }
        return Indekstut;
    }
        //Rekürsif fonksiyonlar
        
        static void recDiziGezinme(int[] dizi, int index) {
        	if(index >= dizi.length) {
        		return;
        	}
        	
        	System.out.println(dizi[index]);
        	
        	recDiziGezinme(dizi,index+1);
        }
        
        
        static int recDiziAra(int[] dizi, int aranan, int index) {
        	
        	if (dizi[index] == aranan) {
        		return index;
        	}
        	return recDiziAra(dizi,aranan,index+1);
        }
        
        
    

    public static void main(String[] args) {
        int[] dizi = {9, 3, 5, 6, 3, 1, 4, 1, 10};
        
        dizi = elemanEkle(dizi,5);
        System.out.println();
        diziYaz(dizi);
        System.out.println();
        dizi = elemanSil(dizi);
        diziYaz(dizi);
        System.out.println();
        System.out.println(diziElemanSay(dizi, 1));
        diziYaz(diziArananElemanIndeks(dizi, 1));
    }
}
