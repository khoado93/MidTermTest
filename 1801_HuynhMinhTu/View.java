
import java.util.Scanner;

public class View {
	Scanner sc = new Scanner(System.in);
	Database bn = new Database();
	Database bs = new Database();

	public void addBn() {
		System.out.print("Nhập id bệnh nhân: ");
		int id = sc.nextInt();
		System.out.print("Nhập tên bệnh nhân: ");
		String ten = sc.nextLine();
		System.out.print("Nhập tuổi bệnh nhân: ");
		int tuoi = sc.nextInt();
		System.out.print("Nhập giới tính bệnh nhân: ");
		String gioiTinh = sc.nextLine();
		System.out.print("Nhập chứng minh nhân dân của bệnh nhân: ");
		String cmnd = sc.nextLine();
		System.out.print("Nhập bệnh của bệnh nhân: ");
		String benh = sc.nextLine();
		System.out.print("Nhập phương pháp chữa bệnh: ");
		String pp = sc.nextLine();
		System.out.print("Nhập ngày nhập viện: ");
		String ngayNhap = sc.nextLine();
		System.out.print("Nhập ngày ra viện: ");
		String ngayRa = sc.nextLine();
		System.out.print("Nhập tiền thanh toán: ");
		double tien = sc.nextInt();
		BenhNhan bn = new BenhNhan(ten, tuoi, gioiTinh, cmnd, id, benh, pp, ngayNhap, ngayRa, tien);
		this.bn.addBn(bn);
	}

	public void showbn() {
		if (bn.showAllBn() == null) {
			System.out.println("Không có bệnh nhân nào");
		} else {
			for (int i = 0; i < bn.showAllBn().size(); i++) {
				System.out.println(i + ". " + bn.showAllBn().get(i).getTen());
			}
		}
	}

	public void timBn() {
		System.out.println("Nhập id bênh nhân muốn tìm: ");
		int id = sc.nextInt();
		if(bn.showbn(id) == null) {
			System.out.println("không tìm thấy");
		}else {
			System.out.println("Bệnh nhân cần tìm là: " + bn.showbn(id).getTen());
		}
	}

	public void tongTien() {
		double sum = 0;
		for (int i = 0; i < bn.showAllBn().size(); i++) {
			sum += bn.showAllBn().get(i).getThanhToan();
		}
		System.out.println("Tổng tiền của tất cả bệnh nhân là: " + sum);
	}

	public void timMax() {
		double max = bn.showAllBn().get(0).getThanhToan();
		int flag = 0;
		for (int i = 1; i < bn.showAllBn().size(); i++) {
			if (bn.showAllBn().get(i).getThanhToan() > max) {
				max = bn.showAllBn().get(i).getThanhToan();
				flag = i;
			}
		}
		System.out.println("Bệnh nhân phải trả số tiền cao nhất là: " + bn.showAllBn().get(flag));
	}
	
	public void timBenh() {
		String Benh =  sc.nextLine();
		for(int i = 0; i < bn.showAllBn().size(); i++) {
			if(bn.showAllBn().get(i).getBenh().equals(Benh)) {
				System.out.println("Bệnh nhân có bệnh "+Benh+" là: " + bn.showAllBn().get(i).getTen());
			}
		}
	}
	
	public void addBs() {
		System.out.print("Nhập id bác sỹ: ");
		int id = sc.nextInt();
		System.out.print("Nhập tên bác sỹ: ");
		String ten = sc.nextLine();
		System.out.print("Nhập tuổi bác sỹ: ");
		int tuoi = sc.nextInt();
		System.out.print("Nhập giới tính bác sỹ: ");
		String gioiTinh = sc.nextLine();
		System.out.print("Nhập chứng minh nhân dân của bác sỹ: ");
		String cmnd = sc.nextLine();
		System.out.print("Nhập khoa của bác sỹ: ");
		String khoa = sc.nextLine();
		System.out.print("Nhập ngày vào làm việc: ");
		String ngayNhap = sc.nextLine();
		System.out.print("Nhập lương của bác sỹ: ");
		double luong = sc.nextInt();
		System.out.print("Nhập phụ cấp của bác sỹ: ");
		double phuCap = sc.nextInt();
		BacSy bs = new BacSy(ten, tuoi, gioiTinh, cmnd, id, khoa, ngayNhap, luong, phuCap);
		this.bs.addBs(bs);
	}
	
	public void showbs() {
		if (bs.showAllBs() == null) {
			System.out.println("Không có bệnh nhân nào");
		} else {
			for (int i = 0; i < bs.showAllBn().size(); i++) {
				System.out.println(i + ". " + bs.showAllBs().get(i).getTen());
			}
		}
	}
	public void timBs() {
		System.out.print("Nhập tên bác sỹ: ");
		String ten = sc.nextLine();
		for(int i = 0; i < bs.showAllBs().size(); i++) {
			if(bs.showAllBs().get(i).getTen().equals(ten)) {
				System.out.println("Khoa của bác sỹ " + ten+" là: " + bs.showAllBs().get(i).getKhoa());
			}
		}
	}
	public void editBs() {
		System.out.print("Nhập id bác sỹ: ");
		int id = sc.nextInt();
		System.out.print("Nhập tên bác sỹ: ");
		String ten = sc.nextLine();
		System.out.print("Nhập tuổi bác sỹ: ");
		int tuoi = sc.nextInt();
		System.out.print("Nhập giới tính bác sỹ: ");
		String gioiTinh = sc.nextLine();
		System.out.print("Nhập chứng minh nhân dân của bác sỹ: ");
		String cmnd = sc.nextLine();
		System.out.print("Nhập khoa của bác sỹ: ");
		String khoa = sc.nextLine();
		System.out.print("Nhập ngày vào làm việc: ");
		String ngayNhap = sc.nextLine();
		System.out.print("Nhập lương của bác sỹ: ");
		double luong = sc.nextInt();
		System.out.print("Nhập phụ cấp của bác sỹ: ");
		double phuCap = sc.nextInt();
		BacSy bs = new BacSy(ten, tuoi, gioiTinh, cmnd, id, khoa, ngayNhap, luong, phuCap);
		for(int i = 0; i < this.bs.showAllBs().size(); i++) {
			if(this.bs.showAllBs().get(i).getBacSyId() == id) {
				this.bs.showAllBs().set(i, bs);
			}
		}
	}
	public void removeBs() {
		System.out.print("Nhập id bác sỹ: ");
		int id = sc.nextInt();
		for(int i = 0; i < bs.showAllBs().size(); i++) {
			if(bs.showAllBs().get(i).getBacSyId()==id) {
				bs.showAllBn().remove(i);
			}
		}
	}
	
	public void menu() {
		System.out.println("1. Thêm mới hồ sơ bệnh nhân");
		System.out.println("2. Hiển thị thông tin tất cả bệnh nhân");
		System.out.println("3. Hiển thị hồ sơ của bệnh nhân với mã bệnh nhân nhập từ bàn phím");
		System.out.println("4. Tính tổng các số tiền của tất cả bệnh nhân");
		System.out.println("5. Tìm bệnh nhân có tiền trả nhiều nhất");
		System.out.println("6. TÌm các bệnh nhân có bệnh tương ứng nhập từ bàn phím");
		System.out.println("7. Thêm mới nhân viên");
		System.out.println("8. Hiển thị tất cả bác sỹ");
		System.out.println("9. Hiển thị bác sỹ với khoa tương ứng nhập từ bàn phím");
		System.out.println("10. Sửa phụ cấp cho bác sỹ tương ứng với mã bác sỹ nhập từ bàn phím");
		System.out.println("11. Xóa bác sỹ với mã tương ứng");
	}
}
