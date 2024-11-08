package YeniPkg;

public class IkinciSinif {
	private String isim;
	private String soyisim;
	private int okulno;
	
	public IkinciSinif(String isim,String soyisim,int okulno) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.okulno = okulno;
	}
	
    public String getIsim() {
        return isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public int getOkulno() {
        return okulno;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public void setOkulno(int okulno) {
        this.okulno = okulno;
    }
}
