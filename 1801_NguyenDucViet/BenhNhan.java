import java.util.Scanner;

public class BenhNhan extends ConNguoi {
    Scanner sc = new Scanner(System.in);
    private String maBN;
    private String benh;
    private String phuongPhapChuaBenh;
    private String ngayNhapVien;
    private String ngayRaVien;
    private double tienThanhToan;

    public void nhap() {
        super.nhap();
        System.out.print("Nhap ma benh nhan: ");
        this.maBN = sc.nextLine();
        System.out.print("Nhap benh ly: ");
        this.benh = sc.nextLine();
        System.out.print("Nhap phuong phap chua benh: ");
        this.phuongPhapChuaBenh = sc.nextLine();
        System.out.print("Nhap ngay vao vien: ");
        this.ngayNhapVien = sc.nextLine();
        System.out.print("Nhap ngay ra vien: ");
        this.ngayRaVien = sc.nextLine();
        System.out.print("Nhap tien can tra: ");
        this.tienThanhToan = sc.nextDouble();
    }

    public void xuat(BenhNhan benhNhan) {
        super.xuat(benhNhan);
        System.out.println("Ma benh nhan: " + benhNhan.maBN);
        System.out.println("Benh ly: " + benhNhan.benh);
        System.out.println("Phuong phap chua benh: " + benhNhan.phuongPhapChuaBenh);
        System.out.println("Ngay nhap vien: " + benhNhan.ngayNhapVien);
        System.out.println("Ngay ra vien: " + benhNhan.ngayRaVien);
        System.out.println("Tien thanh toan: " + benhNhan.tienThanhToan);
    }

    public double getTienThanhToan() {
        return tienThanhToan;
    }

    public String getMaBN() {
        return maBN;
    }

    public String getBenh() {
        return benh;
    }
}
