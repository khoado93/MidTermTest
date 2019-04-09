public class BenhNhan extend ConNguoi{
		private int maBN;
		private  String PPhap;
		private String ngayNhap;
		private String ngayRa;
		private int TienTT;

		public BenhNhan (int maBN, String PPhap, String ngayNhap, String ngayRa, int TienTT){
		super();
		this.maBN = maBN;
		this.PPhap = PPhap;
		this.ngayNhap = ngayNhap;
		this.ngayRa = ngayRa;
		this.TienTT = TienTT;
		
		}

		
		public int getmaBN(){
		return maBN;
		}
		public void  setmaBN(int maBn, int maBN){
		this.maBN = maBN;
		}
		public String getPPhap(){
		return PPhap;
		}
		public void setPPhap(String PPhap){
		this.PPhap = PPhap;
		}
		public String getngayNhap(){
		return ngayNhap;
		}
		public void setngayNhap(String ngayNhap){
		this.ngayNhap = ngayNhap;
		}
		public String getngayRa(){
		return ngayRa;
		}
		public void setngayRa(String ngayRa){
		this.ngayRa = ngayRa;
		}
		public int getTienTT(){
		return TienTT;
		}
		public void setTienTT(int TienTT){
		this.TienTT = TienTT;
		}
}
