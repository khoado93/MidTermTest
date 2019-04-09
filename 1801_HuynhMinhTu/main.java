import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		View v = new View();
		v.menu();
		System.out.println("Nhập lựa chọn: ");
		int a = sc.nextInt();
		if(a == 1) {
			v.addBn();
		}else if(a == 2) {
			v.showbn();
		}else if(a == 3) {
			v.timBn();
		}else if(a == 4) {
			v.tongTien();
		}else if(a == 5) {
			v.timMax();
		}else if(a == 6) {
			v.timBenh();
		}else if(a == 7) {
			v.addBs();
		}else if(a == 8 ) {
			v.showbs();
		}else if(a ==9) {
			v.timBs();
		}else if(a == 10) {
			v.editBs();
		}else if(a == 11) {
			v.removeBs();
		}else {
			System.out.println("chọn sai chương trình kết thúc");
			System.exit(0);		
		}
	}
}
