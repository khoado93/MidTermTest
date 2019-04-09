package giuaky.model;

public class BacSi extends PerSon {
	private String khoa;
	private String dateIn;
	private double luong;
	private double phuCap;
	public BacSi() {
		
	}
	
	public BacSi(String ten, int tuoi, String gioiTinh, String cmnd, String ma,String khoa, String dateIn, double luong, double phuCap) {
		super(ten, tuoi, gioiTinh, cmnd,ma);
		this.khoa = khoa;
		this.dateIn = dateIn;
		this.luong = luong;
		this.phuCap = phuCap;
	}

	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	public String getDateIn() {
		return dateIn;
	}
	public void setDateIn(String dateIn) {
		this.dateIn = dateIn;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	public double getPhuCap() {
		return phuCap;
	}
	public void setPhuCap(double phuCap) {
		this.phuCap = phuCap;
	}
	
}
