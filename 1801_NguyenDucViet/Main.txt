import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        List<BacSy> lstBS = new ArrayList<>();
        List<BenhNhan> lstBN = new ArrayList<>();
        BenhNhan benhNhan = new BenhNhan();
        BacSy bacSy = new BacSy();
        boolean pause = false;
        while (!pause) {
            System.out.println("Benh nhan\n" +
                    "1/ Thêm mới hồ sơ bệnh nhân\n" +
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
                    "10/ Sửa phụ cấp cho bác sỹ tương ứng với mã bác sỹ nhập từ bàn phím\n" +
                    "11/ Xóa bác sỹ với mã tương ứng");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    benhNhan.nhap();
                    lstBN.add(benhNhan);
                    break;
                case 2:
                    for (BenhNhan benhNhan1:lstBN){
                        benhNhan.xuat(benhNhan1);
                    }
                    break;
                case 3:
                    System.out.println("Nhap ma benh nhan:");
                    String maBn = sc.nextLine();
                    for (BenhNhan benhNhan1:lstBN){
                        if (maBn.equals(benhNhan1.getMaBN())){
                            benhNhan.xuat(benhNhan1);
                        }
                    }
                    break;
                case 4:
                    double sum = 0;
                    for (BenhNhan benhNhan1:lstBN){
                        sum = sum+ benhNhan1.getTienThanhToan();
                    }
                    System.out.println("Tong tien thanh toan: "+sum);
                    break;
                case 5:
                    double max = 0;
                    int indexMax = 0;
                    for (int i=0;i<lstBN.size();i++){
                        if (max<lstBN.get(i).getTienThanhToan()){
                            max = lstBN.get(i).getTienThanhToan();
                            indexMax =i;
                        }
                    }
                    benhNhan.xuat(lstBN.get(indexMax));
                    break;
                case 6:
                    System.out.println("Benh can tim:");
                    String benhLy = sc.nextLine();
                    for (BenhNhan benhNhan1:lstBN){
                        if (benhLy.equals(benhNhan1.getBenh())){
                            benhNhan.xuat(benhNhan1);
                        }
                    }
                    break;
                case 7:
                    bacSy.nhap();
                    lstBS.add(bacSy);
                    break;
                case 8:
                    for (BacSy bacSy1:lstBS){
                        bacSy.xuat(bacSy1);
                    }
                    break;
                case 9:
                    System.out.println("Khoa can tim:");
                    String khoa = sc.nextLine();
                    for (BacSy bacSy1:lstBS){
                        if (khoa.equals(bacSy1.getKhoa())){
                            bacSy.xuat(bacSy1);
                        }
                    }
                    break;
                case 10:
                    System.out.println("Ma bac sy can sua:");
                    String maBS = sc.nextLine();
                    for (BacSy bacSy1:lstBS){
                        if (maBS.equals(bacSy1.getMaBS())){
                            System.out.println("Phu cap can sua:");
                            String phuCap = sc.nextLine();
                            bacSy1.setMaBS(phuCap);
                        }
                    }
                    break;
                case 11:
                    System.out.println("Ma bac sy can sua:");
                    String maBSD = sc.nextLine();
                    for (BacSy bacSy1:lstBS){
                        if (maBSD.equals(bacSy1.getMaBS())){
                            lstBS.remove(bacSy1);
                        }
                    }
                    break;
                default:
                    pause = true;
                    break;

            }
        }
    }
}
