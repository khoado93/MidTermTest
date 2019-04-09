package giuaky.controller;

import java.util.ArrayList;
import java.util.Scanner;

import giuaky.model.BacSi;
import giuaky.model.BenhNhan;

public class QuanLiNhanVien {
	static ArrayList<BenhNhan> listBN = new ArrayList<BenhNhan>();
	static ArrayList<BacSi> listBS= new ArrayList<BacSi>();
	static Scanner sc = new Scanner(System.in);
	public static void showMenu() {
		System.out.println("1/ Thêm mới hồ sơ bệnh nhân\n" + 
				"2/ Hiển thị thông tin tất cả bệnh nhân\n" + 
				"3/ Hiển thị hồ sơ của bệnh nhân với mã bệnh nhân nhập từ bàn phím\n" + 
				"4/ Tính tổng các số tiền của tất cả bệnh nhân\n" + 
				"5/ Tìm bệnh nhân có tiền trả nhiều nhất\n" + 
				"6/ TÌm các bệnh nhân có bệnh tương ứng nhập từ bàn phím\n" + 
				"\n" + 
				"NhanVien\n" + 
				"7/ Thêm mới nhân viên\n" + 
				"8/ Hiển thị tất cả bác sỹ\n" + 
				"9/ Hiển thị bác sỹ với khoa tương ứng nhập từ bàn phím\n" + 
				"10/ Sửa phụ cấp cho bác sĩ với mã nhập từ bàn phím \n" +
				"11/ Xóa bác sỹ với mã tương ứng \n" + 
				"<------------------------------------------------------"
				+ "\nMời bạn chọn chức năng bạn muốn dùng: "
				);
	}
	public static void chooseMenu() {
		String number = sc.nextLine();
		switch(number) {
		case "1": addBN();
				break;
		case "2": showAllBN();
				break;
		case "3" : showBNByMa();
		case "4" : sumCostAllBN();
		case "5" : findMaxCost();
		case "6" : findBNByBenh();
		case "7" : addBS();
		case "8" : showAllBS();
		case "9" : showBSByKhoa();
		case "10" : changePhuCap();
		case "11": deleteBSByMa();
		default: System.out.println("Chức năng bạn nhập không hợp lệ");
		}
	}
	public static void addBN() {
		BenhNhan BenhNhan = new BenhNhan();
		System.out.println("Số bệnh nhân bạn muốn thêm là: ");
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < n ; i++) {
			System.out.println("Nhập tên bệnh nhân: ");
			BenhNhan.setTen(sc.nextLine());
			System.out.println("Nhập tuổi bệnh nhân: ");
			BenhNhan.setTuoi(Integer.parseInt(sc.nextLine()));
			System.out.println("Nhập giới tính bệnh nhân: ");
			BenhNhan.setGioiTinh(sc.nextLine());
			System.out.println("Nhập CMND bệnh nhân:  ");
			BenhNhan.setCmnd(sc.nextLine());
			System.out.println("Nhập mã bệnh nhân");
			BenhNhan.setMa(sc.nextLine());
			System.out.println("Nhập Bệnh của bệnh nhân: ");
			BenhNhan.setBenh(sc.nextLine());
			System.out.println("Nhập Phương Pháp chữa bệnh của bệnh nhân: ");
			BenhNhan.setPhuongPhap(sc.nextLine());
			System.out.println("Nhập ngày vào viện của bệnh nhân: ");
			BenhNhan.setDateIn(sc.nextLine());
			System.out.println("Nhập ngày ra viện của bệnh nhân: ");
			BenhNhan.setDateOut(sc.nextLine());
			System.out.println("Nhập số tiền phải thanh toán:  ");
			BenhNhan.setCost(Double.parseDouble(sc.nextLine()));
			listBN.add(BenhNhan);
			System.out.println("Thêm Thành Công Bệnh Nhân!!");
		}
	}
	public static void showAllBN() {
		for (int i = 0; i < listBN.size(); i++) {
			System.out.println("Bệnh nhân " + (i +1) + ": " + listBN.get(i).getTen());
			System.out.println("Tuổi " + ": " + listBN.get(i).getTuoi());
			System.out.println("Giới Tính " + ": " + listBN.get(i).getGioiTinh());
			System.out.println("Số CMND " + ": " + listBN.get(i).getCmnd());
			System.out.println("Mã Bệnh Nhân " + ": " + listBN.get(i).getMa());
			System.out.println("Bệnh" + ": " + listBN.get(i).getBenh());
			System.out.println("Phương Pháp chữa bệnh " + ": " + listBN.get(i).getPhuongPhap());
			System.out.println("Ngày vào viện " + ": " + listBN.get(i).getDateIn());
			System.out.println("Ngày ra viện " + ": " + listBN.get(i).getDateOut());
			System.out.println("Tiền phải thanh toán " + ": " + listBN.get(i).getCost());
			System.out.println("===============================================================");
	    }
	}
	 public static void  findBNByBenh() {
		 System.out.println("Nhập bệnh muốn tìm : ");
		 String benh = sc.nextLine();
		 for (int i = 0; i < listBN.size(); i++) {
				if(listBN.get(i).getBenh().equals(benh)) {
					System.out.println("Bệnh nhân " + (i +1 ) + ": " + listBN.get(i).getTen());
					System.out.println("Tuổi " + ": " + listBN.get(i).getTuoi());
					System.out.println("Giới Tính " + ": " + listBN.get(i).getGioiTinh());
					System.out.println("Số CMND " + ": " + listBN.get(i).getCmnd());
					System.out.println("Mã Bệnh Nhân " + ": " + listBN.get(i).getMa());
					System.out.println("Bệnh" + ": " + listBN.get(i).getBenh());
					System.out.println("Phương Pháp chữa bệnh " + ": " + listBN.get(i).getPhuongPhap());
					System.out.println("Ngày vào viện " + ": " + listBN.get(i).getDateIn());
					System.out.println("Ngày ra viện " + ": " + listBN.get(i).getDateOut());
					System.out.println("Tiền phải thanh toán " + ": " + listBN.get(i).getCost());
					System.out.println("===============================================================");
				}
		    }
		 
	 }
	 public static void  showBNByMa() {
		 System.out.println("Nhập mã bệnh nhân: ");
		 String maSo = sc.nextLine();
		 for (int i = 0; i < listBN.size(); i++) {
				if(listBN.get(i).getMa().equals(maSo)) {
					System.out.println("Bệnh nhân " + (i +1 ) + ": " + listBN.get(i).getTen());
					System.out.println("Tuổi " + ": " + listBN.get(i).getTuoi());
					System.out.println("Giới Tính " + ": " + listBN.get(i).getGioiTinh());
					System.out.println("Số CMND " + ": " + listBN.get(i).getCmnd());
					System.out.println("Mã Bệnh Nhân " + ": " + listBN.get(i).getMa());
					System.out.println("Bệnh" + ": " + listBN.get(i).getBenh());
					System.out.println("Phương Pháp chữa bệnh " + ": " + listBN.get(i).getPhuongPhap());
					System.out.println("Ngày vào viện " + ": " + listBN.get(i).getDateIn());
					System.out.println("Ngày ra viện " + ": " + listBN.get(i).getDateOut());
					System.out.println("Tiền phải thanh toán " + ": " + listBN.get(i).getCost());
					System.out.println("===============================================================");
				}
		    }
		 
	 }
	 public static void sumCostAllBN()
	 {
		 double sum = 0;
		 for (int i = 0; i < listBN.size(); i++) 
		 {
			 sum = sum + listBN.get(i).getCost();
		 }
		 System.out.println(sum);
	 }
	 
	 public static void findMaxCost()
	 {
		 double max = listBN.get(0).getCost();
		 for (int i = 0; i < listBN.size(); i++) 
		 {
			  if(listBN.get(i).getCost() > max) {
				  max = listBN.get(i).getCost() ;
			  }
		 }
		 System.out.println(max);
	 }
	 
	 //bác sĩ
	 public static void addBS() {
			BacSi BacSi = new BacSi();
			System.out.println("Số Bác Sĩ bạn muốn thêm là: ");
			int n = Integer.parseInt(sc.nextLine());
			for(int i = 0; i < n ; i++) {
				System.out.println("Nhập tên Bác Sĩ: ");
				BacSi.setTen(sc.nextLine());
				System.out.println("Nhập tuổi Bác Sĩ: ");
				BacSi.setTuoi(Integer.parseInt(sc.nextLine()));
				System.out.println("Nhập giới tính Bác Sĩ: ");
				BacSi.setGioiTinh(sc.nextLine());
				System.out.println("Nhập CMND Bác Sĩ:  ");
				BacSi.setCmnd(sc.nextLine());
				System.out.println("Nhập mã Bác Sĩ");
				BacSi.setMa(sc.nextLine());
				System.out.println("Nhập Khoa của Bác Sĩ: ");
				BacSi.setKhoa(sc.nextLine());
				System.out.println("Nhập ngày vào làm của Bác Sĩ: ");
				BacSi.setDateIn(sc.nextLine());
				System.out.println("Nhập Lương của Bác Sĩ:  ");
				BacSi.setLuong(Double.parseDouble(sc.nextLine()));
				System.out.println("Nhập Phụ Cấp của Bác Sĩ:  ");
				BacSi.setPhuCap(Double.parseDouble(sc.nextLine()));
				listBS.add(BacSi);
				System.out.println("Thêm Thành Công Bác Sĩ!!");
			}
		}
	 public static void showAllBS() {
			for (int i = 0; i < listBS.size(); i++) {
				System.out.println("Bác Sĩ " + (i +1) + ": " + listBS.get(i).getTen());
				System.out.println("Tuổi " + ": " + listBS.get(i).getTuoi());
				System.out.println("Giới Tính " + ": " + listBS.get(i).getGioiTinh());
				System.out.println("Số CMND " + ": " + listBS.get(i).getCmnd());
				System.out.println("Mã Bác Sĩ " + ": " + listBS.get(i).getMa());
				System.out.println("Khoa" + ": " + listBS.get(i).getKhoa());
				System.out.println("Ngày vào viện " + ": " + listBS.get(i).getDateIn());
				System.out.println("Lương " + ": " + listBS.get(i).getLuong());
				System.out.println("Phụ Cấp " + ": " + listBS.get(i).getPhuCap());
				System.out.println("===============================================================");
		    }
		}
	 public static void showBSByKhoa() {
		 String khoa = sc.nextLine();
			for (int i = 0; i < listBS.size(); i++) {
				if(listBS.get(i).getKhoa().equals(khoa)){
				System.out.println("Bác Sĩ " + (i +1) + ": " + listBS.get(i).getTen());
				System.out.println("Tuổi " + ": " + listBS.get(i).getTuoi());
				System.out.println("Giới Tính " + ": " + listBS.get(i).getGioiTinh());
				System.out.println("Số CMND " + ": " + listBS.get(i).getCmnd());
				System.out.println("Mã Bác Sĩ " + ": " + listBS.get(i).getMa());
				System.out.println("Khoa" + ": " + listBS.get(i).getKhoa());
				System.out.println("Ngày vào viện " + ": " + listBS.get(i).getDateIn());
				System.out.println("Lương " + ": " + listBS.get(i).getLuong());
				System.out.println("Phụ Cấp " + ": " + listBS.get(i).getPhuCap());
				System.out.println("===============================================================");
				}
			}
		}
	 public static void changePhuCap() {
		 String maSo = sc.nextLine();
		 double phuCap;
			for (int i = 0; i < listBS.size(); i++) {
				if(listBS.get(i).getMa().equals(maSo)){
					System.out.println("Bác Sĩ " + (i +1) + ": " + listBS.get(i).getTen());
					System.out.println("Mã Bác Sĩ " + ": " + listBS.get(i).getMa());
					System.out.println("Phụ Cấp " + ": " + listBS.get(i).getPhuCap());
					System.out.println("===============================================================");
					System.out.println("Nhập phụ cấp mới: ");
					listBS.get(i).setPhuCap(Double.parseDouble(sc.nextLine()));
					System.out.println("Sửa Phụ Cấp Thành công!!");
				}
			}
	 }
	 public static void deleteBSByMa() {
		 String maSo = sc.nextLine();
			for (int i = 0; i < listBS.size(); i++) {
				if(listBS.get(i).getMa().equals(maSo)){
					listBS.remove(i);
					System.out.println("Xóa thành công bác sĩ có mã" + maSo);
				}
			}
	 }
	 public static void main(String[] args) {
		 while(true) {
			 showMenu();
			 chooseMenu();
		 }
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
