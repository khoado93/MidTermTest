package giuaky.model;


public class BenhNhan extends PerSon {
	private String benh;
	private String phuongPhap;
	private String dateIn;
	private String dateOut;
	private double cost;
	public BenhNhan() {
		//
	}
	public BenhNhan(String ten, int tuoi, String gioiTinh, String cmnd, String ma, String benh, String phuongPhap, String dateIn, String dateOut, double cost) {
		super(ten, tuoi, gioiTinh, cmnd,ma);
		this.benh = benh;
		this.phuongPhap = phuongPhap;
		this.dateIn = dateIn;
		this.dateOut = dateOut;
		this.cost = cost;
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
	public String getDateIn() {
		return dateIn;
	}
	public void setDateIn(String dateIn) {
		this.dateIn = dateIn;
	}
	public String getDateOut() {
		return dateOut;
	}
	public void setDateOut(String dateOut) {
		this.dateOut = dateOut;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
}
