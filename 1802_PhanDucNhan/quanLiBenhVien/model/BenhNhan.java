package quanLiBenhVien.model;

public class BenhNhan {	
	private String ten;
	private int tuoi;
	private int gioiTinh; // 0 = nam, 1 = nu, 2 = khong xac dinh
	private long cmnd;
	private int ma;
	private String benh;
	private String phuongPhap;
	private String ngayNhapVien;
	private String ngayXuatVien;
	private double tienThanhToan;
	
	public BenhNhan(String ten, int tuoi, int gioiTinh, long cmnd, int ma, String benh, String phuongPhap,
			String ngayNhapVien, String ngayXuatVien, double tienThanhToan) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.cmnd = cmnd;
		this.ma = ma;
		this.benh = benh;
		this.phuongPhap = phuongPhap;
		this.ngayNhapVien = ngayNhapVien;
		this.ngayXuatVien = ngayXuatVien;
		this.tienThanhToan = tienThanhToan;
	}
	
	public BenhNhan() {
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

	public String getBenh() {
		return benh;
	}

	public void setBenh(String benh) {
		this.benh = benh;
	}

	public String getPhuongPhap() {
		return phuongPhap;
	}

	public void setPhuongPhap(String phuongPhap) {
		this.phuongPhap = phuongPhap;
	}

	public String getNgayNhapVien() {
		return ngayNhapVien;
	}

	public void setNgayNhapVien(String ngayNhapVien) {
		this.ngayNhapVien = ngayNhapVien;
	}

	public String getNgayXuatVien() {
		return ngayXuatVien;
	}

	public void setNgayXuatVien(String ngayXuatVien) {
		this.ngayXuatVien = ngayXuatVien;
	}

	public double getTienThanhToan() {
		return tienThanhToan;
	}

	public void setTienThanhToan(double tienThanhToan) {
		this.tienThanhToan = tienThanhToan;
	}

	@Override
	public String toString() {
		return "BenhNhan [ten=" + ten + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", cmnd=" + cmnd + ", ma=" + ma
				+ ", benh=" + benh + ", phuongPhap=" + phuongPhap + ", ngayNhapVien=" + ngayNhapVien + ", ngayXuatVien="
				+ ngayXuatVien + ", tienThanhToan=" + tienThanhToan + "]";
	}	
	
}
