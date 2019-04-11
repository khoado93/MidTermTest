import java.util.Scanner;

public class ConNguoi {
    Scanner sc = new Scanner(System.in);
    private String ten;
    private String tuoi;
    private String gioiTinh;
    private String chungMinhNhanDan;

    public void nhap() {
        System.out.print("Nhap ten: ");
        this.ten = sc.nextLine();
        System.out.print("Nhap tuoi");
        this.tuoi = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        this.gioiTinh = sc.nextLine();
        System.out.print("Nhap so CMND: ");
        this.chungMinhNhanDan = sc.nextLine();
    }

    public void xuat(ConNguoi conNguoi) {
        System.out.println("Ten: " + conNguoi.ten);
        System.out.println("Tuoi: " + conNguoi.tuoi);
        System.out.println("Gioi tinh: " + conNguoi.gioiTinh);
        System.out.println("CMND: " + conNguoi.chungMinhNhanDan);
    }

}
