public class BenhNhan{
	private String maBenhNhan;
	private String benh;
	private String ppChuaBenh;
	private String ngayNhap;
	private String ngayRa;
	private double tienThanhToan;
	ConNguoi ConNguoi;

	public class BenhNhan(String ten, int tuoi, String gioiTinh, double cmnd, String maBenhNhan, String benh, String ppChuaBenh,  String ngayNhap, String ngayRa, double tienThanhToan){
		super();
		this.maBenhNhan=maBenhNhan;
		this.benh=benh;
		this.ppChuaBenh=ppChuaBenh;
		this.ngayNhap=ngayNhap;
		this.ngayRa=ngayRa;
		this.tienThanhToan=tienThanhToan;
	}
	
	public String getMaBenhNhan(){
		return maBenhNhan;
	}	
	public void String setMaBenhNhan(){
		return this.maBenhNhan=maBenhNhan;
	}
	public String getBenh(){
		return benh;
	}
	public void String setBenh(){
		return this.benh=benh;
	}
	public String getPpChuaBenh(){
		return ppChuaBenh;
	}
	public void String setPpChuaBenh(){
		return this.ppChuaBenh=ppChuaBenh;
	}
	public String getNgayNhap(){
		return ngayNhap;
	}
	public void String setNgayNhap(){
		return this.ngayNhap=ngayNhap;
	}
	public String setNgayRa(){
		return ngayRa;
	}
	public void String setNgayRa(){
		return this.ngayRa=ngayRa;
	}
	public double getTienThanhToan(){
		return tienThanhToan;
	}
	public void double setTienThanhToan(){
		return this.tienThanhToan=tienThanhToan;
	}

	public void xuat(){
		super.xuat();	
		System.out.println("mã b?nh nhân: "+maBenhNhan+"_b? b?nh"+benh+"_phuong pháp ch?a tr?"+ppChuaBenh+"_ngày nh?p vi?n"+ngayNhap+"_ngày ra vi?n"+ngayRa+"_t?ng ti?n thanh toán"+tienThanhToan);
	
}
