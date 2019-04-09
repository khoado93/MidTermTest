//import java.util.Date;

public class BenhNhan extends Nguoi{
	private int benhNhanId;
	private String benh;
	private String cachChua;
	private String ngayNhap;
	private String ngayRa;
	private double thanhToan;
	public BenhNhan(){}
	public  BenhNhan(String ten, int tuoi, String gioiTinh, String cmnd, int benhNhanId, String benh,
	 String cachChua, String ngayNhap, String ngayRa, double thanhToan){
		super( ten, tuoi,gioiTinh, cmnd);
		this.benhNhanId = benhNhanId;
		this.benh = benh;
		this.cachChua = cachChua;
		this.ngayNhap = ngayNhap;
		this.ngayRa = ngayRa;
		this.thanhToan = thanhToan;
	}
	public void setBenhNhanId(int benhNhanId){
		this.benhNhanId = benhNhanId;
	}
	public int getBenhNhanId(){
		return benhNhanId;
	}
	public void setBenh(String benh){
		this.benh = benh;
	}
	public String getBenh(){
		return benh;
	}
	public void setCachChua(String cachChua){
		this.cachChua = cachChua;
	}
	public String getCachChua(){
		return cachChua;
	}
	public void setNgayNhap(String ngayNhap){
		this.ngayNhap = ngayNhap;
	}
	public String getNgayNhap(){
		return ngayNhap;
	}
	public void setNgayRa(String ngayRa){
		this.ngayRa = ngayRa;
	}
	public String ngayRa(){
		return ngayRa;
	}
	public void setThanhToan(double thanhToan){
		this.thanhToan = thanhToan;
	}
	public double getThanhToan(){
		return thanhToan;
	}
}
