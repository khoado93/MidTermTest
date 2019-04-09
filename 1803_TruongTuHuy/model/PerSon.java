package giuaky.model;

public class PerSon {
	protected String ten;
	protected int tuoi;
	protected String gioiTinh;
	protected String cmnd;
	protected String ma;
	
	
	public PerSon() {
		//
	}
	
	public PerSon(String ten, int tuoi, String gioiTinh, String cmnd, String ma) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.cmnd = cmnd;
		this.ma = ma;
	}


	public  String getTen() {
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
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	
	
}
