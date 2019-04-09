public class BacSy{
	private String maBacSy;
	private String khoa;
	private String ngayVao;
	private double luong;
	private double phuCap;

	public class BacSy(){
	}
	
	public class BacSy(String ten, int tuoi, String gioiTinh, double cmnd, String maBacSy, String khoa, String ngayVao, double luong, double phuCap){
		super();
		this.maBacSy=maBacSy;
		this.khoa=khoa;
		this.ngayVao=ngayVao;
		this.luong=luong;
		this.phuCap=phuCap;
	}
	
	public String getMaBacSy(){
		return maBacSy;
	}	
	public void String setMaBacSy(){
		return this.maBacSy=maBacSy;
	}
	public String getKhoa(){
		return khoa;
	}
	public void String setKhoa(){
		return this.khoa=khoa;
	}
	public String getNgayVao(){
		return ngayVao;
	}
	public void String setNgayVao(){
		return this.ngayVao=ngayVao;
	}
	public double getLuong(){
		return luong;
	}
	public void double setLuong(){
		return this.luong=luong;
	}
	public double getPhuCap(){
		return phuCap;
	}
	public void double setPhuCap(){
		return this.phuCap=phuCap;
	}
	
	public void xuat(){
		super.xuat();
		System.out.println("mã bác s?"+maBacSy+"_khóa"+khoa+"ngày vào làm"+ngayVao+"luong co b?n"+luong+"ph? c?p"+phuCap);
	}
}