import java.util.*;

public class DanhSach(){
		ArrayList<ConNguoi> Hoso = new ArrayList<ConNguoi>();
	public HoSo(){
		Scanner scanner = new Scanner(System.in);
	}

	// 1 them moi benh nha
	public void themBenhNhan( ConNguoi ConNguoi){
		ConNguoi = new BenhNhan;
		HoSo.add(ConNguoi);
	}

	//2 hien thi tat ca benh nha
	public void hienThiBenhNhan() {
		for (int i = 0; i < HoSo.size(); i++) {
			HoSo.get(i).xuat();
		}
	}

	//3 hien thi benh nhan vua nhap
	public void hienThiBenhNhanVuaNhap(){
		ConNguoi cn1 = new ConNguoi;
		HoSo.add(cn1);
	System.out.println("Benh Nhan vua nhap la");
		for I(i = 0; i < HoSo.size(); i++){
			System.out.print("Benh nhan thu " + i);
			System.out.print("Ten" = HoSo.get(cn1)+	);
		}	
	}

	// 4 tinh tong so tien benh nhan
	// 5 tim benh nha co so tien tra nhieu nhat
	// 6 tinh benh nhan nhap tu ban phim

	//7 Them moi bac sy
	public void themBacSy(ConNguoi ConNguoi){
		ConNguoi = new BacSy;
		HoSo.add(ConNguoi);
	}

	//8 hien thi bac sy 
	public void hienThiBacSy(){
		
	}
	// 9 hien thi bac sy voi khoa tuong ung nhap tu ban phim
	// 10 sua phu cao cho bac sy tu ban phim
	// xoa bac sy voi ma tuong ung

	public void menu() {
		int chooseMenu;
		while (true) {
			System.out.println(" Benh Nhan)
			System.out.println("1/ Th�m m?i h? so b?nh nh�n");
			System.out.println("2/ Hi?n th? th�ng tin t?t c? b?nh nh�n");
			System.out.println("3/ Hi?n th? h? so c?a b?nh nh�n v?i m� b?nh nh�n nh?p t? b�n ph�m");
			System.out.println("4/ T�nh t?ng c�c s? ti?n c?a t?t c? b?nh nh�n");
			System.out.println("5/ T�m b?nh nh�n c� ti?n tr? nhi?u nh?t");
			System.out.println("6/ T�m c�c b?nh nh�n c� b?nh tuong ?ng nh?p t? b�n ph�m");
			System.out.println("Bac Sy")
			System.out.println("7/ Th�m m?i b�c s?");
			System.out.println("8/ Hi?n th? t?t c? b�c s?");
			System.out.println("9/ Hi?n th? b�c s? v?i khoa tuong ?ng nh?p t? b�n ph�m");
			System.out.println("10/ S?a ph? c?p cho b�c s? tuong ?ng v?i m� b�c s? nh?p t? b�n ph�m");
			System.out.println("11/ X�a b�c s? v?i m� tuong ?ng");
			System.out.println("M?i L?a Ch?n");
		chooseMenu = Integer.parseInt(sc.nextLine());
			switch (chooseMenu) {
			case 1:
				ConNguoi ConNguoi = nhapSinhVien();
				themBenhNhan(ConNguoi );
				break;
			case 2:
				hienThiBenhNhan();
				break;
			case 3:
				hienThiBenhNhanVuaNhap();
				break;
			case 4:
				tongSoTienBenhNhan();
				break;
			case 5:
				benhNhanhTraTienNhieu;
				break;
			case 6:
				timBenhNhan();
				break;
			case 7:
				ThemBacSy();
				break;
			case 8:
				hienThiBacSy();
				break;
			case 9:
				hienthiBacSyVuaNhap();
				break;
			case 10:
				suaPhuCap();
				break;
			case 11:
				xoaBacSy();
				break;
			default:
				System.out.println("L?a Ch?n kh�ng kh?p.");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
			HoSo HoSo = new HoSo ();
			HoSo .menu();
		}
	

}