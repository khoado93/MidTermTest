
public class Nguoi{
	private String ten;
	private int tuoi;
	private String gioiTinh;
	private String cmnd;
	public Nguoi(){}
	public Nguoi(String ten, int tuoi, String gioiTinh, String cmnd){
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.cmnd = cmnd;
	}

	public void setTen(String ten){
		this.ten = ten;
	}
	public String getTen(){
		return ten;
	}
	public void setTuoi(int tuoi){
		this.tuoi = tuoi;
	}
	public int getTuoi(){
		return tuoi;
	}
	public void setGioiTinh(String gioiTinh){
		this.gioiTinh = gioiTinh;
	}
	public String getGioiTinh(){
		return gioiTinh;
	}
	public void setCmnd(String cmnd){
		this.cmnd = cmnd;
	}
	public String getCmnd(){
		return cmnd;
	}
}
