package quanLiBenhVien.model;

import java.util.Scanner;

public class runAll {

	public void menu() {
		runBenhNhan rbn = new runBenhNhan();
		runNhanVien rnv = new runNhanVien();
		while(true) {
			System.out.println("Cac tinh nang:\r\n" + 
					"Benh nhan\r\n" + 
					"1/ Thêm mới hồ sơ bệnh nhân\r\n" + 
					"2/ Hiển thị thông tin tất cả bệnh nhân\r\n" + 
					"3/ Hiển thị hồ sơ của bệnh nhân với mã bệnh nhân nhập từ bàn phím\r\n" + 
					"4/ Tính tổng các số tiền của tất cả bệnh nhân\r\n" + 
					"5/ Tìm bệnh nhân có tiền trả nhiều nhất\r\n" + 
					"6/ TÌm các bệnh nhân có bệnh tương ứng nhập từ bàn phím\r\n" + 
					"\r\n" + 
					"NhanVien\r\n" + 
					"7/ Thêm mới nhân viên\r\n" + 
					"8/ Hiển thị tất cả bác sỹ\r\n" + 
					"9/ Hiển thị bác sỹ với khoa tương ứng nhập từ bàn phím\r\n" + 
					"10/ Sửa phụ cấp cho bác sỹ tương ứng với mã bác sỹ nhập từ bàn phím\r\n" + 
					"11/ Xóa bác sỹ với mã tương ứng");
			int check = new Scanner(System.in).nextInt();
			switch (check) {
			case 1:
				rbn.them();
				break;
			case 2:
				rbn.printlnn();
				break;
			case 3:
				System.out.println("Nhập id ^^");
				int ma = new Scanner(System.in).nextInt();
				System.out.println(rbn.println_value(ma));
				break;
			case 4:
				System.out.println(rbn.sum());
				break;
			case 5:
				System.out.println(rbn.sum_max());
				break;
			case 6:
				System.out.println("Nhập bệnh");
				String benh = new Scanner(System.in).nextLine();
				rbn.println_benh(benh);
				break;
			case 7:
				rnv.them();
				break;
			case 8:
				rnv.printlnn();
				break;
			case 9:
				System.out.println("Nhập id ^^");
				int maNV = new Scanner(System.in).nextInt();
				System.out.println(rnv.println_value(maNV));
				break;
			case 10:
				System.out.println("Nhập id ^^");
				int maNVV = new Scanner(System.in).nextInt();
				System.out.println("Nhập id ^^");
				double phuCap = new Scanner(System.in).nextDouble();
				rnv.editPhuCap(maNVV,phuCap);
				break;
			case 11:
				System.out.println("Nhập id ^^");
				int maNVVV = new Scanner(System.in).nextInt();
				rnv.del(maNVVV);
				break;
			case 12:
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}

}
