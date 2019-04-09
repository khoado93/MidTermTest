public class BacSy extends Nguoi{
	private int bacSyId;
	private String khoa;
	private String ngayLam;
	private double luong;
	private double phuCap;
	public BacSy(){}
	public BacSy(String ten, int tuoi, String gioiTinh, String cmnd, int bacSyId, String khoa,
	 String ngayLam, double luong, double phuCap){
		super( ten,  tuoi,  gioiTinh,  cmnd);
		this.bacSyId = bacSyId;
		this.khoa = khoa;
		this.ngayLam = ngayLam;
		this.luong = luong;
		this.phuCap = phuCap;
	}
	public void setBacSyId(int bacSyId){
		this.bacSyId = bacSyId;
	}
	public int getBacSyId(){
		return bacSyId;
	}
	public void setKhoa(String khoa){
		this.khoa = khoa;
	}
	public String getKhoa(){
		return khoa;
	}
	public void setNgayLam(String ngayLam){
		this.ngayLam = ngayLam;
	}
	public String getNgayLam(){
		return ngayLam;
	}
	public void setLuong(double luong){
		this.luong = luong;
	}
	public double getLuong(){
		return luong;
	}
	public void setPhuCap(double phuCap){
		this.phuCap = phuCap;
	}
	public double getPhuCap(){
		return phuCap;
	}
}
