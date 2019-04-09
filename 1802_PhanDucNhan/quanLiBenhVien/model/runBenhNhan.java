package quanLiBenhVien.model;

import java.util.ArrayList;
import java.util.Scanner;

public class runBenhNhan {
	private ArrayList<BenhNhan> data;
	
	public runBenhNhan() {
		data = new ArrayList<>();
	}
	
	public void them() {
		while(true) {
			BenhNhan bn = new BenhNhan();
			System.out.println("MÃ - TÊN - TUỔI - GIỚI TÍNH - CMND - BỆNH - PHƯƠNG PHÁP - NGÀY NHẬP - NGÀY XUẤT - TIỀN THANH TOÁN");
			bn.setMa(new Scanner(System.in).nextInt());
			bn.setTen(new Scanner(System.in).nextLine());
			bn.setTuoi(new Scanner(System.in).nextInt());
			bn.setGioiTinh(new Scanner(System.in).nextInt());
			bn.setCmnd(new Scanner(System.in).nextLong());
			bn.setBenh(new Scanner(System.in).nextLine());
			bn.setPhuongPhap(new Scanner(System.in).nextLine());
			bn.setNgayNhapVien(new Scanner(System.in).nextLine());
			bn.setNgayXuatVien(new Scanner(System.in).nextLine());
			bn.setTienThanhToan(new Scanner(System.in).nextDouble());
			
			this.add(bn);
			System.out.println("Tiếp không (c/k");
			String check = new Scanner(System.in).nextLine();
			if(check.equals("k")) {
				break;
			}
		}
	}
	
	public void add(BenhNhan a) {
		data.add(a);
	}
	
	public void printlnn() {
		for(BenhNhan d : data) {
			System.out.println(d);
		}
	}
	
	public String println_value(int ma) {
		for(BenhNhan d : data) {
			if(d.getMa() == ma) {
				return "Kết quả: " + d;
			}
		}
		return "Kết quả: không có";
	}
	
	public double sum() {
		double sum = 0;
		for(BenhNhan d : data) {
			sum += d.getTienThanhToan();
		}
		return sum;
	}
	
	public String sum_max() {
		int id = 0;
		double max = data.get(id).getTienThanhToan();
		for (int i = 1; i < data.size(); i++) {
			if(data.get(i).getTienThanhToan() > max) {
				id = i;
			}
		}
		return "Kết quả: " + data.get(id);
	}
	
	public String println_benh(String benh) {
		for(BenhNhan d : data) {
			if(d.getBenh().equals(benh)) {
				return "Kết quả: " + d;
			}
		}
		return "Kết quả: không có";
	}
}
