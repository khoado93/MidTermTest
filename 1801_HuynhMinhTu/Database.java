import java.util.ArrayList;

public class Database{	
	private ArrayList <BenhNhan> bn = new ArrayList <BenhNhan>();
	private ArrayList <BacSy> bs = new ArrayList <BacSy>();
	public void addBn(BenhNhan bn){
		this.bn.add(bn);
	}
	public ArrayList<BenhNhan> showAllBn(){
		ArrayList<BenhNhan> bn = new ArrayList<BenhNhan>();
		if(this.bn.size()==0) {
			return null;
		}
		for(int i = 0; i< this.bn.size() ; i++){
			bn.add(this.bn.get(i));
		}
		return bn;
	}
	public BenhNhan showbn(int benhNhanId){
		for(int i = 0; i< bn.size(); i++){
			if(bn.get(i).getBenhNhanId() == benhNhanId){
				return bn.get(i);
			}
		}
		return null;
	}
	public void addBs(BacSy bs){
		this.bs.add(bs);
	}
	public ArrayList<BacSy> showAllBs(){
		ArrayList<BacSy> bs = new ArrayList<BacSy>();
		if(this.bs.size()==0) {
			return null;
		}
		for(int i = 0; i< this.bs.size() ; i++){
			bs.add(this.bs.get(i));
		}
		return bs;
	}
	public BacSy showbs(int bacSyId){
		for(int i = 0; i< bn.size(); i++){
			if(this.bs.get(i).getBacSyId() == bacSyId){
				return bs.get(i);
			}
		}
		return null;
	}
}
