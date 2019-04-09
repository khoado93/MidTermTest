public class ConNguoi{
	public String ten;
	public int tuoi;
	public String gioiTinh;
	public double cmnd;
	
	public class ConNguoi(){
	}
	
	public class ConNguoi(String ten, int tuoi, String gioiTinh, double cmnd){
		super();
		this.ten=ten;
		this.tuoi=tuoi;
		this.gioiTinh=gioiTinh;
		this.cmnd=cmnd;
	}

	public String getTen(){
		return ten;
	}
	public void String setTen(){
		return this.ten=ten;
	}
	public int getTuoi(){
		return tuoi;
	}
	public void int setTuoi(){
		return this.tuoi=tuoi;
	}
	public String getGioiTinh(){
		return gioiTinh;
	}
	public void String setGioiTinh(){
		return this.gioiTinh=gioiTinh;
	}
	public double getCmnd(){
		return cmnd;
	}
	public void double setCmnd(){
		return this.cmnd=cmnd;
	}

	public void xuat(){
		System.out.println("h? tên: "	+ten+	"_có tu?i :"	+tuoi+	"_phái :"	+gioiTinh+	"_s? ch?ng minh thu :"	+cmnd);
	}
}