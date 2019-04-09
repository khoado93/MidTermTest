public class BacSy extend ConNguoi {
	private int maBS;
	private  String khoa;
	private String ngayVL;
	private double luong;
	private double phucap;

	public BacSy (int maBS, String khoa, String ngayVL,double luong, double phucap){
	this.maBS = maBS;
	this.khoa = khoa;
	this.ngayVL = ngayVL;
	this.luong = luong;
	this.phucap = phucap; 
	}
	
	public int getmaBS(){
	return maBS;
	}
	public void setmaBS(int maBn, int maBS){
	this.maBS = maBS;
	}
	public String getkhoa(){
	return khoa;
	}
	public void setkhoa(String khoa){
	this.khoa = khoa;
	}
	public String getngayVL(){
	return ngayVL;
	}
	public void setngayVL(String ngayVL){
	this.ngayVL = ngayVL;
	}
	public double getluong(){
	return luong;
	}
	public void setluong(double luong){
	this.luong = luong;
	}
	public double getphucap(){
	return phucap;
	}
	public void setphucap(double phucap){
	this.phucap = phucap;
	}

}