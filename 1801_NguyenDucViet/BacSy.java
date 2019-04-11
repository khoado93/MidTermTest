import java.util.Scanner;

public class BacSy extends ConNguoi {
    Scanner sc = new Scanner(System.in);
    private String maBS;
    private String khoa;
    private String ngayBatDauVaoLam;
    private double luong;
    private double phuCap;

    public void nhap() {
        super.nhap();
        System.out.print("Nhap ma bac sy: ");
        this.maBS = sc.nextLine();
        System.out.print("Nhap khoa: ");
        this.khoa = sc.nextLine();
        System.out.print("Nhap ngay vao lam: ");
        this.ngayBatDauVaoLam = sc.nextLine();
        System.out.print("Nhap luong: ");
        this.luong = sc.nextDouble();
        System.out.print("Nhap phuCap: ");
        this.phuCap = sc.nextDouble();
    }


    public void xuat(BacSy bacSy) {
        super.xuat(bacSy);
        System.out.println("Ma bac sy: " + bacSy.maBS);
        System.out.println("Khoa: " + bacSy.khoa);
        System.out.println("Ngay vao lam viec: " + bacSy.ngayBatDauVaoLam);
        System.out.println("Luong: " + bacSy.luong);
        System.out.println("Phu cap: " + bacSy.phuCap);
    }

    public String getMaBS() {
        return maBS;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setMaBS(String maBS) {
        this.maBS = maBS;
    }
}
