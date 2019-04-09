package BenhVien;
import java.util.*;

public class Database{
	static private ArrayList<BenhNhan> dsBenhNhan=new ArrayList<>();
	static private ArrayList<BacSi> dsBacSi=new ArrayList<>();

	public ArrayList<BenhNhan> getDSBN(){
		return this.dsBenhNhan;
	}
	public ArrayList<BacSi> getDSBS(){
		return this.dsBacSi;
	}
	public void addBN(BenhNhan benhNhan){
		dsBenhNhan.add(benhNhan);	
	}
	public void addBS(BacSi bacSi){
		dsBacSi.add(bacSi);
	}
	public void hienThiBN(String maBN){
		for (BenhNhan benhNhan : dsBenhNhan){
			if(benhNhan.getID().equals(maBN)){
				benhNhan.hienThiHoSoBN();
				System.out.println();
				break;
			}    
		}
	}
	
	public double tongTien(){
		int sum=0;
		for (BenhNhan benhNhan : dsBenhNhan){
			sum+=benhNhan.getTienTT();
		}
		return sum;
	}
	public BenhNhan bnTraNhieu(){
		BenhNhan max=dsBenhNhan.get(0);
		int size=dsBenhNhan.size();
		for (int i =0;i<size;i++){
			for (int j=i+1;j<0;j++){
				if (dsBenhNhan.get(i).getTienTT()<dsBenhNhan.get(j).getTienTT()){
					max=dsBenhNhan.get(j);
				}
			}
		}
		return max;
	}
	public void bnBiBenh(String benh){
		ArrayList<BenhNhan> biBenh=new ArrayList<BenhNhan>();
		for (BenhNhan benhNhan : dsBenhNhan){
			if(benhNhan.getBenh().equals(benh)){
				biBenh.add(benhNhan);
			}
		}
		for (BenhNhan benhNhan : biBenh){
			benhNhan.hienThiHoSoBN();
			System.out.println();
		}
	}
	public void hienThiBSKhoa(String khoa){
		for (BacSi bacSi : dsBacSi){
			if(bacSi.getKhoa().equals(khoa)){
				bacSi.hienThiHoSoBS();
				System.out.println();
			}    
		}
	}
	public BacSi hienThiBSID(String ID){
		for (BacSi bacSi : dsBacSi){
			if(bacSi.getID().equals(ID)){
				return bacSi;
			}    
		}
		return null;
	}
	

}