package quanLiBenhVien.model;

public class NhanVien {
	private String ten;
	private int tuoi;
	private int gioiTinh; // 0 = nam, 1 = nu, 2 = khong xac dinh
	private long cmnd;
	private int ma;
	private String khoa;
	private String ngayBatDauLam;
	private double luong;
	private double phuCap;
	
	public NhanVien(String ten, int tuoi, int gioiTinh, long cmnd, int ma, String khoa, String ngayBatDauLam,
			double luong, double phuCap) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.cmnd = cmnd;
		this.ma = ma;
		this.khoa = khoa;
		this.ngayBatDauLam = ngayBatDauLam;
		this.luong = luong;
		this.phuCap = phuCap;
	}
	public NhanVien() {
		super();
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public int getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public long getCmnd() {
		return cmnd;
	}
	public void setCmnd(long cmnd) {
		this.cmnd = cmnd;
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	public String getNgayBatDauLam() {
		return ngayBatDauLam;
	}
	public void setNgayBatDauLam(String ngayBatDauLam) {
		this.ngayBatDauLam = ngayBatDauLam;
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
	@Override
	public String toString() {
		return "NhanVien [ten=" + ten + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", cmnd=" + cmnd + ", ma=" + ma
				+ ", khoa=" + khoa + ", ngayBatDauLam=" + ngayBatDauLam + ", luong=" + luong + ", phuCap=" + phuCap
				+ "]";
	}
	
}
