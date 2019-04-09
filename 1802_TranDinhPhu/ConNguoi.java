
public class ConNguoi {
	private String ten;
	private String tuoi;
	private String GT;
	private String cmnd;

	public ConNguoi (String ten, String tuoi, String GT, String cmnd){
	this.ten = ten;
	this.tuoi = tuoi;
    this.GT = GT;
	this.cmnd = cmnd;
   }            

	public String getten(){
	return ten;
            }
	public void setten(String ten){
	this.ten = ten;
            }
	public String gettuoi(){
	return tuoi;
            }
	public void  settuoi(String tuoi){
	this.ten = tuoi;
            }
	public String getGT(){
	return GT;
            }
	public void  setGTn(String GT){
	this.GT= GT;
           }
	public String getcmnd(){
	return cmnd;
           }
	public void setcmnd(String cmnd){
	this.cmnd = cmnd;
          }



public void Xuat (){
	System.out.println("nhap ten: " + getten());
	System.out.println("nhap tuoi: " + gettuoi());
	System.out.println("nhap gioi tinh: " + getGT());
	System.out.println("nhap cmnd: " + getcmnd());
 }
}