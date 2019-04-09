package quanLiBenhVien.model;

import java.util.ArrayList;
import java.util.Scanner;

public class runNhanVien {
	private ArrayList<NhanVien> data;
	
	public runNhanVien() {
		data = new ArrayList<>();
	}
	
	public void them() {
		while(true) {
			NhanVien bn = new NhanVien();
			System.out.println("MÃ - TÊN - TUỔI - GIỚI TÍNH - CMND - KHOA - NGÀY - LƯƠNG - PHỤ CẤP");
			bn.setMa(new Scanner(System.in).nextInt());
			bn.setTen(new Scanner(System.in).nextLine());
			bn.setTuoi(new Scanner(System.in).nextInt());
			bn.setGioiTinh(new Scanner(System.in).nextInt());
			bn.setCmnd(new Scanner(System.in).nextLong());
			bn.setKhoa(new Scanner(System.in).nextLine());
			bn.setNgayBatDauLam(new Scanner(System.in).nextLine());
			bn.setLuong(new Scanner(System.in).nextDouble());
			bn.setPhuCap(new Scanner(System.in).nextDouble());
			
			this.add(bn);
			System.out.println("Tiếp không (c/k");
			String check = new Scanner(System.in).nextLine();
			if(check.equals("k")) {
				break;
			}
		}
	}
	
	public void add(NhanVien e) {
		data.add(e);
	}
	
	public void printlnn() {
		for(NhanVien d : data) {
			System.out.println(d);
		}
	}
	
	public String println_value(int ma) {
		for(NhanVien d : data) {
			if(d.getMa() == ma) {
				return "Kết quả: " + d;
			}
		}
		return "Kết quả: không có";
	}
	
	public void editPhuCap(int ma, double money) {
		for(NhanVien d : data) {
			if(d.getMa() == ma) {
				d.setPhuCap(money);
			}
		}
	}
	
	public void del(int ma) {
		for (int i = 0; i < data.size(); i++) {
			if(data.get(i).getMa() == ma) {
				data.remove(i);
			}
		}
	}
	
}
