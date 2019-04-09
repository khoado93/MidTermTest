import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class HoSoChung {
	public static ArrayList<BenhNhan> BenhNhan = new ArrayList<BenhNhan>();
	public static ArrayList<BacSy> BacSy = new ArrayList<BacSy>();
	public static Scanner so = new Scanner(System.in);
	public static Scanner chu = new Scanner(System.in);

	public static void main(String[] args) {
		boolean xet = true;
		System.out.println("1. Thêm m?i h? so b?nh nhân");
		System.out.println("2. Hi?n th? thông tin t?t c? b?nh nhân");
		System.out.println("3. Hi?n th? thông tin b?nh nhân v?i mã tuong ?ng");
		System.out.println("4. Tính t?ng s? ti?n c?a t?t c? b?nh nhân");
		System.out.println("5. Tìm b?nh nhân có ti?n tr? cao nh?t");
		System.out.println("6. Tìm b?nh nhân có b?nh tuong ?ng");
		System.out.println("7. Thêm m?i bác s?");
		System.out.println("8. Hi?n th? t?t c? bác s?");
		System.out.println("9. Hi?n th? bác s? v?i khoa tuong ?ng");
		System.out.println("10. S?a ph? c?p cho bác s? tuong ?ng");
		System.out.println("11. Xóa bác s? v?i mã tuong ?ng");
		
		BenhNhan bn1 = new BenhNhan();
		BenhNhan bn2 = new BenhNhan();
		BacSy bs1 = new BacSy();
		BenhNhan.add(bn1);
		BenhNhan.add(bn2);
		
		BacSy.add(bs1);
		do {
			System.out.println("---------");
			int choose= so.nextInt();

			switch (choose) {
			case 1:
				cau1();
				break;
			case 2:
				cau2();
				break;
			case 3:
				cau3();
				break;
			case 4:
				cau4();
				break;
			case 5:
				cau5();
				break;
			case 6:
				cau6();
				break;
			case 7:
				cau7();
				break;
			case 8:
				cau8();
				break;
			case 9:
				cau9();
				break;
			case 10:
				cau10();
				break;
			case 11:
				cau11();
				break;
			default:
				System.out.println("T?m bi?t!");
				xet = false;
				break;
			}
		} while (xet);
	}

	public static void cau1() {
		BenhNhan BN = new BenhNhan();
		System.out.println("Nh?p tên : ");
		BN.setten(chu.nextLine());
		System.out.println("Nh?p tu?i : ");
		BN.setTen(so.nextInt());
		System.out.println("Nh?p gi?i tính : ");
		BN.setGioiTinh(chu.nextLine());
		System.out.println("Nh?p cmnd : ");
		BN.setcmnd(so.nextInt());
		boolean vongLap = true;
		boolean xett = true;
		do {
			System.out.println("Nh?p mã : ");
			int maNhap = so.nextInt();
			for (int i = 0; i < BenhNhan.size(); i++) {
				if (BenhNhan.get(i).getmaBN() == maNhap) {
					xett = false;
					break;
				} else {
					xett = true;
				}
			}
			if (xett) {
				BN.setMa(maNhap);
				vongLap = false;
			} else {
				System.out.println("Mã b? trùng,vui lòng nh?p l?i!");
			}
			
		} while (vongLap);
		
	
		System.out.println("Nh?p b?nh : ");
		BN.setmaBN(chu.nextLine());
		System.out.println("Nh?p phuong pháp ch?a : ");
		BN.setPPhap(chu.nextLine());
		System.out.println("Nh?p ngày nh?p vi?n : ");
		BN.setngayNhap(chu.nextLine());
		System.out.println("Nh?p ngày xu?t vi?n : ");
		BN.setngayNhap(chu.nextLine());
		System.out.println("Nh?p ti?n ph?i tr? : ");
		BN.setTienTT(so.nextInt());
		BenhNhan.add(BN);
	}
	public static void cau2() {
		if (BenhNhan.size() == 0) {
			System.out.println("Danh sách tr?ng");
		} else {

			for (int i = 0; i < BenhNhan.size(); i++) {
				BenhNhan.get(i).xuat();
			}
		}
	}


	public static void cau3() {
		if (BenhNhan.size() == 0) {
			System.out.println("Danh sách tr?ng");
		} else {
			System.out.println("Nh?n mã c?n tìm");
			int choiseMa = chu.nextInt();
			
			for (int i = 0; i < BenhNhan.size(); i++) {
				if (choiseMa == BenhNhan.get(i).getmaBN()) {
					BenhNhan.get(i).xuat();
				}
			}
		}
	}

	public static void cau4() {
		if (BenhNhan.size() == 0) {
			System.out.println("Danh sách tr?ng");
		} else {
			int sum = 0;
			for (BenhNhan a : BenhNhan) {
				sum = sum + a.getTienTT();
			}
			System.out.println("T?ng ti?n là : " + sum); 
		}
	}

	public static void cau5() {
		if (BenhNhan.size() == 0) {
			System.out.println("Danh sách tr?ng");
		} else {
			Collections.sort(BenhNhan, new Comparator<BenhNhan>() {
				public int compare(BenhNhan bn1, BenhNhan bn2) {
					if (bn1.getTienTT() < bn2.getTienTT()) {
						return 1;
					} else {
						if (bn1.getTienTT() == bn2.getTienTT()) {
							return 0;
						} else {
							return -1;
						}
					}
				}
			});
			System.out.println("B?nh nhân có ti?n tr? cao nh?t là : " );
			BenhNhan.get(BenhNhan.size()-1).xuat();
		}
	}

	public static void cau6() {
		if (BenhNhan.size() == 0) {
			System.out.println("Danh sách tr?ng");
		} else {
			System.out.println("Nh?p b?nh c?n tìm");
			String benhCanTim = chu.nextLine();
			
			for (int i = 0; i < BenhNhan.size(); i++) {
				if (benhCanTim.equals(BenhNhan.get(i).getmaBN())) {
					BenhNhan.get(i).xuat();
				}
			}
		}
	}



	public static void cau7() {
		BacSy BS = new BacSy();
		System.out.println("Nh?p tên : ");
		BS.setTen(chu.nextLine());
		System.out.println("Nh?p tu?i : ");
		BS.setTen(so.nextInt());
		System.out.println("Nh?p gi?i tính : ");
		BS.setGioiTinh(chu.nextLine());
		System.out.println("Nh?p cmnd : ");
		BS.setCmnd(so.nextInt());
		System.out.println("Nh?p mã : ");
		BS.setMa(so.nextInt());
		System.out.println("Nh?p khoa : ");
		BS.setKhoa(chu.nextLine());
		System.out.println("Nh?p ngày b?t d?u : ");
		BS.setNgayBatDau(chu.nextLine());
		System.out.println("Nh?p luong : ");
		BS.setLuong(so.nextInt());
		System.out.println("Nh?p ph? c?p : ");
		BS.setPhuCap(so.nextInt());
		BacSy.add(BS);
	}


	public static void cau8() {
		if (BacSy.size() == 0) {
			System.out.println("Danh sách tr?ng");
		} else {

			for (int i = 0; i < BacSy.size(); i++) {
				BacSy.get(i).xuat();
			}
		}
	}

	public static void cau9() {
		if (BacSy.size() == 0) {
			System.out.println("Danh sách tr?ng");
		} else {
			System.out.println("Nh?p khoa c?n tìm");
			String khoaCanTim = chu.nextLine();
			
			for (int i = 0; i < BacSy.size(); i++) {
				if (khoaCanTim.equals(BacSy.get(i).getKhoa())) {
					BacSy.get(i).xuat();
				}
			}
		}
	}

	
	public static void cau10() {
		if (BacSy.size() == 0) {
			System.out.println("Danh sách tr?ng");
		} else {
			System.out.println("Nh?p mã bác s?");
			int maCanTim = so.nextInt();
			
			for (int i = 0; i < BacSy.size(); i++) {
				if (maCanTim == BacSy.get(i).getmaBN()) {
					BacSy.get(i).xuat();
					System.out.println("Nh?p ph? c?p c?n thay d?i");
					BacSy.get(i).setPhuCap(so.nextInt());
				}
			}
		}
	}

	public static void cau11() {
		if (BacSy.size() == 0) {
			System.out.println("Danh sách tr?ng");
		} else {
			System.out.println("Nh?p mã bác s? c?n xóa");
			int maCanTim = so.nextInt();
			
			for (int i = 0; i < BacSy.size(); i++) {
				if (maCanTim == BacSy.get(i).getmaBN()) {
					BacSy.remove(i);
					System.out.println("Ðã xóa bác s? v?i mã s? " + maCanTim);
				}
			}
		}
	}
}